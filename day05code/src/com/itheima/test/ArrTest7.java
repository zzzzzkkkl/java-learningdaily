package com.itheima.test;

import java.util.Random;

public class ArrTest7 {
    public static void main(String[] args) {
        /*定义一个数组1,2,3,4,5
        打乱数组中的数据
         */

        //定义数组
        int arr[]={1,2,3,4,5};
        //循环遍历数组
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取i后面的数据的索引，生成随机索引，利用随机数
            int randomIndex=r.nextInt(arr.length);
            //随机索引指向的数和i指向的数交换
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("打乱后的数组："+arr[i]);
        }
    }
}
