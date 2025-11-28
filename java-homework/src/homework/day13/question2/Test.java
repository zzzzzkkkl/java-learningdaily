package homework.day13.question2;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher("zhangsan",23,"数学部");
        System.out.println(t.getName()+" "+t.getAge()+" "+t.getDepartment());
        t.checkClassTable();
        t.releaseQuestion();

        Student s=new Student();
        s.setName("lisi");
        s.setAge(15);
        s.setClassNum(2023130);
        System.out.println(s.getName()+" "+s.getAge()+" "+s.getClassNum());
        s.checkClassTable();
        s.fillFeedback();
    }
}
