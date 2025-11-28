package com.ithemia.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        /*掌握带参数的方法的定义和调用
         */

        getSum(10,20);
    }
    public static void getSum(int num1,int num2){
        int result=num1+num2;
        System.out.println(result);
    }
}
