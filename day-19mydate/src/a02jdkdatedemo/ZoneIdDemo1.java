package a02jdkdatedemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        //1.获取所有时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        System.out.println(zoneIds.size());//打印集合长度
        
        //2.获取当前系统默认的时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai

        //3.获取指定旳时区
        ZoneId zoneId1 = ZoneId.of("Asia/Kashgar");
        System.out.println(zoneId1);

    }
}
