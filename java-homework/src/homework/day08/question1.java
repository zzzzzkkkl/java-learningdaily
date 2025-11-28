package homework.day08;

public class question1 {
    //属性,成员变量
    private String brand;
    private String color;
    private double price;
    //行为，成员方法
    public void call(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机打电话...");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机发短信...");
    }

    //空参构造
    public question1(){}
    //带参构造
    public question1(String brand,String color,double price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    //set/get方法
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
}
