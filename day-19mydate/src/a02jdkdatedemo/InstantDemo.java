package a02jdkdatedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        //1.获取当前时间的Instant对象（标准时间）
        Instant now = Instant.now();
        System.out.println(now);

        //2.根据秒/毫秒/纳秒获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2=Instant.ofEpochSecond(1L);//1s
        System.out.println(instant2);

        Instant instant3= Instant.ofEpochSecond(1L, 1000000000);
        System.out.println(instant3);//过了1s，再过了1000000000ns=1s

        //3.指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //4.isXXX 判断
        Instant instant4=Instant.ofEpochMilli(0L);
        Instant instant5=Instant.ofEpochMilli(1000L);

        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);

        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        //5.minusXXX 减少时间
        Instant instant6= Instant.ofEpochMilli(354112312L);
        System.out.println(instant6);//1970-01-05T02:21:52.312Z

        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);//1970-01-05T02:21:51.312Z


    }
}
