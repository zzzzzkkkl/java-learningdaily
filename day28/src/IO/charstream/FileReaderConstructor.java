package IO.charstream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderConstructor {
    public static void main(String[] args)
    throws IOException {
        //字符流

        //使用File对象创建输入流对象
        File file=new File("a.txt");
        FileReader fr=new FileReader(file);

        //使用文件名创建流对象
        FileReader fr1=new FileReader("b.txt");
    }
}
