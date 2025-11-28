package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        /*Public BigDecimal add（BigDecimal val)加法
        Public BigDecimal subtract（BigDecimal val）减法
        Public BigDecimal multiply（BigDecimal val）乘法
        Public BigDecimal divide（BigDecimal val）除法
        Public BigDecimal divide（BigDecimal val，精确几位，舍入模式）除法*/

        //加法
        BigDecimal bd1=BigDecimal.valueOf(10.0);
        BigDecimal bd2=BigDecimal.valueOf(3.0);
        BigDecimal bd3=bd1.add(bd2);

        System.out.println(bd3);

        //除法
        BigDecimal bd4 = bd1.divide(bd2,2, RoundingMode.HALF_UP);
        System.out.println(bd4);
    }
}
