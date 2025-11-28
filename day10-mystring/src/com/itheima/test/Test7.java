package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*定义方法判断用户输入的身份证号是否合法。我国的身份证号由十七位数字本体码和一位数字校验码组成
        规则：号码18位，不能以数字0开头，前17位只能是数字，最后一位可以是数字或大写字母X
         */
        //1、键盘输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入身份证号");
        String str=sc.next();
        //2、将字符串转换为字符数组
        char arr[]=str.toCharArray();
        //3、判断是否合法
        boolean flag=check(arr);
        System.out.println(flag);
    }
    //方法3
    public static boolean check(char arr[]){
        if(arr.length!=18||arr[0]==0){
            return false;
        }else {
            for (int i = 1; i < arr.length;i++) {
                if((arr[arr.length]<'0'||arr[arr.length]>'9')&&arr[arr.length]!='X'){
                    return false;
                } else if (arr[i] > '9' || arr[i] < '0') {
                    return false;
                }
            }
        }
        return true;
    }
}
