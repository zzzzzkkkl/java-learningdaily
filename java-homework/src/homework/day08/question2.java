package homework.day08;

public class question2 {
    //属性，成员变量
    private String name;
    private double height;
    private double weight;
    //行为，成员方法
    public void sleep(){
        System.out.println("女朋友在休息");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }

    //空参构造
    public question2(){}
    //带参构造
    public question2(String name,double height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    //set/get方法
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }

    public void show(){
        System.out.println("我女朋友叫"+name+",身高"+height+"厘米，体重"+weight+"斤");
        sleep();
        eat();
    }
}
