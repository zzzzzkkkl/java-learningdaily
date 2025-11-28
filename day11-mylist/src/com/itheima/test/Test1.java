package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        /*定义一个集合，添加字符串，并进行遍历
        遍历格式参照：[元素1，元素2,元素3]
         */
        //1、创建集合
        ArrayList<String> list=new ArrayList();
        //2、添加元素
        list.add("点赞");
        list.add("收藏");
        list.add("投币");
        list.add("转发");
        //3、遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");
    }
}
