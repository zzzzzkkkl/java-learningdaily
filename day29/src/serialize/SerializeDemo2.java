package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo2 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="zhangsan";
        e.address="beijing";
        e.age=20;
        try{
            //创建序列化对象
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("employee.txt"));
            //写出对象e到文件 实现序列化
            out.writeObject(e);
            //释放资源
            out.close();
            System.out.println("Serialized data is saved");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
