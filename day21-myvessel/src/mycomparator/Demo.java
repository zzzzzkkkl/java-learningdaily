package mycomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        //创建四个学生兑现，将对象存到集合中
        ArrayList<Student> list=new ArrayList<Student>();

        list.add(new Student("rose",18));
        list.add(new Student("jack",16));
        list.add(new Student("abc",20));

        //要么是直接调用sort方法 括号里面不写Comparator，直接是按默认规则排序
        //要么是像这样，自定义比较器Comparator，重写方法
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按学生年龄升序排序
                return o1.getAge()-o2.getAge();
            }
        });

        for(Student student:list){
            System.out.println(student);
        }
    }
}
