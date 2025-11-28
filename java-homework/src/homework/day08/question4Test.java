package homework.day08;

public class question4Test {
    public static void main(String[] args) {
        /*定义猫类。属性：毛的颜色、品种bread。行为：吃饭、抓老鼠
        定义狗类。属性：毛的颜色、品种bread。行为：吃饭、看家lookHome（）

        调用成员方法，打印格式如下：
        花色的波斯猫正在吃鱼...
        花色的波斯猫正在逮老鼠...
        黑色的藏獒正在啃骨头...
        黑色的藏獒正在看家...
         */
        question4cat cat=new question4cat();
        cat.setColor("花色的");
        cat.setBread("波斯猫");
        question4dog dog=new question4dog();
        dog.setColor("黑色的");
        dog.setBread("藏獒");

        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
    }
}
