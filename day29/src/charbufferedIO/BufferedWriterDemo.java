package charbufferedIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args)
    throws IOException {
        //创建流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter("out.txt"));
        //写出数据
        bw.write("仗剑");
        //换行
        bw.newLine();

        bw.write("天涯");
        bw.newLine();

        bw.write("意未迟");
        bw.newLine();

        //关闭
        bw.close();
    }
}
