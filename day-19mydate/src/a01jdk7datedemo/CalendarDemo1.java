package a01jdk7datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //1.获取日历对象
        //根据系统的不同时区来获取不同的日历对象，默认表示当前时间
        //把时间中的纪元、年、月、日、时、分、秒，星期等等都放到一个数组中
        //0索引：纪元  1索引：年  2索引：月  3索引：一年中的第几周  4索引：一个月中的第几周  5索引：日期（一个月中的第几天）
        //细节：
        // 月份范围0-11 如果获取出来的是0那么实际上是1月
        //星期：在老外的眼里，星期日是一周中的第一天，后面的以此类推
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2.修改一下日历代表的时间
        Date d=new Date(0L);
        c.setTime(d);

        c.set(Calendar.YEAR,2023);
        c.set(Calendar.MONTH,8);//细节：12即对应13月，现实生活中没有13月，就把年份往后调一个
        c.set(Calendar.DAY_OF_WEEK,10);

        //调用方法在这个基础上增加一个月
        c.add(Calendar.MONTH,1);

        System.out.println(c);

        //java在Calendar中将索引对应的数字都定义成常量
        int year=c.get(Calendar.YEAR);
        int month=c.get(2);
        int day=c.get(5);
        int week=c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year +","+month+","+day+","+getWeek(week));

    }
    //查表法 让数据和索引产生对应关系
    //传入数字1-7 返回对应的星期
    public static String getWeek(int index){
        //定义数组，让数字1-7和星期几产生对应关系
        String[] arr={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        //根据索引返回对应信息
        return arr[index];
    }
}
