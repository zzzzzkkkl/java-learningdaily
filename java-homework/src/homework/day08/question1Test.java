package homework.day08;

public class question1Test {
    public static void main(String[] args) {
        /*定义手机类，类中要有空参、有参构造，set、get方法;有品牌brand、价格price、颜色color三个属性，
        有打电话call（）和sendMessage（）两个功能。

        定义测试类，主方法中使用空参构造对象，使用set赋值;调用对象的两个功能，打印效果如下：
        正在使用价格为3998元黑色的小米手机打电话...
        正在使用价格为3998元黑色的小米手机发短信...
         */

        //空参构造对象
        question1 phone=new question1();
        //set赋值
        phone.setBrand("小米");
        phone.setColor("黑色");
        phone.setPrice(3998);
        //调用功能
        phone.call();
        phone.sendMessage();
    }
}
