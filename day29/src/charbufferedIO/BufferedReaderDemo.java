package charbufferedIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args)
    throws IOException {
        //readLine 读一行方法演示

        //创建流对象
        BufferedReader br=new BufferedReader(new FileReader("in.txt"));
        //定义字符串 保存读取的一行文字
        String line=null;
        //循环读取
        while((line=br.readLine())!=null){
            System.out.println(line);
            System.out.println("---------");
        }
        //关闭
        br.close();
    }
}
