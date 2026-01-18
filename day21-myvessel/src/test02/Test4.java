package test02;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //需求：定义一个Map集合，键表示省份名称province，值表示市city
        //添加完毕后，遍历的结果格式如下：
        //湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
        //河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市

        //1.创建Map集合
        HashMap<String, ArrayList<String>> hm=new HashMap<>();
        //2.创建单列集合list存储city 因为一个省对应多个市
        ArrayList<String> city1=new ArrayList<>();
        city1.add("南京市");
        city1.add("扬州市");
        city1.add("苏州市");
        city1.add("无锡市");
        city1.add("常州市");

        ArrayList<String> city2=new ArrayList<>();
        city2.add("武汉市");
        city2.add("孝感市");
        city2.add("十堰市");
        city2.add("宜昌市");
        city2.add("鄂州市");

        ArrayList<String> city3=new ArrayList<>();
        city3.add("石家庄市");
        city3.add("唐山市");
        city3.add("邢台市");
        city3.add("保定市");
        city3.add("张家口市");

        //3.把省份和省份对应的多个city添加到map集合
        hm.put("江苏省",city1);
        hm.put("湖北省",city2);
        hm.put("河北省",city3);

        //4.利用set遍历键 然后遍历值 遍历整个map
        Set<Map.Entry<String,ArrayList<String>>> entries=hm.entrySet();
        for(Map.Entry<String,ArrayList<String>> entry:entries){
            //entry:一次代表每一个键值对对象
            String key=entry.getKey();
            ArrayList<String> value=entry.getValue();

            //利用StringJoiner把city拼接在一起成字符串
            StringJoiner sj=new StringJoiner("","","");
            for(String city:value){
                sj.add(city);
            }
            System.out.println(key+"= "+sj);
        }
    }
}
