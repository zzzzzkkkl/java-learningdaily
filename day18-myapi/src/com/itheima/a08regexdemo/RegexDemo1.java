package com.itheima.a08regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        /*校验一个qq号是否正确*/
        String qq="0123456";
        //System.out.println(checkQQ(qq));

        qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq){
        //6位-20位之内，0不能在开头，必须全部是数字
        //核心思想：
        //先把异常数据过滤
        //下面的就是满足要求的数据
        int len = qq.length();
        if(len<6||len>20){
            return false;
        }
        //0不能开头
        if(qq.startsWith("0")){
            return false;
        }
        //必须全部是数字
        for (int i = 0; i < qq.length(); i++) {
            char c=qq.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
}
