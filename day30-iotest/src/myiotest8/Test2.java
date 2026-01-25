package myiotest8;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        properties跟IO流结合的操作
         */
        //1.创建集合
        Properties prop=new Properties();
        //2.添加数据
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        prop.put("ddd","444");
        //3.把集合中的数据 以键值对的形式写到本地文件中
        /*BufferedWriter bw=new BufferedWriter(new BufferedWriter(new FileWriter("a.properties")));
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key=entry.getKey();
            Object value=entry.getValue();
            bw.write(key+"="+value);
            bw.newLine();
        }
        bw.close();*/

        FileOutputStream fos=new FileOutputStream("a.properties");
        prop.store(fos,"fos");
        fos.close();
    }
}
