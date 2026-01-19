package mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo7 {
    public static void main(String[] args) {
        //Stream流的收集操作 toList toSet

        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list1.add(i);
        }
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        /*
        filter负责过滤数据
        collect负责收集数据，获取流中剩余的数据，但是他不负责创建容器，也不负责把数据
        添加到容器
        Collectors。toList()：在底层会创建一个list集合，把所有的数据添加到list集合
         */
        List<Integer> list=list1.stream().filter(number->number%2==0)
                .collect(Collectors.toList());
        System.out.println(list);

        System.out.println("------------------------");

        Set<Integer> set=list1.stream().filter(number->number%2==0)
                .collect(Collectors.toSet());
        System.out.println(set);


    }
}
