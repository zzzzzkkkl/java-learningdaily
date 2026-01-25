package myiotest4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        /*随机点名器
        需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。
            第三次必定是张三（赵若曦）同学

          运行效果：
            第一次运行程序：随机同学姓名1
            第二次运行程序：随机同学姓名2
            第三次运行程序：张三
         */
        //思路：实现「第三次点名必出张三」，关键是让程序记住自己运行了多少次
        // 哪怕关闭程序再打开，次数也不会重置，这就是「持久化」（把内存里的变量存到文件里）
        //1.创建一个list，保存从文件中读取出来的数据
        ArrayList<String> list=new ArrayList<>();
        //2.定义缓冲流 按行读取
        BufferedReader bw=new BufferedReader(new FileReader(new File("names.txt")));
        String ch;
        while((ch=bw.readLine())!=null){
            list.add(ch);
        }
        //关闭
        bw.close();

        //2.读取当前程序已经运行的次数
        BufferedReader br2 = new BufferedReader(new FileReader("count.txt"));
        String countStr=br2.readLine();
        int count=Integer.parseInt(countStr);
        //关闭
        br2.close();
        //程序在运行一次
        count++;

        //3.
        System.out.println(count);
        if(count==3){
            System.out.println("张三");
        }else{
            Collections.shuffle(list);
            String[] arr=list.get(0).split("-");
            System.out.println(arr[0]);
        }
        //4.将count写回文件
        BufferedWriter bw2=new BufferedWriter(new FileWriter(new File("count.txt")));
        //变成字符串才能写进去
        bw2.write(count+"");
        bw2.close();
    }
}
