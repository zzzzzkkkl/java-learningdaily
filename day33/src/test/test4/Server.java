package test.test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket socket=ss.accept();

        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        /*
        UUID：通用唯一识别码
        UUID.randomUUID():生成全局唯一的UUID对象
        把这个唯一字符串拼接到文件名中，就能生成唯一的文件保存路径，解决文件覆盖问题
         */
        String name= UUID.randomUUID().toString().replace("-","");
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("mysocketnet\\\\serverdir\\\\\" + name + \".jpg"));
        int len;
        byte[] bys=new byte[1024];
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();

        //给客户端反馈
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        socket.close();
        ss.close();

    }
}
