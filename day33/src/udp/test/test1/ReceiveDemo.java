package udp.test.test1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        /*
        UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
         */

        //创建接收端的Socket
        DatagramSocket ds=new DatagramSocket(12345);
        while(true){
            //创建一个数据包 用于接收数据
            byte[] bys=new byte[1024];
            DatagramPacket dp=new DatagramPacket(bys,bys.length);

            //调用receive 接收数据
            ds.receive(dp);

            //解析数据包 把数据在控制台显示
            System.out.println("数据包："+new String(dp.getData(),0,dp.getLength()));
        }
        //关闭
        /*ds.close();*/
    }
}
