package com.ithemia.test;

public class Test18 {
    public static void main(String[] args) {
        /*给你一个整数x
        若他是回文数，打印true，否则返回false
        回文数：从左到右和从右到左读是一样的数
        例如，121是，123不是
         */

        //一位数肯定是回文数，两位数只有11、22…才是回文数，、
        // 三位数第一位和第三位相同的是回文数
        //把数倒过来比较

        //定义数字
        int x=12345;
        int temp=x;//x的值一直在被修改，最后不能用x比较，用temp存x
        int num=0;//记录倒过来之后的数

        //利用循环倒过来，获取每一位数
       while(x!=0){
           int ge=x%10;
           x=x/10;//修改x

           num=num*10+ge;
       }
        System.out.println(num);

       //跟原来的数比较
        System.out.println(num==temp);
    }
}
