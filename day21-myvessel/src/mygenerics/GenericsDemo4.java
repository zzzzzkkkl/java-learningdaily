package mygenerics;

public class GenericsDemo4 {
    public static void main(String[] args) {
        /* 使用方法：
	• 方法一：实现类给出具体类型
	• 方法二：实现类延续泛型，创建对象时再确定
         */

        /*MyArayList2 list=new MyArayList2();
        list.add("aaa");*/

        MyArrayList3<String> list=new MyArrayList3<>();
    }
}
