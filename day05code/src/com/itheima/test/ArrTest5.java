package com.itheima.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        /*生成10个1-100之间的随机数存入数组
        1）求出所有数的和
        2）求平均数
        3）统计有多少个数比平均数小
         */

        //定义数组，动态
        int arr[]=new int[10];
        //生成随机数,存入数组中
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int num=r.nextInt(100)+1;//循环一次就生成一个随机数
            //将生成的随机数赋给数组里的元素
            arr[i]=num;
            System.out.println(arr[i]);//打印出随机数组
        }


        //1）求和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("和是："+sum);

        //2）求平均数
        double average=sum/10.0;
        System.out.println("平均数是："+average);

        //3)统计有多少数比平均数小
        int number=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<average){
                number++;
            }
        }
        System.out.println("比平均数小的有"+number+"个");
    }
}
