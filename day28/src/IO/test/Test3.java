package IO.test;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args)
    throws IOException {
        /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
        */
        //1.读取数据 因为是文本 所以用字符流
        FileReader fr=new FileReader("myio\\a.txt");
        StringBuilder sb=new StringBuilder();
        int ch;
        while((ch=fr.read())!=-1){
            //没有读取到最后一个字符
            //由于会升为int，所以先强转为char；再拼接
            sb.append((char)ch);
        }
        fr.close();
        System.out.println(sb);

        //2.将拼接好的sb排序
        //将sb转化为字符串
        String str=sb.toString();
        //将字符串按照-切割 数组里
        String[] arrStr=str.split("-");

        ArrayList<Integer> list=new ArrayList<>();
        for (String s : arrStr) {
            //s依次表示每一个字符
            //将字符转化为int
            int i=Integer.parseInt(s);
            //将转好的数字添加到集合里
            list.add(i);
        }
        //将集合排序
        Collections.sort(list);
        System.out.println(list);

        //3.将集合中的数据写出到文件里
        FileWriter fw=new FileWriter("myio\\a.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                //遍历到最后一个字符
                fw.write(list.get(i)+"");
            }else{
                //不是最后一个字符
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
