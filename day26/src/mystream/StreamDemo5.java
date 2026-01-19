package mystream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //4.concat 合并流
        //取前4个数据组成一个流 limit
        Stream<String> s1=list.stream().limit(4);
        //跳过前两个数据组成一个流 skip
        Stream<String> s2=list.stream().skip(2);
        //合并s1和s2
        /*Stream.concat(s1,s2).forEach(s-> System.out.println(s));*/

        System.out.println("---------------------------------");

        //5.distinct 剔除重复元素
        Stream.concat(s1,s2).distinct().forEach(s-> System.out.println(s));
    }
}
