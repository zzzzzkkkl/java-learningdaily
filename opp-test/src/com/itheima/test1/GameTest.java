package com.itheima.test1;

public class GameTest {
    public static void main(String[] args) {
        /*文字版格斗游戏。每个角色的姓名、血量各不相同，在选定人物的时候（new对象时）这些信息就确定下来
        输出格式：
        乔峰举起拳头打了鸠摩智一下，造成了xx点伤害，鸠摩智还剩下xx点血
        鸠摩智举起拳头打了乔峰一下，造成了xx点伤害，乔峰还剩下xx点血
        ...
        乔峰KO了鸠摩智（谁的血量先为0，谁就先被KO)
         */
        Role r1=new Role("乔峰",100);
        Role r2=new Role("鸠摩智",100);

        //开始格斗，回合制游戏，不知道打多少轮结束，所以用while
        while(true){
            //r1打r2
            r1.attack(r2);
            //判断r2剩余血量
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"KO了"+r2.getName());
                break;
            }

            //r2打r1
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"KO了"+r1.getName());
                break;
            }
        }
    }
}
