package mystream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo8 {
    public static void main(String[] args) {
        //Steam流收集 toMap
        /*
        创建一个ArrayList集合，并添加以下字符串。字符串中前面是姓名，后面是年龄
        "zhangsan,23"，"lisi,24"，"wangwu,25"
        保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
         */

        ArrayList<String> list=new ArrayList<>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");

        Map<String,Integer> map=list.stream().filter(s->{
            //按逗号分割，将list里的名字和年龄分成连个独立的部分
            String[] split=s.split(",");
            //获取数组中的年龄
            int age=Integer.parseInt(split[1]);
            return age>=24;
        }
        /*
        collect方法只能获取流中剩余的每一个数据，在底层不能创建容器，也不能把数据添加
        到容器当中。
        Collectors.toMap创建一个map集合并将数据添加到集合中

        s：依次表示流中的每一个数据
        第一个lambda：获取map中的键
        第二个lambda：获取map中的值
         */
        ).collect(Collectors.toMap(
                //按逗号分割 获取0位置的元素 即姓名
                s->s.split(",")[0],
                s->Integer.parseInt(s.split(",")[1])
        ));

        System.out.println(map);
    }
}
