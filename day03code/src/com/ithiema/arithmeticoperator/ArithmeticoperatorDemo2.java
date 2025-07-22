package com.ithiema.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        //除法
        System.out.println(10/2);
        System.out.println(10/3);//整数参与计算结果是整数
        System.out.println(10.0/3);//小数参与运算结果是小数，结果不精确

        //取模
        System.out.println(10%2);
        System.out.println(10%3);

        //应用场景
        //1.取模可以用来判断整除
        //2.判断一个数是否是偶数（能否整除2）
        //3.斗地主发牌，将每张牌都定义一个序号，序号%3若结果为1，就发给第一个玩家...
    }
}
