package methodreference.print;

public class PrinterDemo {
    public static void main(String[] args) {
        //引用对象的实例方法

        //lambda
        usePrinter(s->
                System.out.println(s.toUpperCase()));

        //引用对象
        PrintString ps=new PrintString();
        usePrinter(ps::printUpper);
    }
    private static void usePrinter(Printer p){
        p.printUpperCase("Helloword");
    }
}
