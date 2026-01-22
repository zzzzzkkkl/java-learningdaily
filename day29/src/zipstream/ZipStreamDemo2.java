package zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args)
    throws IOException {
        /*
         *   压缩流
         *      需求：把D:\\a.txt打包成一个压缩包 不考虑子文件
         * */
        //1.创建File对象表示要压缩的文件
        File src=new File("D:\\aaa.txt");
        //2.创建File独享表示压缩包的位置
        File dest=new File("D:\\");

        toZip(src,dest);
    }

    public static void toZip(File src, File dest)
    throws IOException{
        //1.现在内存创建压缩书橱流 关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"aaa.zip")));
        //2.创建ZipEntry对象 表示压缩包里面的每个条目 参数：创建一个压缩包的虚拟路径
        //虚拟路径=本地相对路径
        //自己可以完全自定义文件再压缩包里的路径，和本地结构无关
        ZipEntry entry=new ZipEntry("aaa\\bbb\\aaa.txt");
        //3.把ZipEntry对象放到压缩流里 相当于把虚拟路径写入压缩包
        zos.putNextEntry(entry);
        //4.把src文件中的数据写道压缩包当中
        FileInputStream fis=new FileInputStream(src);
        int b;
        while((b=fis.read())!=-1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
