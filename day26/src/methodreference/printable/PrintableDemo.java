package methodreference.printable;

public class PrintableDemo {
    public static void main(String[] args) {
        //方法引用

        //在主方法中调用usePrintable
        usePrintable((String s)->
                System.out.println(s));

        //lambda简化格式
        usePrintable( s->
                System.out.println(s));

        //方法引用
        usePrintable(System.out::println);
    }
    private static void usePrintable(Printable p){
        //调用接口的printString
        p.printString("爱生活");
    }
}
