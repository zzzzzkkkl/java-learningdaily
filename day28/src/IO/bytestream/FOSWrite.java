package IO.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite {
    public static void main(String[] args)
    throws IOException {
        //使用文件名 创建文件输出流对象
        FileOutputStream fos=new FileOutputStream("fos.txt");

        /*//1.写出数据
        fos.write(97);//写出第一个字节
        fos.write(98);//写出第二个字节
        fos.write(99);//写出第三个字节

        //字符串转换为字节数组
        byte[] b="程序员".getBytes();
        //2.写出字节数组数据
        fos.write(b);*/

        //3.写出指定长度字节数组
        //字符串准换为字节数组
        byte[] b1="abcde".getBytes();
        //从索引2开始，写出2个字节 也就是cd
        fos.write(b1,2,2);

        //关闭资源 流操作完毕后一定要关闭
        fos.close();
    }
}
