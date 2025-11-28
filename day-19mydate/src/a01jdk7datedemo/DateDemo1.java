package a01jdk7datedemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        //创建date对象表示一个时间
        Date d=new Date();
        System.out.println(d);

        //创建对象 表示一个指定时间
        Date d2=new Date(0L);
        System.out.println(d2);

        //set修改时间
        d2.setTime(1000L);
        System.out.println(d2);

        //get获取当前时间
        long time=d2.getTime();
        System.out.println(time);
    }
}
