package test;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        //需求：如果我们要删除一个有内容的文件夹1.先删除文件夹里面所有的内容
        //2.再删除自己
        File file=new File("D\\aaa\\src");
        delete(file);
    }
    //删除src文件夹
    public static void delete(File src){
        //遍历文件夹 把文件夹里的内容删除
        File[] files=src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                //是文件夹 就递归
                delete(file);
            }
        }
        //最后删除自己
        src.delete();
    }
}
