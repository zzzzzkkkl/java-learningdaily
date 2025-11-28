package com.ithemia.test;

public class Test14 {
    public static void main(String[] args) {
        /*实际开发中，若要获取一个范围中的每一个数字，也会用到循环
        比如，求1-5的和*/

        //利用循环，得到1-5中的每一个数
        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.println(i);

            //把得到的每一个数字加到sum
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
