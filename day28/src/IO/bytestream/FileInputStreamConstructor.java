package IO.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamConstructor {
    public static void main(String[] args)
    throws IOException {
        //使用file对象创建输入流
        File file=new File("a.txt");
        FileInputStream fos=new FileInputStream(file);

        //使用文件名 创建输入流
        FileInputStream fos1=new FileInputStream("b.txt");
    }
}
