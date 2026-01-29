package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //确定主机名称的ip地址，主机名称可以是主机名也可以是ip
        InetAddress address=InetAddress.getByName("192.168.1.66");

        //获取此ip的主机名
        String name=address.getHostName();

        //返回文本显示中的IP地址字符串
        String ip=address.getHostAddress();

        System.out.println("主机名:"+name);
        System.out.println("IP:"+ip);
    }
}
