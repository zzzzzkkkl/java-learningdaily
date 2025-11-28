package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*键盘输入一个字符串，打乱里面的内容
         */
        //1、键盘输入字符串
        String str="abcdefg";
        //2、打乱里面的内容（相当于修改字符串里面的内容，用substring或者字符数组
        char arr[]=str.toCharArray();
        //3、打乱数组里面的内容，从0索引开始，跟一个随机索引进行位置交换
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成随机索引
            int index=r.nextInt(arr.length-1)+1;
            //交换
            char temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        //4、把字符数组变回字符串
        String result=new String(arr);
        System.out.println(result);
    }
}
