package com.itheima.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //获取运行对象
        //Runtime r1=Runtime.getRuntime();
        //Runtime r2=Runtime.getRuntime();

       //Runtime.getRuntime().exit(0);
        //System.out.println("看看我执行了吗");

        //System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        Runtime.getRuntime().exec("shutdown-s-a");
        //shutdown:关机，加上参数才能执行
        //-s：默认一分钟后关机
        //-s-t：指定时间：指定关机时间
        //-a：取消关机操作
        //-r：关机并重启
    }
}
