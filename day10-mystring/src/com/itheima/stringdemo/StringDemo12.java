package com.itheima.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        /*敏感词替换
        将敏感词替换为***
         */
        //获取说的话
        String talk="你玩的真好，以后不要玩了，tmd";
        //将tmd**
        String result=talk.replace("tmd","***");
        System.out.println(result);
    }
}
