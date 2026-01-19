package mystream;

import java.util.ArrayList;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //2.limit 截取前3个元素输出
        list.stream().limit(3)
                .forEach(s-> System.out.println(s));
        /*
        林青霞 张曼玉 王祖贤
         */

        System.out.println("--------------------------------");

        //3.skip 跳过2个元素 把剩下的元素中前两个输出
        list.stream().skip(2).limit(2)
                .forEach(s-> System.out.println(s));
        /*
        王祖贤 柳岩
         */
    }
}
