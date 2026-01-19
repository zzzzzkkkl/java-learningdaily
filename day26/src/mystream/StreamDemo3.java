package mystream;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StreamDemo3 {
    public static void main(String[] args) {
        //Stream流的中间操作方法

        //1.过滤
        //Predicate接口中的方法 boolean test(T t)：对给定的参数进行判断，返回一个布尔值
        ArrayList<String> list=new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");
        /*
        filter方法获取流中的每一个数据，
        而test方法中的s，就依次表示流中的每一个数据；我们只要在test方法中对s进行判断
        就可以了，如果判断结果是true：当前数据留下；是false，当前数据不留下
         */
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //s:依次表示流中的每一个数据
                boolean result=s.startsWith("张");
                return result;
            }
        }).forEach(s-> System.out.println(s));

        /*
        因为Predicate接口中只有一个抽象方法test，所以我们可以使用lambda表达式简化
        */
        list.stream().filter((String s)-> {
                //s:依次表示流中的每一个数据
                boolean result=s.startsWith("张");
                return result;
        }).forEach(s-> System.out.println(s));

        list.stream().filter(s->s.startsWith("张"))
                .forEach(s -> System.out.println(s));
    }
}
