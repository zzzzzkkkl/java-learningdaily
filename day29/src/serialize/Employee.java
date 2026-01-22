package serialize;

import java.io.Serializable;

public class Employee implements Serializable {
    //加入序列版本号
    private static final long serialVersionUID= 1L;
    public String name;
    public String address;
    public transient int age;//修饰后 age不会被序列化
    //添加新的属性，重新编译，可以反序列化，该属性赋为默认值
    public int eid;

    public void addressCheck(){
        System.out.println("Address check:"+name+"--"+address);
    }
}
