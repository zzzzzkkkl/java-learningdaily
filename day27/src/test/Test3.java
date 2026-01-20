package test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //需求： 定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
        //不考虑子文件夹

        File file=new File("D:\\aaa\\bbb");
        System.out.println(haveAVI(file));
    }
    public static boolean haveAVI(File file){
        //遍历文件里的内容
        File[] files=file.listFiles();
        for (File f : files) {
            //f:依次表示文件夹里的每个文件
            if(f.isFile()&&f.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}
