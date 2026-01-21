package IO.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite4 {
    public static void main(String[] args)
            throws IOException {
        //使用文件名创建流对象
        FileWriter fw=new FileWriter("fw.txt");
        //字符串
        String msg="程序员";
        //写出字符串
        fw.write(msg);

        //从索引2开始，1个字节
        fw.write(msg,2,1);

        //关闭
        fw.close();
    }
}
