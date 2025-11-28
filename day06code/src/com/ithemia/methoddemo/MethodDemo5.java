package com.ithemia.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        /*掌握带返回值的方法的定义和调用格式
        求一个商场一年的营业额综合
         */



        //赋值调用，先计算一个季度的营业额
        int sum1=getSum(10,20,30);
        //算第二季度
        int sum2=getSum(40,20,30);
        //第三季度
        int sum3=getSum(30,20,40);
        //第四季度
        int sum4=getSum(40,20,30);

        //求全年的营业额
        int sum=sum1+sum2+sum3+sum4;
        System.out.println(sum);
    }
    //定义方法，求一个季度的营业额综合
    public static int getSum(int num1,int num2,int num3){
        int result=num1+num2+num3;
        return result;//将结果返回给方法的调用处
    }
}
