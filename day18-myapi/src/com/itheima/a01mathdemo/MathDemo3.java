package com.itheima.a01mathdemo;

public class MathDemo3 {
    public static void main(String[] args) {
        //自幂数：一位n位自然数等于自身各个数位上数字的n次幂之和
        //三位自幂数：水仙花数

        int count=0;
        //得到每一个三位数
        for (int i = 100; i <=999; i++) {
            //得到每个数的 个位 十位 百位
            int ge=i%10;
            int shi=(i/10)%10;
            int bai=i/100%10;

            //每一位的三次方求和，是否跟这个数相等
            double sum=Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3);
            if(sum==i){
                count++;
                //System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
