package myiotest2;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        /*随机点名器
        需求：
         names.txt里面存储了班级同学的信息，每一个信息占一行。
                格式为：张三-男-23
                要求通过程序实现随机点名器。
            运行效果：
                第一次运行程序：随机同学姓名1（只显示名字）
                第二次运行程序：随机同学姓名2（只显示名字）
                第三次运行程序：随机同学姓名3（只显示名字）
         */
        //思路：读取文件中的数据到内存-随机选一行数据-对这一行数据split只获取第一个元素 即名字
        //1.定义集合，用来存一会读到的数据
        ArrayList<String> list=new ArrayList<>();
        //2.定义缓冲输出流 按行读取
        BufferedReader bw=new BufferedReader(new FileReader(new File("names.txt")));
        String ch;
        //按行读取
        while((ch=bw.readLine())!=null){
            list.add(ch);
        }
        //3.随机
        Random r=new Random();
        int index=r.nextInt(list.size());
        //遍历list
        for (int i = 0; i < list.size(); i++) {
            if(i==index){
                //把被选中的这一行字符串按-分割成数组
                String[] arr=list.get(i).split("-");
                //把数组里的第一个元素打印出来 也就是名字
                System.out.println(arr[0]);
                //找到以后就跳出for
                break;
            }
        }
    }
}
