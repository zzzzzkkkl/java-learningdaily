package zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;



public class ZipStreamDemo3 {
    public static void main(String[] args)
    throws IOException {
        /*
         *   压缩流
         *      需求：把D:\\aaa文件夹压缩成一个压缩包 考虑子文件
         * */
        //创建File对象表示要压缩的文件夹
        File src=new File("D:\\aaa");
        //创建File对象表示压缩包放在哪里 即D:\\
        File destParent=src.getParentFile();
        //创建File对象表示压缩包的路径
        //参数一：压缩包要放的位置
        //参数二：压缩包的名字 即路径
        File dest=new File(destParent,src.getName()+".zip");
        //创建压缩流 关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(dest));
        //获取src里的每一个文件，变成ZipEntry对象 放到压缩包里
        toZip(src,zos,src.getName());
        zos.close();
    }
    /*
    作用：获取src里的每一个文件，变成ZipEntry对象，放到压缩包
    参数一：数据源
    参数二：压缩输出流
    参数三：压缩包内的路径
     */
    public static void toZip(File src,ZipOutputStream zos,String name)
    throws IOException{
        //1.进入src源文件
        File[] files=src.listFiles();
        //遍历文件数组
        for (File file : files) {
            if(file.isFile()){
                //是文件 直接变成entry
                ZipEntry entry=new ZipEntry(name+"\\"+file.getName());
                //把entry放到流里
                zos.putNextEntry(entry);
                //读取entry里的数据 放到压缩包
                FileInputStream fis=new FileInputStream(file);
                int b;
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else{
                //是文件夹
                //递归
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
    }
}
