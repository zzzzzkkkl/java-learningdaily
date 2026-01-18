package mymap.treemap;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        //创建TreeMap集合对象
        TreeMap<Student,String> tm=new TreeMap<>();

        //创建学生对象
        Student s1 = new Student("xiaohei",23);
        Student s2 = new Student("dapang",22);
        Student s3 = new Student("xiaomei",22);

        //将学生对象put到集合里
        tm.put(s1,"江苏");
        tm.put(s2,"北京");
        tm.put(s3,"天津");

        //遍历TreeMap集合，打印学生信息
        tm.forEach(
                (Student key,String value)->{
                    System.out.println(key+"--"+value);
                }
        );
    }
}
