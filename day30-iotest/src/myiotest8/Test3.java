package myiotest8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
        properties读取到内存
         */
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("a.properties");
        prop.load(fis);
        fis.close();

        System.out.println(prop);
    }
}
