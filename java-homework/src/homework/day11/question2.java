package homework.day11;

import java.util.ArrayList;

public class question2 {
    public static void main(String[] args) {
        /*定义一个教师类，属性：姓名、专业名称
        将教师对象存入集合中，并打印教师信息
         */
        ArrayList<Teacher> list=new ArrayList<>();
        Teacher teacher1=new Teacher("赵老师","javase");
        Teacher teacher2=new Teacher("钱老师","javase");
        Teacher teacher3=new Teacher("孙老师","php");
        Teacher teacher4=new Teacher("李老师","python");
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        list.add(teacher4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+" "+list.get(i).getProfession());
        }
    }
}
