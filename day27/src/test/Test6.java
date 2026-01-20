package test;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        //需求：统计一个文件夹的总大小
        File file=new File("D:\\aaa\\src");
        System.out.println(getLen(file));
    }
    public static long getLen(File src){
        long len=0;
        //遍历文件夹 是文件就len++
        File[] files=src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                //是文件 累加当前文件大小
                len=len+file.length();
            }else{
                //是文件夹
                len=len+getLen(file);
            }
        }
        return len;
    }
}
