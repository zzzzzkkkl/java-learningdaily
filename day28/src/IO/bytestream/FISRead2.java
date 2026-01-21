package IO.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FISRead2 {
    public static void main(String[] args)
    throws IOException {
        //使用字节数组读取

        //使用文件名 创建输入流
        FileInputStream fis=new FileInputStream("read.txt");
        //定义变量，作为有效个数
        int len;
        //定义字节数组
        byte[] b=new byte[2];
        /*//循环读取
        while((len=fis.read(b))!=-1){
            //每次读取后 都把数组变成字符串打印出来
            System.out.println(new String(b));
        }//结果：ab cd ed*/
        /*
        出现错误数据d，数组中上次读取的数据没有被完全替换，所以要通过len，获取有效字节
         */

        //循环读取
        while((len=fis.read(b))!=-1){
            //每次读取后，把数组的有效字节部分，变成字符串打印
            //len 每次读取的有效字节个数
            //从索引0开始，长度为len的字符串
            System.out.println(new String(b,0,len));
        }
        //关闭
        fis.close();
    }
}
