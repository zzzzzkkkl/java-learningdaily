package com.ithiema.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*你和约会对象在餐厅中
        键盘录入两个整数，表示你这约会对象的时髦度（手动录入0-12）
        如果你的时髦度大与约会对象的，相亲成功输出true
         */

        //键盘录入时髦度
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入我们自己衣服的时髦度：");
        int myFashion=sc.nextInt();
        System.out.println("请输入相亲对象的时髦度：");
        int girlFashion=sc.nextInt();

        //时髦度对比
        boolean result=myFashion>girlFashion;

        //输出结果
        System.out.println(result);
    }
}
