package IO.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite2 {
    public static void main(String[] args)
    throws IOException {
        //追加续写

        //使用文件名创建流对象 开启追加模式
        FileOutputStream fos=new FileOutputStream("fos.txt",true);
        //字符串转化为字节数组 在内存中准备数据
        byte[] b="abcde".getBytes();
        //写出 把内存中的字节数组写出 到文件里
        fos.write(b);
        //关闭
        fos.close();
    }
}
