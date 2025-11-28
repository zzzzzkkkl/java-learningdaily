package com.ithemia.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        /*键盘录入两个数，表示一个范围
        统计这个范围内，既能被3整除，又能被5整除的数字有几个
         */

        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=sc.nextInt();
        System.out.println("请输入第二个数");
        int b=sc.nextInt();

        //在这个范围内循环查找
        int count=0;
        for(int i=a;i<=b;i++){
            if(i%3==0&&i%5==0){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
