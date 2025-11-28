package homework.day13.question6;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void keepDog(Dog dog,String something){
        System.out.println("颜色为"+dog.getColor()+"的"+dog.getAge()+"岁的狗在吃"+something);
    }
    public void keepCat(Cat cat,String something){
        System.out.println("颜色为"+cat.getColor()+"的"+cat.getAge()+"岁的猫在吃"+something);
    }
}
