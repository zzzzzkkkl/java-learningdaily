package com.ithemia.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*商场会员制，不同的会员级别有不同的折扣
        一级会员，打9折
        二级会员，打8折
        三级会员，打7折
        非会员，不打折
        商品总价1000元，键盘录入不同的会员级别，输出最后的价格
         */

        //键盘输入会员级别
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的会员级别");
        int member=sc.nextInt();

        //判断，计算
        int price=1000;
        if(member==1){
            System.out.println("商品最终价格是："+(price*0.9));
        }else if(member==2){
                System.out.println("商品最终价格是:800");
        }else if(member==3){
            System.out.println("商品最终价格是：700");
        }else{
            System.out.println("商品最终价格是：1000");
        }
    }
}
