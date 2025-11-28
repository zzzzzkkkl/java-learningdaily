package com.itheima.a04objectdemo;

import java.util.StringJoiner;

public class User implements Cloneable{//这个接口里面没有抽象方法，说明是一个标记性接口。表示Cloneable
    //一旦实现了，当前类的对象就可以被克隆，如果没有实现，当前类的对象就不能克隆
    private int id;
    private String name;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String name, String password, String path, int[] data) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
    public String toString(){
        return "角色编号："+id+",用户名："+name+"，密码："+password+",游戏图片："+path+",进度："+arrToString();
    }
    public String arrToString(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+" ");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的·clone方法，相当于让java帮我们克隆一个对象，并把克隆之后的对象返回出去

        //深克隆
        //先把被克隆对象中的数组获取出来
        int[] data=this.data;
        //创建新的数组
        int[] newData=new int[data.length];
        //拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i]=data[i];
        }
        //调用父类中的方法克隆对象
        User u=(User)super.clone();
        //因为父类中的克隆是浅克隆，替换克隆出来对象中的数据地址值
        u.data=newData;
        return u;
    }
}
