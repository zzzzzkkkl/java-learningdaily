package homework.day13.question6;

public class Test {
    public static void main(String[] args) {
        Person p=new Person("张三",23);
        System.out.println(p.getName()+" "+p.getAge());

        Dog dog=new Dog(2,"黑色");
        Cat cat=new Cat(2,"白色");
        System.out.println(dog.getColor()+" "+dog.getAge());

        p.keepDog(dog,"骨头");
        p.keepCat(cat,"小鱼干");
    }
}
