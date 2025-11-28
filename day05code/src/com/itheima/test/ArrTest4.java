package com.itheima.test;

public class ArrTest4 {
    public static void main(String[] args) {
        /*数组33,5,22,44,55
        求最大值
         */

        //定义数组
        int arr[]={33,5,44,55};

        //定义max存储最大值
        int max=arr[0];//max初始值不能定义为0，如果数组里有负数，这就出现问题

        //循环比较更新max，找到最大值
        for (int i = 0; i <arr.length ; i++) {//循环的开始也可以是1，为0时第一次是自己和自己比较
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
