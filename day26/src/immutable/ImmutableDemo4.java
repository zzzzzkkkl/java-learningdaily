package immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        //不可变map集合 键值对的数量>10
        //1.先创建一个普通的map集合
        HashMap<String,String> hm=new HashMap<>();
        hm.put("张三", "南京");
        hm.put("李四", "北京");
        hm.put("王五", "上海");
        hm.put("赵六", "北京");
        hm.put("孙七", "深圳");
        hm.put("周八", "杭州");
        hm.put("吴九", "宁波");
        hm.put("郑十", "苏州");
        hm.put("刘一", "无锡");
        hm.put("陈二", "嘉兴");
        hm.put("aaa", "111");

        //2.利用上面的数据 获取一个不可变的集合
       /* //获取所有的键值对对象
        Set<Map .Entry<String,String>> entries=hm.entrySet();
        //创建一个长度为0的空Entry数组
        Map.Entry[] arr1=new Map.Entry[0];
        //toArray方法在底层是比较集合长度跟数组长度的大小
        //若集合长度＞数组长度：数据在数组里放不下，根据实际数据的个数，重新创建数组
        //若集合长度＜=数组长度：能放下，直接用，不用创建新数组
        //放不下，创建一个新Entry数组arr2
        Map.Entry[] arr2=entries.toArray(arr1);
        //把数组变成 不可变map集合
        Map map=Map.ofEntries(arr2);
        map.put("bbb","222");*/

        /*Map<Object,Object> map=Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));*/

        //简化写法
        Map<String,String> map=Map.copyOf(hm);
        System.out.println(map);
        map.put("bbb","222");
    }
}
