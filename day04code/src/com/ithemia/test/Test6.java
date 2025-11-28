package com.ithemia.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*根据不同分数送礼物
        如果95-100分，送自行车一辆
        90-94，游乐场一日游
        80-89，送变形金刚一个
        80，揍一顿
         */

        //键盘输入一个变量，表示分数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的分数：");
        int grade=sc.nextInt();

        //判断
        if(grade>=95&&grade<=100){
            System.out.println("送自行车一辆");
        }else if(grade>=90&&grade<=94){
            System.out.println("游乐园一日游");
        }else if(grade>=80&&grade<=89){
            System.out.println("送变形金刚一个");
        }else if(grade<0||grade>100){
            System.out.println("出现错误");
        }else{
            System.out.println("揍一顿");
        }
    }
}
