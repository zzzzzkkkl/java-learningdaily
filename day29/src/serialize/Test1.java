package serialize;

import java.io.*;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args)
            throws Exception {
        /*
        需求：
        1. 把若干学生对象 ，保存到集合中。
        2. 把集合序列化。
        3. 反序列化读取时，只需要读取一次，转换为集合类型。
        4. 遍历集合，可以打印所有的学生信息
         */

        /*//1.创建学生对象
        Student student = new Student("老王", "laow");
        Student student2 = new Student("老张", "laoz");
        Student student3 = new Student("老李", "laol");
        //2.把学生对象保存到集合
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
        //3.序列化操作 存到文件里
        *//*serializ(arrayList);*//*
        //4.反序列化
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("list.txt"));
        //读取对象到内存，int强转为ArrayList
        ArrayList<Student> list=(ArrayList<Student>)ois.readObject();
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            System.out.println(s.getName()+"-"+s.getPwd());
        }
    }*/
        //序列化
   /* public static void serializ(ArrayList<Student> arrayList)
    throws IOException{
        //创建序列化流 从内存到文件
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("list.txt"));
        //写出对象到文件
        oos.writeObject(arrayList);
        //关闭
        oos.close();
    }
}*/
    }
}