package mychangeargs;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //原来的写法
       /* list.add(12);
        list.add(13);*/

        //现在采用工具类 完成 往集合中添加元素
        Collections.addAll(list,5,222,1,2);
        System.out.println(list);
    }
}
