package methodreference.student;

public class StudentDemo {
    public static void main(String[] args) {
        //引用构造器

        //lambda
        useStudentBuilder((name,age)->
                new Student(name,age));

        //构造器
        useStudentBuilder(Student::new);
    }
    private static void useStudentBuilder(StudentBuilder sb){
        Student s=sb.build("林青霞", 30);
        System.out.println(s.getName()+","+s.getAge());
    }
}
