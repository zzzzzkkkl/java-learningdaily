package com.itheima.test6;

public class PhoneTest {
    public static void main(String[] args) {
        /*定义数组存储3部手机对象。手机的属性：品牌、价格、颜色
        要求，计算出三部手机的平均价格
         */
        //创建数组
        Phone[] arr=new Phone[3];
        //创建手机的对象
        Phone p1=new Phone("小米",1999,"白色");
        Phone p2=new Phone("华为",4999,"蓝色");
        Phone p3=new Phone("魅族",3999,"红色");
        //把手机对象添加到数组中
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;
        //获取三部手机的价格，算平均值
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone=arr[i];
            sum+=phone.getPrice();
        }
        double avg=sum*1.0/arr.length;
        System.out.println(avg);
    }
}
