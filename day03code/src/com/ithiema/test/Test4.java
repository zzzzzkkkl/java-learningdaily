package com.ithiema.test;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        /*动物园有两只老虎，体重键盘录入
        判断两只老虎的体重是否相同*/

        //键盘录入体重
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int a=sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int b=sc.nextInt();

        //比较
        //int result=a==b?a:b;这样写不对
        String result=a==b?"相同":"不同";
        System.out.println(result);
    }
}
