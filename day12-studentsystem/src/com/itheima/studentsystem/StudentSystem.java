package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentSystem {
    private static final String ADD_STUDENT="1";
    private static final String DELETE_STUDENT="2";
    private static final String UPDATE_STUDENT="3";
    private static final String QUERY_STUDENT="4";

    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        //1、写欢迎界面
        loop:while (true) {
            System.out.println("---------------欢迎来到学生管理系统---------------");
            System.out.println("1、添加学生");
            System.out.println("2、删除学生");
            System.out.println("3、修改学生");
            System.out.println("4、查询学生");
            System.out.println("5、退出");
            System.out.println("请输入你的选择：");
            Scanner sc=new Scanner(System.in);
            String choose=sc.next();
            switch(choose){
                case ADD_STUDENT-> addStudent(list);
                case DELETE_STUDENT-> deleteStudent(list);
                case UPDATE_STUDENT-> updateStudent(list);
                case QUERY_STUDENT-> queryStudent(list);
                case "5"->{
                    System.out.println("退出");
                    //退出功能1 break loop;
                    System.exit(0);//退出功能2 停止虚拟机运行
                }
                default-> System.out.println("没有这个选项");
            }
        }
    }

    //2、添加功能的方法
    public static void addStudent(ArrayList<Student> list){
        System.out.println("添加学生");
        //空参构造，再用set方法
        Student s=new Student();

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生id：");
            String id=sc.next();
            boolean flag=contains(id,list);
            if(flag){
                System.out.println("id已存在，请重新输入");
            }else{
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name=sc.next();
        s.setName(name);
        System.out.println("请输入学生年龄：");
        int age=sc.nextInt();
        s.setAge(age);
        System.out.println("请输入学生的家庭住址：");
        String address=sc.next();
        s.setAddress(address);
        //Student s=new Student(id,name,age,address);

        //把学生添加到集合中
        list.add(s);

        //提示用户
        System.out.println("学生信息添加成功");
    }

    //3、删除功能的方法
    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("删除学生");
        System.out.println("请输入你要删除的学生id：");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        int index=getIndex(id,list);
        if(index>=0){
            list.remove(index);
            System.out.println("id为："+id+"的学生删除成功");
        }else{
            System.out.println("id不存在，无法删除");
        }
    }

    //4、修改功能的方法
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("修改学生");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id=sc.next();
        int index=getIndex(id,list);
        if(index==-1){
            System.out.println("要修改的id"+id+"不存在，请重新输入");
            return;
        }
        //当前id存在，获取对应的学生对象
        Student s=list.get(index);
        System.out.println("请输入要修改的学生姓名：");
        String newName=sc.next();
        s.setName(newName);
        System.out.println("请输入要修改的学生年龄：");
        int newAge=sc.nextInt();
        s.setAge(newAge);
        System.out.println("请输入要修改的学生住址：");
        String newAddress=sc.next();
        s.setAddress(newAddress);
        //提示用户
        System.out.println("学生信息修改成功");
    }

    //5、查询功能的方法
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("查询学生");
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
            //结束方法
            return;
        }else{
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                Student s=list.get(i);
                System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
            }
        }
    }

    //判断id在集合中是否存在的方法
    public static boolean contains(String id,ArrayList<Student> list){
       /* //循环遍历集合，得到每个学生的id
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            String sid=s.getId();
            if(sid.equals(id)){
                return true;
            }
        }
        return false;*/
        return getIndex(id,list)>=0;
    }

    //通过id获取索引的方法
    public static int getIndex(String id,ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            String sid=s.getId();
            if(sid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
