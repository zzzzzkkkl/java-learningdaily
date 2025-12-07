package mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //注意：Collection是一个接口，不能直接创建他的对象，所以只能创建他实现类的对象
        //实现类：ArrayList

        //多态创建 为了学习Collection里面的方法
        Collection<String> coll=new ArrayList<>();

        //1.添加元素
        //细节：如果向list系列里面添加数据，返回值永远为true。因为list允许重复元素
        //如果往Set里面添加数据，如果要添加的元素当前不存在，方法返回true，表示添加成功
        //                    如果当前要添加的元素存在，方法返回false，表示添加失败
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        //2.清空元素
        //coll.clear();

        //3.删除元素
        //注意：Collection里面定义的是共性的方法，所以不能通过索引进行删除，只能通过元素的对象进行删除
        //细节：方法有布尔类型的返回值，删除成功返回true 删除失败返回false
        coll.remove("aaa");

        //4.判断元素是否包含
        //注意：contains方法底层依赖的是equals方法，如果存的是自定义对象，eg.Student，必须在javabean类
        //中重写equals方法；否则会默认使用Object类中的equals方法进行判断，依赖地制值进行判断
        boolean result=coll.contains("aaa");
    }
}
