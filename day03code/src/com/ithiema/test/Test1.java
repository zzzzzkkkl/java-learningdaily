package com.ithiema.test;

import java.util.Scanner;

public class Test1 {
    public static <SCanner> void main(String[] args) {
        //键盘录入三位数，获取他的个位十位百位

        //1.键盘录入
        Scanner sc=new Scanner(System.in);//idea可以直接写，会自动帮你导入
        System.out.println("请输入一个三位数：");
        int number=sc.nextInt();

        //2.获取个位十位百位
        int ge=number%10;
        int shi=number/10%10;
        int bai=number/100%10;
        System.out.println("个位是:"+ge);
        System.out.println("十位是:"+shi);
        System.out.println("百位是:"+bai);
    }
}
