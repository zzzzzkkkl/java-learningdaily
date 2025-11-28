package a04test;

public class Test2 {
    public static void main(String[] args) {
        /*自己实现parseInt方法的效果，将字符串数据转换成整数
        要求：字符串中只能是数字不能有其他字符；最少一位，最多10位；0不能开头
         */

        //1.定义一个字符串
        String str="123456789";
        //2.校验字符串
        //先筛选异常数据
        if(!(str.matches("[1-9]\\d{0,9}"))){
            //错误数据
            System.out.println("数据格式有误");
        }else{
            System.out.println("数据格式正确");
            //3.定义一个变量表示最终结果
            int number=0;
            //4.遍历字符串，得到每个字符
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i)-'0';
                //'1'-'0'  ---->1
                //把每一位数字放到number中
                number=number*10+c;
            }
            System.out.println(number);
        }
    }
}
