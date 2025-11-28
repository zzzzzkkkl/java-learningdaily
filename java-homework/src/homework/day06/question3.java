package homework.day06;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        /*主方法中录入三个整数
        定义一个方法接受三个变量，在方法中从小到大依次打印三个变量
         */

        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1=sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2=sc.nextInt();
        System.out.println("请输入第三个整数：");
        int num3=sc.nextInt();

        //调用方法
        int max=getMax(num1,num2,num3);
        int min=getMin(num1,num2,num3);
        int mid=(num1+num2+num3)-max-min;

        //打印输出
        System.out.println(max+" "+mid+" "+min);
    }
    public static int getMax(int num1,int num2,int num3){
        int a=num1>num2?num1:num2;
        int max=a>num3?a:num3;
        return max;
    }
    public static int getMin(int num1,int num2,int num3){
        int a=num1<num2?num1:num2;
        int min=a<num3?a:num3;

        return min;
    }
}
