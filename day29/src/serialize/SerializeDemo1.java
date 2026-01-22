package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo1 {
    public static void main(String[] args)
    throws IOException {
        //序列化

        FileOutputStream fileOut=new FileOutputStream("employee.txt");
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
    }
}
