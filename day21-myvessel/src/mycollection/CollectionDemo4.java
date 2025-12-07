package mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll=new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //注意：
        //s就是一个第三方变量，在循环过程中依次表示集合中的每一个数据
        for(String s:coll){
            System.out.println(s);
        }

    }
}
