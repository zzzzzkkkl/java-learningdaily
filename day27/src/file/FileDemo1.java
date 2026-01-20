package file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //构造方法

        //文件路径名
        //将给定的 路径名字符串 转换为抽象路径名 来创建新的File实例
        String pathname="D:\\aaa.txt";
        File file1=new File(pathname);

        //文件路径名
        String pathname2="D:\\aaa\\bbb.txt";
        File file2=new File(pathname2);

        //通过父路径和子路径字符串
        //从 父路径名字符串 和 子路径名字符串 创建新的File实例
        String parent="d:\\aaa";
        String child="bbb.txt";
        File file3=new File(parent,child);

        //通过父级File对象和子路径字符串
        //从父抽象路径名 和 子路径名字符串 创建新的File实例
        File parentDir=new File("d:\\aaa");
        String child2="bbb.txt";
        File file4=new File(parentDir,child2);
    }
}
