package methodreference.string;

public class MyStringDemo {
    public static void main(String[] args) {
        //引用类的实例方法

        //lambda
        useMyString((s,x,y)->s.substring(x,y));

        //引用类的实例方法
        useMyString(String::substring);

    }
    private static void useMyString(MyString my){
        String s=my.mySubString("HelloWord",2,5);
        System.out.println(s);
    }
}
