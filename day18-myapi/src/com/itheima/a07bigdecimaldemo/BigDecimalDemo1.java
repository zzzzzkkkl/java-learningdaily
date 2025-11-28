package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //1.构造方法 通过传递double类型的小数创建对象
        //细节：这种方式有可能是不精确的，不建议使用
        BigDecimal bd1=new BigDecimal(0.01);
        BigDecimal bd2=new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);

        //2.构造方法 通过传递字符串表示的小数来创建对象
        BigDecimal bd3=new BigDecimal("0.01");
        BigDecimal bd4=new BigDecimal("0.09");
        BigDecimal bd5=bd3.add(bd4);

        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);

        //3.通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd6);

        //细节：
        //1、如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
        //2、如果表示的数字较大，超出double取值范围，使用构造方法
        //3、如果传递的是0~10之间的整数，包含0和10，那么方法会返回已经创建好的对象，不会重新new
    }
}
