package a04test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        /*判断任意一个年份是闰年还是平年 jdk7 8两种方式实现
        提示：2月有29天是闰年 一年366天是闰年
         */

        //jdk7
        //思路一
        //利用Calendar 把时间设置为2000年3月1号
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);//默认获取的时间是现在的时间，所以需要重置；月份：0-11
        //把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH,-1);//参数-1 表示往前减，正数表示往前加
        //看当前时间是28号还是29号
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //思路二
        //把时间定义成后一年的一号
        //看这一天是365还是366

        //jdk8
        //设定时间
        LocalDate ld = LocalDate.of(2000, 3, 1);//月份：1-12
        //将时间往前减
        LocalDate ld2 = ld.minusDays(-1);
        //获取这一天 看这一天是28还是29
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //思路2：
        System.out.println(ld.isLeapYear());
    }
}
