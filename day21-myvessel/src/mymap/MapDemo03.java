package mymap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        //集合的获取功能

        //创建集合对象
        Map<String,String> map=new HashMap<String,String>();

        //1.put 添加元素
        map.put("bp","rose");
        map.put("tf","rose");
        map.put("女团","张元英");

        //2.get 根据键获取 对应的值
//        System.out.println(map.get("bp"));

        //3.Set<K> keySet():获取所有键 的集合
        //创建set集合
        /*Set<String> keySet=map.keySet();
        for (String key:keySet) {
            System.out.println(key);
        }*/

        //4.Collection<V> values():获取所有值 的集合
        //创建一个Collection集合
        Collection<String> values=map.values();
        for(String value:values){
            System.out.println(value);
        }
    }
}
