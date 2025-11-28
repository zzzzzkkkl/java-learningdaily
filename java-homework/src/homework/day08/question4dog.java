package homework.day08;

public class question4dog {
    //属性，成员变量
    private String color;
    private String bread;
    //行为，成员方法
    public void eat(){
        System.out.println(color+"的"+bread+"正在啃骨头...");
    }
    public void lookHome(){
        System.out.println(color+"的"+bread+"正在看家...");
    }

    //空参构造
    public question4dog(){}
    //带参构造
    public question4dog(String color,String bread){
        this.color=color;
        this.bread=bread;
    }

    //set/get
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }
    public String getBread(){
        return bread;
    }
}
