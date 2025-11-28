package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*定义方法实现随机产生一个5位的验证码
        验证码格式：长度为5，前四位是大写字母或小写字母，最后一位是数字

        分析：要在一堆没有什么规律的数据中随机抽取，可以先把这些数据放到数组里，
        再随机抽取数组的索引
         */

        //将大小写字母放到数组中
        char chs[]=new char[52];
        for(int i=0;i<chs.length;i++){
            if(i<=25){
                chs[i]=(char)(97+i);//97对应a，98对应b...
            }else{
                chs[i]=(char)(65+i-26);//65对应A，66对应B
            }
        }

        //随机抽取4次索引,并将索引对应的字母拼到一行
        String result=" ";
        Random r=new Random();
        for(int i=0;i<4;i++){
            int randomIndex=r.nextInt(chs.length);
            //System.out.print(chs[randomIndex]);//再利用索引获取字母
            result=result+chs[randomIndex];
        }
        //System.out.println(result);

        //随机抽取数字
        int num=r.nextInt(10);
        result=result+num;
        System.out.println(result);
    }
}
