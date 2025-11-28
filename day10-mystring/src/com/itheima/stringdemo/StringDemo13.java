package com.itheima.stringdemo;

public class StringDemo13 {
    public static void main(String[] args) {
        /*敏感词替换
        将敏感词替换为***
         */
        //获取说的话
        String talk="你玩的真好，以后不要玩了，tmd";
        //定义一个敏感词库
        String[] arr={"tmd","cnm","sb","mlgb"};
        //循环得到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
