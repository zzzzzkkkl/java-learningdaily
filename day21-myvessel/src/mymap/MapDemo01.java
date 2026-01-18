package mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //Map集合的基本使用

        //创建Map集合对象
        Map<String,String> map=new HashMap<String,String>();

        //将指定的值与该映射中的指定键相关联
        map.put("it001","小红");
        map.put("it002","小蓝");
        map.put("it003","小黄");

        //Map集合遍历 方式一
       //1.获取所有键的集合
        Set<String> keySet=map.keySet();
        //2.遍历键的集合keySet，获取每一个键
        for(String key:keySet){
            //根据键找对应的值，用get实现
            String value=map.get(key);
            System.out.println(key+","+value);
        }
    }
}
