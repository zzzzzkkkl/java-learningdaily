package mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象 迭代器好比一个箭头 默认指向集合0索引处
        Iterator<String> it=coll.iterator();
        //3.利用循环不断获得集合中的每一个元素
        while(it.hasNext()){//判断当前位置是否有元素
            String str=it.next();//获取元素，并移动指针
            System.out.println(str);
        }

        //循环中只能使用一次next方法
        //迭代器遍历时，不能用集合的方法进行增加或者删除；应该用迭代器里的删除方法
    }
}
