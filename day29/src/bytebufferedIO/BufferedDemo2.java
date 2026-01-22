package bytebufferedIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo2 {
    public static void main(String[] args)
    throws FileNotFoundException {
        //效率测试

        //记录开始时间
        long start=System.currentTimeMillis();
        //创建流对象
        try(
            FileInputStream fis=new FileInputStream("jdk9.exe");
            FileOutputStream fos=new FileOutputStream("copy.exe");
        ){
            //读写数据
        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        }catch(IOException e){
            e.printStackTrace();
        }

        //记录结束时间
        long end=System.currentTimeMillis();
        System.out.println("普通流复制时间："+(end-start)+"毫秒");
    }
}
