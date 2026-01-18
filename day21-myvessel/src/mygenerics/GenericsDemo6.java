package mygenerics;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {
        /*定义一个方法 形参是一个集合，集合中的数据类型不确定
         */
        ArrayList<Ye> list1=new ArrayList<>();
        ArrayList<Fu> list2=new ArrayList<>();
        ArrayList<Zi> list3=new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
    }
    /*弊端：利用泛型方法有弊端，此时它可以接受任意数据类型，甚至不在继承结构中；
    希望：本方法虽然不确定类型，但我只希望传递Ye Fu Zi

    此时我们就可以使用泛型通配符：
    ？表示不确定的类型
    它可以进行类型限定
    ？extends E:表示可以传递E或者E的所有的子类类型
    ? super E:表示可以传递E或者E所有的父类类型
     */
    public static void method(ArrayList<? extends Ye> list){

    }
}
