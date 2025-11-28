package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        /*金额转换
        开发票时需要把2135元转化成文字零百零拾零万贰仟壹佰叁拾伍元
         */
        //1.键盘录入金额
        Scanner sc=new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请录入一个金额");
            money=sc.nextInt();
            if(money>=0&&money<=9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }
        //2.定义一个变量表示钱的大写
        String moneyStr="";
       //得到money里的每一位数，把数字变成大写，1--壹 查表法
        while(true){
            //从右往左依次获取个位，即可获得money的每一位数
            int ge=money%10;
            String capitalNumber=getCapitalNumber(ge);
            //将转换后的大写拼接到moneyStr中(这样得到的刚好是倒着的）
            //moneyStr=moneyStr+capitalNumber;
            moneyStr=capitalNumber+moneyStr;
            //更新money的值
            money=money/10;
            //数字上的每一位都获取到了，money就变成0，跳出循环
            if(money==0){
                break;
            }
        }
       //3.在moneyStr前面补零，补齐7位
        int count=7-moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr="零"+moneyStr;
        }
        System.out.println(moneyStr);
        //4.插入单位
        //定义一个数组，存单位
        String[] arr={"佰","拾","万","仟","佰","拾","元"};
        //遍历moneyStr,依次得到零零零贰壹叁伍,然后把单位插进去
        String result="";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c=moneyStr.charAt(i);
            //System.out.print(c);
            //打印单位,因为arr和moneyStr长度一样，每循环一次，就打印出一个moneyStr和arr中的元素
            //System.out.print(arr[i]);
            result=result+c+arr[i];
        }
        System.out.println(result);
    }
    
    //定义一个方法，把数字变成大写
    public static String getCapitalNumber(int number){
        //定义数组，让数字跟大写的中文产生对应关系
        String[] arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        //返回结果，把数字当索引
        return arr[number];
    }
}
