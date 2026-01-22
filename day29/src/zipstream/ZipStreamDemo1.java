package zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args)
    throws IOException {
        //1.创建一个File表示要解压的压缩包
        File src=new File("D:\\aaa.zip");
        //2.创建一个File表示解压的目的地
        File dest=new File("D:\\");

        //调用方法
        unzip(src,dest);

    }
    //解压
    public static void unzip(File src,File dest)
    throws IOException{
        //解压的本质：把压缩包里的文件读取出来到内存，按照层级拷贝到目的地
        //创建一个解压缩流来读取压缩包中的数据
        ZipInputStream zip=new ZipInputStream(new FileInputStream(src));
        //先获取压缩包里的每一个zipentry对象
        //依次表示压缩包里获取到的每个条目 包括文件夹和文件 所以if里不用递归
        ZipEntry entry;
        while((entry=zip.getNextEntry())!=null){
            System.out.println(entry);
            if(entry.isDirectory()){
                //压缩包不空，拿到里面的东西是一个文件夹
                //在目的地创建一个同样的文件夹 根据这个文件夹的名字 即路径
                File file=new File(dest,entry.toString());
                file.mkdirs();
            }else{
                //是文件
                //写出到目的地 在目的地创建一个一样的文件
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b= zip.read())!=-1){
                    //没有到最后一个文件
                    //利用输出流 写出到dest
                    fos.write(b);
                }
                fos.close();
                //压缩包的最后一个文件处理完毕了
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
