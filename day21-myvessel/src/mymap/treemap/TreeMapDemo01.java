package mymap.treemap;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo01 {
    public static void main(String[] args) {
        //统计字符串中字母出现的次数

        //1.定义字符串
        String s = "aababcabcdadcde";

        //2.定义一个集合
        //键是字符 值是字符出现的次数
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        //遍历字符串得到里面的每个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //拿着c到集合里判断，是否存在
            //存在，表示当前字符又出现了一次
            //不存在，表示当前字符是第一次出现
            if (tm.containsKey(c)) {
                //存在
                //先把他原来的次数拿出来
                Integer count = tm.get(c);
                count++;
                //再放回
                tm.put(c, count);
            } else {
                //不存在
                tm.put(c, 1);
            }
        }

        //遍历集合,并按照指定格式拼接
        /*//StringBuilder方式拼接
        StringBuilder sb=new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
                       @Override
                       public void accept(Character key, Integer value) {
                           sb.append(key).append("(").append(value).append(")");
                       }
                   });
        //把拼接好的字符串打印出来
        System.out.println(sb);*/

        /*//StringJoiner方式拼接
        StringJoiner sj=new StringJoiner("","","");
        //StringJoiner方式拼接要用add
        //只能拼接字符串，所以key后面加上双引号，变成字符串
        tm.forEach(key,value)->sj.add(key+"").add("(").add(value+"").append(")")};
        System.out.println(sj);
    }*/
    }
}
