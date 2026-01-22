package writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputDemo2 {
    public static void main(String[] args)
            throws IOException {
        //指定编码写出

        //1.定义文件路径
        String FileName = "D:\\file_gbk.txt";
        //创建流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName));
        //写出数据到文件
        osw.write("你好");
        osw.close();

        String Filename = "D:\\file_gbk (2).txt";
        //创建流对象 指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(Filename), "GBK");
        //写出数据到文件
        osw2.write("你好");
        osw2.close();
    }
}
