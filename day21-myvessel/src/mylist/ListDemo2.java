package mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo2 {
    public static void main(String[] args) {
        //创建集合 添加元素
        List<String> list= new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器遍历
        Iterator<String> it=list.iterator();
        while(it.hasNext()){//判断当前位置是否有元素
            String str=it.next();//获取当前位置元素，同时指针后移
            System.out.println(str);
        }

        //2.增强for遍历
        //下面的变量s就是一个第三方变量而已，循环过程中s表示集合中的元素
        for (String s : list) {
            System.out.println(s);
        }

        //3.Lambda表达式遍历
        list.forEach( s ->System.out.println(s));

        //4.普通for遍历
        //size方法和get方法结合
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            System.out.println(s);
        }

        //5.列表迭代器
        //额外添加了一个方法：在遍历的过程中，可以添加元素
        ListIterator<String> it1=list.listIterator();//获取列表迭代器对象
        while(it.hasNext()){
            String str=it1.next();
            if("bbb".equals(str)){
                it1.add("qqq");
            }
            System.out.println(str);
        }
    }
}
