package file;

import java.io.File;
import java.io.IOException;

public class FileDemo5 {
    public static void main(String[] args)
    throws IOException {
        //文件创建
        File f=new File("aaa.txt");
        System.out.println("是否存在："+f.exists());
        System.out.println("是否创建:"+f.createNewFile());
        System.out.println("是否存在："+f.exists());

        /*
        就是之前写的那种都是只在内存里创建了，但是磁盘里没有。
        然后这里是因为createNewFile，磁盘里没有，所以在磁盘里创建了
         */
        //目录的创建
        File f2=new File("newDir");
        System.out.println("是否存在："+f2.exists());
        System.out.println("是否创建："+f2.mkdir());
        System.out.println("是否存在:"+f2.exists());

        //创建多级目录
        File f3=new File("newDira\\newDirb");
        System.out.println(f3.mkdir());//false
        File f4= new File("newDira\\newDirb");
        System.out.println(f4.mkdirs());// true

        //删除文件
        System.out.println(f.delete());
        //删除目录
        System.out.println(f2.delete());
        System.out.println(f4.delete());
    }
}
