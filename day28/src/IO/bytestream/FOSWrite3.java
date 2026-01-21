package IO.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite3 {
    public static void main(String[] args)
    throws IOException {
        //写出换行

        //使用文件名创建流对象
        FileOutputStream fos=new FileOutputStream("fos.txt");
        //定义字节数组
        byte[] words={97,98,99,100,101};
        //遍历数组
        for (int i = 0; i < words.length; i++) {
            //写出一个字节
            fos.write(words[i]);
            //写出一个换行 换行符号转化成数组写出
            fos.write("\r\n".getBytes());
        }
        //关闭
        fos.close();
    }
}
