package immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        //不可变map集合--键值对个数<10
        /*细节：
        键不能重复
        map里的of方法，参数有上限，最多只能传递20个参数，10个键值对
        如果要传递多个键值对对象，数量大于10，再map里还有一个方法
         */
        Map<String,String> map=Map.of("张三", "北京",
                "王五", "上海", "赵六", "广州", "孙七", "深圳",
                "周八", "杭州", "吴九", "宁波", "郑十", "苏州",
                "刘一", "无锡", "陈二", "嘉兴");
        Set<String> keys=map.keySet();
        for (String key : keys) {
            String value=map.get(key);
            System.out.println(key+"="+value);
        }

        Set<Map.Entry<String,String>> entries=map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //entry：依次表示每一个键值对对象
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
