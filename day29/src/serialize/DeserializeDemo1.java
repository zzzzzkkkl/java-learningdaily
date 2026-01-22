package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo1 {
    public static void main(String[] args) {
        Employee e=null;
        try{
            //创建反序列化流
            FileInputStream fileIn=new FileInputStream("employee.txt");
            ObjectInputStream in=new ObjectInputStream(fileIn);
            //读取一个对象到内存
            e=(Employee)in.readObject();
            //关闭
            in.close();
            fileIn.close();
        }catch(IOException i){
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            //捕获类找不到异常
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        //无异常 直接打印输出
        System.out.println("Name:"+e.name);
        System.out.println("Address:"+e.address);
        System.out.println("age:"+e.age);
    }
}
