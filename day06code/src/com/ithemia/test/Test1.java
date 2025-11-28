package com.ithemia.test;

public class Test1 {
    public static void main(String[] args) {
        /*定义一个方法，求长方形的周长
        结果在方法中打印
         */

        getLength(10,20);
    }
    public static void getLength(double len,double width){
        double result=(len+width)*2;
        System.out.println(result);
    }
}
