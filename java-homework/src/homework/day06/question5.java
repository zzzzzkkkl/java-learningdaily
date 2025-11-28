package homework.day06;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        /*键盘录入一个整数
        定义一个方法，判断该数字是几位数，并将位数返回
         */

        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num=sc.nextInt();

        //调用方法
        System.out.println(weishu(num));
    }
    public static int weishu(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
}
