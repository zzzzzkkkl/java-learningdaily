package bytebufferedIO;

import java.io.*;

public class BufferedDemo1 {
    public static void main(String[] args)
    throws IOException {
        //创建字节缓冲输入流
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("bis.txt"));

        //创建字节缓冲输出流
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("bos.txt"));
    }
}
