package test;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //需求：在当前模块下的aaa文件夹中创建一个a.txt文件

        //1.创建a.txt的父级路径
        File file=new File("myfile\\aaa");
        //2。创建父级路径
        //若aaa存在 就创建失败 不存在创建成功
        file.mkdirs();
        //3.拼接父级路径和子级路径
        File src=new File(file,"a.txt");
        boolean b=src.createNewFile();
        if(b){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }
    }
}
