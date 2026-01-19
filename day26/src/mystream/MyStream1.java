package mystream;

import java.util.ArrayList;
import java.util.List;

public class MyStream1 {
    public static void main(String[] args) {
        /*
        创建一个集合，存储多个字符串与元素
        把集合中所有以张开头的元素存到一个新集合里面
        把张开头的集合中长度为3的元素存储到一个新集合
        遍历以上得到的集合
         */

        //集合批量添加元素
        ArrayList<String> list1=new ArrayList<>(List.of("张三丰","张无忌",
                "张翠山","王二麻子","张良","谢广坤"));

        //遍历list1，找到以张开头的元素，添加到list2
        ArrayList<String> list2=new ArrayList<>();
        for (String s : list1) {
            //s依次表示集合里的每一个元素
            if(s.startsWith("张")){
                list2.add(s);
            }
        }

        //遍历list2,找到长度为3的元素，添加到list3
        ArrayList<String> list3=new ArrayList<>();
        for (String s : list2) {
            if(s.length()==3){
                list3.add(s);
            }
        }

        //遍历得到的list3
        for (String s : list3) {
            System.out.println(s);
        }
    }
}
