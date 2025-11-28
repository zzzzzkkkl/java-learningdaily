package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        /*身份证号的组成是有规则的
        给你一个身份证号，输出出生年月日、性别
         */
        String id="321281202001011234";
        //截取7-14位，获得出生年月日
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        System.out.println("人物信息为：");
        System.out.println("出生年月日为："+year+"年"+month+"月"+day+"日");
        //同理，获取性别
        char gender=id.charAt(16);
        //ASCII表中，‘0’对应的是48，所以字符减去48就得到真正的数字
        int num=gender-48;
        if(num%2==0){
            System.out.println("性别为：女");
        }else{
            System.out.println("性别为：男");
        }
    }
}
