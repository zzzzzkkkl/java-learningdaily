package threadtest.test4.answer2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MyThread extends Thread{
    //总金额
    //注意：涉及到金额double有精度丢失问题，BigDecimal更适合
    static BigDecimal money=BigDecimal.valueOf(100.0);
    //个数
    static int count=3;
    //最小抽奖金额
    static final BigDecimal MIN=BigDecimal.valueOf(0.01);

    @Override
    public void run() {
        while(true){
            //同步代码块 保证同时只有一个人在抢红包
            synchronized (MyThread.class){
                if(count==0){
                    //到末尾
                    System.out.println(Thread.currentThread().getName()+"没有抢到红包");
                }else{
                    //中奖金额
                    BigDecimal prize;
                    if(count==1){
                        prize=money;
                    }else{
                        //获取中奖范围
                        //保证剩余count-1个红包至少能分到MIN0.01元
                        /*
                        BigDecimal.valueOf():把double转化为BigDecimal，用于初始化金额
                        money.subtract(...):减法，BigDecimal的减法必须用这个方法
                        doubleValue():把BigDecimal转回double类型
                         */
                        double bounds = money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                        Random r=new Random();
                        //抽奖金额
                        prize=BigDecimal.valueOf(r.nextDouble(bounds));
                    }
                    //设置抽中红包，小数点保留两位，四舍五入
                    /*
                    prize.setScale():随机生成的金额保留两位小数
                     */
                    prize=prize.setScale(2, RoundingMode.HALF_UP);
                    //在总金额上减去对应的钱
                    money=money.subtract(prize);
                    //红包数量减少
                    count--;
                    //输出红包信息
                    System.out.println(Thread.currentThread().getName()+"抽中了"+prize+"元");
                }
            }
        }
    }
}
