package com.ithemia.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*定义一个方法判断数组中的某一个数是否存在
        将结果返回给调用处
         */

        //定义数组
        int arr[]={1,5,8,12,56,89,34,67};
        //调用方法
        boolean flag=isExist(arr);
        System.out.println(flag);
    }
    public static boolean isExist(int arr[]){
        System.out.print("请输入一个数：");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(a==arr[i]){
                return true;
            }
        }
        return false;//只有全部遍历一遍，才知道没有这个数，所以false写在循环外面
    }
}
