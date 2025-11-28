package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        /*为保护隐私手机号码屏蔽
        例如:131****9428
         */
        //获取一个手机号码
        String phoneNumber="13112349468";
        //截取手机号码前三位
        String start=phoneNumber.substring(0,3);
        //截取手机号码后面四位
        String end=phoneNumber.substring(7);
        //将截取到的号码和****拼接
        String result=start+"****"+end;
        System.out.println(result);
    }
}
