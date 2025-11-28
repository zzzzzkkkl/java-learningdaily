package com.ithemia.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*用户在超市买东西，商品总价600元
        键盘录入一个数表示用户的付款金额
        判断他是否付款成功
         */

        //键盘录入一个数表示付款金额
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的付款金额:");
        int money=sc.nextInt();

        //判断是否付款成功
        if(money>=600){
            System.out.println("付款成功");
        }else{
            System.out.println("付款失败");
        }
    }
}
