package mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo5 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll=new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        //2.利用Lambda表达式遍历
        //forEach底层原理：
        //自己遍历集合，依次得到每一个元素；把得到的每一个元素，传递给下面的accept方法
        //匿名内部类形式
        /*coll.forEach(new Consumer<String>() {
            @Override
            //s:依次表示集合中的每个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //lambda表达式写法
        coll.forEach( s-> System.out.println(s));
    }
}
