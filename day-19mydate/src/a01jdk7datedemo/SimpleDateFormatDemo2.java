package a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        /*出生年月日：2000-11-11
        用字符串表示这个数据，并将其转换为：2000年11月11日

        逆推法：把时间变成2000年11月11日，需要创建SimpleFormatDate对象并定义格式为年月日，需要先创建一个
        Date对象表示2000年11月11日；即可以通过2000-11-11进行解析，解析成一个Date对象
         */
        //1.通过2000-11-11进行解析，解析成一个Date对象
        String str="2000-11-11";
        //2.解析
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf1.parse(str);
        //3.格式化
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
        String result=sdf2.format(date);
        System.out.println(result);
    }
}
