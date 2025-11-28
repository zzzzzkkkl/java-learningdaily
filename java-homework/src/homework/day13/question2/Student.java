package homework.day13.question2;

public class Student extends eduSystem{
    private int classNum;


    public Student(){}
    public Student(int classNum) {
        this.classNum = classNum;
    }

    public Student(String name, int age, int classNum) {
        super(name, age);
        this.classNum = classNum;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }
    public void fillFeedback(){
        System.out.println("填写听课反馈");
    }
}
