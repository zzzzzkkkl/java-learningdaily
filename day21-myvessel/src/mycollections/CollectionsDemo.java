package mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        //将集合中的元素按照默认规则排序
        ArrayList<Integer> list=new ArrayList<Integer>();

        list.add(100);
        list.add(300);
        list.add(200);

        //排序方法
        Collections.sort(list);
        System.out.println(list);
    }
}
