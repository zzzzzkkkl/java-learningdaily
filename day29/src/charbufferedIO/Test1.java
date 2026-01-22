package charbufferedIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args)
    throws IOException {
        //将in里面的文本进行排序
        /*
        思路：
        1.逐行读取文本信息
        2.读到内存的数据存到集合里
        3.对集合里的文本进行排序
        4.遍历集合 再写出到文件
         */

        //1.创建集合 用来一会读取到的存文本
        ArrayList<String> list=new ArrayList<>();
        //2.创建输入流
        BufferedReader br=new BufferedReader(new FileReader("in.txt"));
        //3.创建输出流
        BufferedWriter bw=new BufferedWriter(new FileWriter("out.txt"));
        //4.使用readLine 读取到内存中的集合里
        String line;
        while((line=br.readLine())!=null){
            //只要不空，就一直读
            //把读到的信息存到集合里
            list.add(line);
        }
        //5.使用集合里面Collections自带的sort方法，对文本按自定义规则排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //依次比较o1 o2的首元素，按升序排序
                return o1.charAt(0)-o2.charAt(0);
            }
        });
        //6.遍历集合 获取每一个元素
        for (String s : list) {
            //s:依次表示每一段
            bw.write(s);
            bw.newLine();
        }
        //关闭
        bw.close();
        br.close();
    }
}
