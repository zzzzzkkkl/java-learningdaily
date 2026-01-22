package bytebufferedIO;

import java.io.*;

public class BufferedDemo3 {
    public static void main(String[] args)
    throws FileNotFoundException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 创建流对象
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("jdk9.exe"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.exe"))
        ){
            // 读写数据
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:"+(end - start)+" 毫秒");

        //如果使用数组进行复制就更快了
    }
}
