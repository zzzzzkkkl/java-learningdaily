package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
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
        list.add("小王");
        list.add("大王");
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

       //3.看牌，遍历每个玩家的集合即可
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
}
