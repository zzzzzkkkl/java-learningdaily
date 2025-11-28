package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //1、创建一个集合
        ArrayList<String> list=new ArrayList();
        //2、添加元素
       list.add("aaa");
        //3、删除元素
        //boolean result=list.remove("aaa");
        //4、根据索引删除元素
        //String str=list.remove(0);
        //5、修改元素
        //String result=list.set(0,"ddd");
        //6、查询元素
        String str=list.get(0);
        System.out.println(str);
        System.out.println(list);
        //对集合进行遍历
        for (int i = 0; i < list.size(); i++) {
            String result=list.get(i);
            System.out.println(result);
        }
    }
}
