package methodreference.converter;

public class ConverterDemo {
    public static void main(String[] args) {
        //引用官方类的实例方法

        //lambda
        useConverter(s->Integer.parseInt(s));

        //引用类写法
        useConverter(Integer::parseInt);
    }
    //这个方法接受Convert这个接口对象，调用接口里的convert方法
    private static void useConverter(Converter c){
        int number=c.convert("666");
        System.out.println(number);
    }
}
