package a01jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        /*需求1：打印时间原点开始一年之后的时间
        需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个在后
         */

        //需求2：
        Random r=new Random();
        //创建两个时间对象
        Date d1=new Date(Math.abs(r.nextInt()));
        Date d2=new Date(Math.abs(r.nextInt()));
        long time1=d1.getTime();
        long time2=d2.getTime();

        if(time1>time2){
            System.out.println("第一个时间在后，第二个时间在前");
        }else if(time1<time2){
            System.out.println("第二个事件在后面，第一个时间在前面");
        }else{
            System.out.println("表示两个时间一致");
        }

    }

    private static void extracted() {
        //需求1
        //1.创建一个时间对象表示时间原点
        Date d1=new Date(0L);
        //2.获取d1时间的毫秒值
        long time=d1.getTime();
        //3.在这个基础上加一年的时间
        time=time+1000L*60*24*365;
        //4.把计算后的时间再设置回d1中
        d1.setTime(time);
        //5.打印
        System.out.println(d1);
    }
}
