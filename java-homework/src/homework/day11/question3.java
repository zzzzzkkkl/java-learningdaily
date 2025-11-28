package homework.day11;

import java.util.ArrayList;

public class question3 {
    public static void main(String[] args) {
        /*将员工信息存入集合中，对员工进行操作
         */
        ArrayList<Worker> list=new ArrayList<>();
        Worker worker1=new Worker("张三",3000);
        Worker worker2=new Worker("李四",3500);
        Worker worker3=new Worker("王五",4000);
        Worker worker4=new Worker("赵六",4500);
        Worker worker5=new Worker("田七",5000);
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);
        list.add(worker4);
        list.add(worker5);

        for (int i = 0; i < list.size(); i++) {
            String name1="王五";
            String name2="赵六";
            String name3="田七";
            Worker w=list.get(i);
            if(!name1.equals(w.getName())){
                System.out.println("没有这个员工");
            }else{
                w.setName("王小五");
            }
            if(!name2.equals(w.getName())){
                System.out.println("没有这个员工");
            }else{
                list.remove(name2);
            }
            if(!name3.equals(w.getName())){
                System.out.println("没有这个员工");
            }else{
                w.setSalary(w.getSalary()+500);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Worker w=list.get(i);
            System.out.println("姓名："+w.getName()+" "+"工资为："+w.getSalary());
        }
    }
}
