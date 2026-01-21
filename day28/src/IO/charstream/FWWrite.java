package IO.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite {
    public static void main(String[] args)
    throws IOException {
        //使用文件名创建流对象
        FileWriter fw=new FileWriter("fw.txt");
        //写出数据到文件
        fw.write(97);//写出第一个字符
        fw.write('b');//写出第二个字符
        fw.write('c');
        fw.write(3000);//写出第四个字符，中文编码表中3000对应一个汉字

        //关闭
        /*
        注意 这里和FileOutputStream不同。
        不关闭，数据保存到缓冲区，并未保存到文件
         */
        fw.close();
    }
}
