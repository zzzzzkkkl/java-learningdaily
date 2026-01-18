package doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    //排序方式2：
    //创建map，键是牌 值是牌的价值
    static HashMap<String,Integer> hm=new HashMap<>();

    //牌盒,后面要用，所以把它放到这
    //定义一个集合，来装牌色和数字
    //静态里面只能访问静态，所以把list也变成静态
    static ArrayList<String> list=new ArrayList<>();

    //准备牌，牌只要一幅，所以写在外面，准备一次就可以了
    //利用静态代码块static{}
    //特点：随着类的加载而加载，只执行一次
    static{
        //1.准备牌
        //"♦","♣","♥","♠"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        //牌的数字和花色都是有限的，所以用两个数组来存储
        String[] coler={"♦","♣","♥","♠"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};


        for (String c : coler) {
            //c:依次表示每一种花色
            //花色c和每一个数字进行拼接
            for (String n : number) {
                //n依次表示每一种数字
                //拼好的放到集合（牌盒）里
                list.add(c+n);
            }
        }

        //全部拼好后，还有小王和大王
        //格式要跟数字保持一样，花色+数字。这里是空格+大小王
        list.add(" 小王");
        list.add(" 大王");

        //指定牌的价值
        //牌上的数字到Map判断存在吗
        //存在，获取价值 不存在，本身的数字就是价值
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",50);
        hm.put("大王",100);
    }
   public PokerGame(){
        //2.洗牌（把list里面的元素打乱
       Collections.shuffle(list);

       //3.发牌（准备4个集合，3个是玩家的，剩下一个存三张底牌
       ArrayList<String> lord=new ArrayList<>();
       ArrayList<String> player1=new ArrayList<>();
       ArrayList<String> player2=new ArrayList<>();
       ArrayList<String> player3=new ArrayList<>();

       //遍历牌盒的list 得到每一张牌，发给玩家
       //这里需要用到牌的序号，所以就用普通for
       for (int i = 0; i < list.size(); i++) {
           String poker=list.get(i);
           if(i<=2){
               //前三张牌，给lord
               lord.add(poker);
               //给lord之后，下面的代码不需要走，直接continue
               continue;
           }
           //大于2，给三个玩家轮流发牌
           //i%3=0给玩家1 等于1给玩家2 等于2给玩家3
           if(i%3==0){
               player1.add(poker);
           }else if(i%3==1){
               player2.add(poker);
           }else{
               player3.add(poker);
           }
       }

       //发的牌进行排序
       order(lord);
       order(player1);
       order(player2);
       order(player3);

       //4.看牌
       lookPoker("底牌",lord);
       lookPoker("钢脑壳",player1);
       lookPoker("大帅比",player2);
       lookPoker("蛋筒",player3);

   }
    /*
   参数一：玩家的名字
   参数二：每位玩家的牌的集合
    */
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+": ");
        //增强for 遍历每个玩家的list，打印出来
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        //这里整体换行
        System.out.println();
    }
   /*
   利用牌的价值进行排序
   参数:牌的集合
    */
   public void order(ArrayList<String> list){
       //直接sort的话是按默认规则排序
       //按我们自己的规则排序，就要再new Comparator
       Collections.sort(list, new Comparator<String>() {
           //底层：插入排序+二分排序
           //o1：当前要插入的
           //o2：已经存在的

           //负数：o1小，插入到前面
           //正数：o1大，插入到后面
           //0：按花色排序
           @Override
           public int compare(String o1, String o2) {
               //计算o1的花色和价值
               String coler1=o1.substring(0,1);//截取,这个结果要在map里存在，大小王也是
               int value1 = getValue(o1);

               //计算o2的花色和价值
               String coler2=o2.substring(0,1);//截取
               int value2 = getValue(o2);

               //比较o1和o2的价值
               int i=value1-value2;
               //如果说i=0就比较花色，如果不是就按价值的比较结果
               return i==0?coler1.compareTo(coler2):i;
           }
       });
   }
   /*
   计算牌的价值
   参数：牌
   返回值：价值
    */
   public int getValue(String poker){
       //获取牌上的数字
       String number = poker.substring(1);
       //拿着数字到map里面判断，存在吗
       if(hm.containsKey(number)){
           //存在，获取价值
           return hm.get(number);
       }else{
           //不存在，类型转换,直接把number转成他们的价值
           return Integer.parseInt(number);
       }
   }
}
