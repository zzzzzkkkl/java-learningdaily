package doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //排序方式1：
    //牌盒Map
    //键是每张牌对应的序号，值是每张牌
    //只需牌和序号产生对应关系，不需要在牌盒里面给牌排序，所以用hashmap
    static HashMap<Integer,String> hm=new HashMap<>();
    //创建一个单列集合list，单独存序号。因为后面操作的都是牌的序号
    static ArrayList<Integer> list=new ArrayList<>();

    //准备牌，牌只要一幅，所以写在外面，准备一次就可以了
    //利用静态代码块static{}
    //特点：随着类的加载而加载，只执行一次
    static {
        //1.准备牌
        //"♦","♣","♥","♠"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        //牌的数字和花色都是有限的，所以用两个数组来存储
        String[] coler = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //序号
        int serialNumber=1;
        //细节：
        /*
        这里是先遍历数字，再遍历花色。
        这样保证发完牌之后牌是有序的
         */
        for (String n : number) {
            //n:依次表示每一个数字
            for (String c : coler) {
                //c:依次表示每一个花色
                hm.put(serialNumber,c+n);
                //把序号添加进序号list里
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber,"大王");
        list.add(serialNumber);


    }

    public PokerGame(){
        //2.洗牌,即打乱序号
        Collections.shuffle(list);

        //3.发牌
        //可以还用ArrayList，也可以改进成TreeSet，因为Treeset可以按照默认从小到大的规则排序
        //这样发一张牌，TreeSet就自动排序，玩家拿到的牌就是有序的
        TreeSet<Integer> lord=new TreeSet<>();
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            //i:集合中的每个索引
            //list.get(i):集合里的每个元素,即牌的序号
            int serialNumber=list.get(i);

            if(i<=2){
                lord.add(serialNumber);
                continue;
            }

            if(i%3==0){
                player1.add(serialNumber);
            }else if(i%3==1){
                player2.add(serialNumber);
            }else{
                player3.add(serialNumber);
            }
        }

        //4.看牌
        lookPoker("底牌",lord);
        lookPoker("钢脑壳",player1);
        lookPoker("大帅比",player2);
        lookPoker("蛋筒",player3);
    }
    /*
    参数一：玩家的名字
    参数二：牌的序号
     */
    public void lookPoker(String name,TreeSet<Integer> ts){
        System.out.print(name+": ");
        //遍历TreeSet集合，得到每一个序号
        //拿着序号，到map里面找，得到真正的牌
        for (Integer serialNumber : ts) {
            String poker=hm.get(serialNumber);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
