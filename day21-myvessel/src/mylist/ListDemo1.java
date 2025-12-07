package mylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //1.创建集合
        List<String> list=new ArrayList<>();
        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //3.在指定位置添加元素
        //细节：原来索引上的元素依次往后移
        list.add(1,"QQQ");
        //4.remove 删除指定位置的元素,返回被删除的元素
        //细节：调用方法时，如果方法出现重载现象，优先调用实参形参一致的那个方法
        String remove = list.remove(0);
        //5.set 修改指定位置的元素，返回被修改的元素
        String result = list.set(0, "AAA");

    }
}
