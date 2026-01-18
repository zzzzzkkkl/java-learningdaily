package mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候，集合如何存储数组
        //如果我们没有规定类型，默认所有都是object，可以往集合添加任意数据
        //获取数据时，无法使用他的特有行为

        //1.创建集合的对象
        ArrayList list=new ArrayList();

        //2.添加数据
        list.add(123);
        list.add("aaa");
        list.add(new Student("张三",23));

        //3.遍历集合
        Iterator it=list.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }
    }
}
