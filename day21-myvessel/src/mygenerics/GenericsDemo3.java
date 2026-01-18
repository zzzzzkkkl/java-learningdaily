package mygenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        /*定义一个工具类：listUtil
        类中定义一个静态方法addAll，用来添加多个集合的元素
         */
        ArrayList<String> list=new ArrayList<>();
        listUtil.addAll(list,"aaa","bbb","ccc","ddd");
        System.out.println(list);
    }
}
