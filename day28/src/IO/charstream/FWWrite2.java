package IO.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite2 {
    public static void main(String[] args)
    throws IOException {
        //使用文件名创建流对象
        FileWriter fw=new FileWriter("fw.txt");
        //1.写出数据，通过flush
        fw.write('刷');//写出第一个字符

        fw.flush();

        fw.write('新');//还可以写第二个

        //2.写出数据，通过close
        fw.write('关');
        fw.close();
        fw.write('闭');//关闭后再写 报错java.io.IOException: Stream closed

        fw.close();
    }
}
