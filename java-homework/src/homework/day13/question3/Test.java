package homework.day13.question3;

public class Test {
    public static void main(String[] args) {
        Phone p=new Phone("小米",3000);
        System.out.println(p.getBrand()+" "+p.getPrice()+" "+Phone.size);
        p.call();
        p.senMessage();
        p.playGame();
    }
}
