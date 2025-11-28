package homework.day13.question2;

public class Teacher extends eduSystem{
    private String department;

    public Teacher(){}
    public Teacher(String department) {
        this.department = department;
    }

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void releaseQuestion(){
        System.out.println("发布问题");
    }
}
