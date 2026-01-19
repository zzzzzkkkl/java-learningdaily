package mystream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        /*
        现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，
        要求完成如下的操作:
        男演员只要名字为3个字的前三人，
        女演员只要姓林的，并且不要第一个，
        把过滤后的男演员姓名和女演员姓名合并到一起。
        把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
         */
        //1.创建集合
        ArrayList<String> manList=new ArrayList<>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList=new ArrayList<>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");

        //男演员只要名字为3个字的前三个人 limit截取前三人 元素长为3
        Stream<String> manStream=manList.stream().filter(s->
                s.length()==3).limit(3);

        //女演员只要姓林的，并且不要第一个 startWith 跳过sikp第一个
        Stream<String> womanStream=womanList.stream().filter(s->
                s.startsWith("林")).skip(1);

        //合并 concat
        Stream<String> stream=Stream.concat(manStream,womanStream);

        //将合并后的流中的数据封装成Actor对象之后打印
        //封装后从简单的字符串，变成了可操作的业务对象actor，方便后续操作
        stream.forEach(name->{
            Actor actor=new Actor(name);
            System.out.println(actor);
        });
    }
}
