package test;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //需求：找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）
        /*
        套路：
        进入文件及-遍历数组-判断-判断
         */
    }
    public static void findAVI(){
        //获取本地所有的磁盘
        File[] arr=File.listRoots();
        for (File f : arr) {
            //f：以此表示每一个磁盘
            //把每个磁盘传给重载的findAVI 遍历查找磁盘里的每个文件夹
            findAVI(f);
        }
    }
    public static void findAVI(File src){
        //进入文件夹 遍历每一个文件
        File[] files=src.listFiles();
        if(files!=null){
            for (File file : files) {
                //是文件
                if(file.isFile()&&file.getName().endsWith(".avi")){
                    System.out.println(file);
                }else{
                    //不是文件 是文件夹
                    findAVI(file);
                }
            }
        }
    }
}
