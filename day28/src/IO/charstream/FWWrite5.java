package IO.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite5 {
    public static void main(String[] args)
    throws IOException {
        //使用文件名创建流对象，可以续写数据
        FileWriter fw=new FileWriter("fw.txt",true);
        //写出字符串
        fw.write("成");
        //写出换行
        fw.write("\r\n");
        //写出字符串
        fw.write("功");

        //关闭
        fw.close();
    }
}
