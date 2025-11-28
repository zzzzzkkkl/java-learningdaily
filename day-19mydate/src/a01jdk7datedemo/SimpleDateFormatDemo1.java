package a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //1.定义一个字符串表示时间
        String str="2023-11-11 11:11:11";
        //2.利用空参构造，创建SimpleDateFormate对象，默认格式
        //细节：创建对象的格式要和字符串的格式完全一致
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date.getTime());
    }

    private static void method() {
        //空参构造，创建SimpleDateFormate对象，默认格式
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date d=new Date(0L);
        String str=sdf.format(d);
        System.out.println(str);

        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2=sdf2.format(d);
        System.out.println(str2);

        //课堂练习yyyy年MM月dd日 时：分：秒 星期E
    }
}
