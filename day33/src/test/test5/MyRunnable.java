package test.test5;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{
    Socket socket;
    public MyRunnable(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            //3.读取数据并保存到本地文件中
            BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
            String name= UUID.randomUUID().toString().replace("-","");
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("mysocketnet\\\\serverdir\\\\\" + name + \".jpg"));
            int len;
            byte[] bys=new byte[1024];
            while((len=bis.read(bys))!=-1){
                bos.write(bys,0,len);
            }
            bos.close();
            //4、给客户端反馈
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //5.关闭
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
