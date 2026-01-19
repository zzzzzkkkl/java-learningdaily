package mystream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
         /*使用stream流解决这个问题

        创建一个集合，存储多个字符串与元素
        把集合中所有以张开头的元素存到一个新集合里面
        把张开头的集合中长度为3的元素存储到一个新集合
        遍历以上得到的集合
         */

        //集合元素批量添加
        ArrayList<String> list1=new ArrayList<>(List.of("张三丰","张无忌",
                "张翠山","王二麻子","张良","谢广坤"));

        //Stream流
        list1.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s-> System.out.println(s));
    }
}
