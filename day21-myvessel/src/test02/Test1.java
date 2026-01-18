package test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //随机点名
        //需求：班级里有n个学生，实现随机点名

        //1.定义一个集合 用来存学生
        ArrayList<String> list=new ArrayList<>();
        //2.利用可变参数 一次性添加数据
        Collections.addAll(list,"范闲","范建","范统","杜子腾","杜琦燕","宋合泛","侯笼藤","朱益群","朱穆朗玛峰","袁明媛");
        /*//老方法 利用Random
        Random r=new Random();
        int index=r.nextInt(list.size());//抽的随机数字，就在list这个范围里面抽
        String name=list.get(index);
        System.out.println(name);*/

        //利用Collections里的打乱方法shuffle
        Collections.shuffle(list);//把list打乱
        String name=list.get(0);//获取打乱后的list里的第一个元素
        System.out.println(name);
    }
}
