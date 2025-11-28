package com.ithemia.test;

public class Test17 {
    public static void main(String[] args) {
        /*假如有一张纸，它的厚度是0.1毫米
        折多少次，可以折叠成珠穆朗玛峰的高度，已知珠穆朗玛峰高8844.43米=8844430毫米
         */

        //循环次数未知，所以用while循环
        double i=0.1;
        int count=0;
        while(i<=8844430){
            i=2*i;
            count=count+1;
        }
        System.out.println(count);
    }
}
