package mystream;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamDemo6 {
    public static void main(String[] args) {
        //Stream流的终结方法
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        //1.long count（）返回此流中的元素数
        method1(list);
        long count = list.stream().count();
        System.out.println(count);
    }

    private static void method1(ArrayList<String> list) {
            /*
            void forEach(Consumer action):对此流的每个元素执行操作
            Consumer接口中的方法void accept（T，t）：对给定的参数执行此操作
            在forEach方法底层，会循环获取流中的每一个数据，并循环调用accept，
            s：依次表示流中的每个数据
            所以在accept中协商处理的业务逻辑就可以了
             */
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("------------------------");

        //lambda表达式的简化格式
        list.stream().forEach(s -> System.out.println(s));

    }
}

