package file;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        //绝对路径和相对路径

        //传入一个绝对路径 创建文件
        File f=new File("D:\\bbb.java");
        System.out.println(f.getAbsolutePath());

        //传入一个相对路径 创建项目下的文件
        File f2=new File("bbb.java");
        System.out.println(f2.getAbsolutePath());
    }
}
