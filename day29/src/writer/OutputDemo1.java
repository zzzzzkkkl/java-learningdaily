package writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputDemo1 {
    public static void main(String[] args)
    throws IOException {
        OutputStreamWriter isr=new OutputStreamWriter(new FileOutputStream("out.txt"));

        OutputStreamWriter isr2=new OutputStreamWriter(new FileOutputStream("out.txt"),"GBK");
    }
}
