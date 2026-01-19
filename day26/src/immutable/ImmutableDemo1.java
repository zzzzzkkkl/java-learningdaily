package immutable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        //不可变list集合
        /*
            创建不可变的List集合
            "张三", "李四", "王五", "赵六"
        */
        //一旦创建完毕，无法进行修改，只能查询

        List<String> list=List.of("张三","李四", "王五", "赵六");
        /*System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("---------------------------");

        for (String s : list) {
            //s是list里的每一个元素
            System.out.println(s);
        }

        System.out.println("---------------------------");

        //迭代器遍历
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }

        System.out.println("----------------------------");
        //普通for遍历
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            System.out.println(s);
        }
*/
        System.out.println("----------------------------");
        /*list.remove("李四");*/
       /* list.set(0,"aaa");*/
        System.out.println(list);
    }
}
