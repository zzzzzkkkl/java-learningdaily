package udp.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //UDP接收数据

        //创建接收端的Socket对象
        DatagramSocket ds=new DatagramSocket(12345);

        //创建一个数据包，用于接收数据
        byte[] bys=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bys,bys.length);

        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //解析数据包，并把数据包在控制台显示
        System.out.println("数据包："+new String(dp.getData(),0,dp.getLength()));
    }
}
