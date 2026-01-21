package IO.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        //拷贝一个文件夹 考虑子文件夹

        //1.创建文件 表示数据源
        File src=new File("D:\\aaa\\src");
        //2.创建对象表示目的地
        File dest=new File("D:\\aaa\\dest");
        //3.调用方法 开始拷贝

    }
    private static void copydir(File src,File dest)
        throws IOException{
        //目的地 创建目录
        dest.mkdirs();
        //递归
        //1.源数据 转化为文件数组
        File[] files=src.listFiles();
        //2.遍历文件数组
        for (File file : files) {
            if(file.isFile()){
                //3.是文件,拷贝
                //创建输入流
                FileInputStream fis=new FileInputStream(file);
                //根据file的名字在dest创建输出流,这样就保证原来是什么名字，复制过去还是什么名字
                FileOutputStream fos=new FileOutputStream(new File(dest,file.getName()));
                //创建字节数组
                byte[] bytes=new byte[1024];
                int len;
                //遍历文件的每一个字节 读取到内存
                while((len=fis.read(bytes))!=-1){
                    //没有遍历到最后一个字节
                    //就把他从内存写入到文件
                    fos.write(bytes,0,len);
                }
                //先开后关
                fos.close();
                fis.close();
            }else{
                //3.不是文件 递归
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}
