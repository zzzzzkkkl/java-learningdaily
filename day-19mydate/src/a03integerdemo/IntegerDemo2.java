package a03integerdemo;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //1.把整数转成二进制、八进制、十六进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);

        //2.转成八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        //3.转成十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);

        //4.将字符串类型的数据转成int型
        //强类型语言：每种数据在java中都有各自的数据类型
        //在计算的时候，如果不是同一种数据类型，是无法进行计算
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i+1);
        //细节：
        //1.类型转换的时候，括号里的参数只能是数字不能是其他
        //2.8种包装类中，除了Character都有对应的parseXXX的方法，进行类型转换

    }
}
