package homework.day15.question1;

public class Test {
    public static void main(String[] args) {
        Round round=new Round(5.0);
        Rectangle rectangle=new Rectangle(3.2,4.1);

        System.out.println(round.getPI()+ " "+round.getRadius());
        System.out.println("圆的面积是"+round.area()+" 圆的周长是"+round.allLength());
        System.out.println(rectangle.getLength()+" "+ rectangle.getWidth());
        System.out.println("长方形的面积是"+rectangle.area()+" 长方形的周长是"+rectangle.allLength());
    }
}
