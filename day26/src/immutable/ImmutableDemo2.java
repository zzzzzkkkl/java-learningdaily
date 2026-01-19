package immutable;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        //不可变的set集合
        /*
           创建不可变的Set集合
           "张三", "李四", "王五", "赵六"

           细节：
                当我们要获取一个不可变的Set集合时，里面的参数一定要保证唯一性
        */
        Set<String> set=Set.of("张三", "李四", "王五", "赵六");
        /*for (String s : set) {
            System.out.println(s);
        }

        System.out.println("---------------");
        //迭代器遍历
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }*/
/*
        set.remove("王五");
*/
    }
}
