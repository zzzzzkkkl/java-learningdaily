package a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        /*用代码实现计算你活了多少天
        用jdk7 8两种方式实现
         */
        //jdk7
        //规则：只要对时间进行计算或判断，都需要获取当前时间的毫秒值

        //1.计算出生年月的毫秒值
        String birthday="2004年11月09日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        //获得date对象
        Date date = sdf.parse(birthday);
        //date对象转成毫秒值
        long birthdayTime = date.getTime();
        //2、当前时间的毫秒值
        long todayTime = System.currentTimeMillis();
        //3.计算时间间隔
        long time=todayTime-birthdayTime;
        System.out.println(time/1000/60/60/24);

        //jdk8
        //Period 侧重计算几年几月几天
        //Duration 侧重计算分钟和毫秒
        //ChronoUnit 都可以计算
        LocalDate ld1= LocalDate.of(2004,11,9);
        LocalDate ld2=LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }
}
