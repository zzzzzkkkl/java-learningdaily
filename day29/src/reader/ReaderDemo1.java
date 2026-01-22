package reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderDemo1 {
    public static void main(String[] args)
    throws IOException {
        //InputStreamReader

        InputStreamReader isr=new InputStreamReader(new FileInputStream("in.txt"));

        InputStreamReader isr2=new InputStreamReader(new FileInputStream("in.txt"),"GBK");
    }
}
