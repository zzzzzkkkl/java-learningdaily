package com.itheima.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        /*定义javabean类：Phone，属性：品牌，价格
        main方法中定义一个集合，存入三个手机对象，分别为：小米，1000；苹果：8000；锤子：2999
        定义一个方法，将价格低于3000的手机信息返回
         */
        //1、创建集合
        ArrayList<Phone> list=new ArrayList<>();
        //2、创建手机对象
        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",8000);
        Phone p3=new Phone("锤子",2999);
        //3、添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //4、调用方法，将价格低于3000的手机信息返回
        ArrayList<Phone> phoneInfoList=getPhoneInfo(list);
        //5、遍历低于3000的手机集合
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone p=phoneInfoList.get(i);
            System.out.println(p.getBrand()+","+p.getPrice());
        }
    }
    ///方法4
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p=list.get(i);
            int price=p.getPrice();
            if(price<3000){
                resultList.add(p);
            }
        }
        return resultList;
    }

}
