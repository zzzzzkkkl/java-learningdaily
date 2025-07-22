package com.ithiema.test;

public class Test5 {
    public static void main(String[] args) {
        /*寺庙里有三个和尚，身高分别为150出cm、210cm、165cm
        编写程序实现输出这三个和尚的最高身高
         */

        //定义变量记录三人的身高
        int a=150;
        int b=210;
        int c=165;

        //a和b比较
        int max1=a>b?a:b;

        //比较结果和c再比较
        int max2=max1>c?max1:c;
        System.out.println(max2);
    }
}
