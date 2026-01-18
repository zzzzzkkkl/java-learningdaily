package mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        //集合的基本功能

        //创建集合对象
        Map<String,String> map=new HashMap<String,String>();

        //1.put 添加元素
        map.put("bp","rose");
        map.put("tf","rose");
        map.put("女团","张元英");

        //4.remove 根据键 删除对应的元素
//        System.out.println(map.remove("tf"));

        //5.clear 清空集合中的所有元素
//        map.clear();

        //6.contaisKey 判断集合中是否包含指定的键
//        System.out.println(map.containsKey("tf"));

        //7.containsValue 判断集合中是否包含指定的值
        System.out.println(map.containsValue("rose"));

       /* //2.size 输出集合长度
        System.out.println(map.size());
        //3.获取集合对象
        System.out.println(map);*/

        //Map遍历方法2
        //1.获取所有键值对对象的集合
        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        //2.遍历键值对集合entrySet,得到每个键值对对象
        for(Map.Entry<String,String> me:entrySet){
            //3.根据键值对对象获取对应的键 值
            String key=me.getKey();
            String value=me.getValue();
            System.out.println(key+","+value);
        }
    }
}
