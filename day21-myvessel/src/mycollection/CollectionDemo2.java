package mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
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

        //当上面的循环结束后，迭代器的指针已经指向最后没有元素的地方，此时再调用next，会报错NoSuchElementException
        System.out.println(it.next());
        //迭代器遍历完毕，指针是不会自动复位的
        //如果还想再次遍历，只能获取一个新的迭代器对象
        System.out.println(it.hasNext());
    }
}
