package com.itheima.a02systemdemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        //形参 0：表示当前虚拟机正常停止 非0：表示当前虚拟机异常停止
        //System.exit(0);
        //System.out.println("看看我执行了吗");

        //从时间原点开始，到这个代码执行的时间
        //long l=System.currentTimeMillis();
        //System.out.println(l);

        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=new int[10];
        System.arraycopy(arr1,0,arr2,0,10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
