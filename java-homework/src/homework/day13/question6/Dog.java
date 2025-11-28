package homework.day13.question6;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    public void lookhome(){
        System.out.println("狗看家");
    }
}
