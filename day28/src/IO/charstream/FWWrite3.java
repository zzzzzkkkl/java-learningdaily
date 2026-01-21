package IO.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite3 {
    public static void main(String[] args)
    throws IOException {
        //使用文件名创建流对象
        FileWriter fw=new FileWriter("fw.txt");
        //字符串转化为字符数组
        char[] chars="程序员".toCharArray();
        //写出字符数组到文件
        fw.write(chars);

        //从索引2开始，写出到文件2字节
        fw.write(chars,2,1);

        //关闭
        fw.close();
    }
}
