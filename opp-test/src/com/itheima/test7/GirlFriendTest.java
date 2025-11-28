package com.itheima.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        /*定义数组存储4个女朋友的对象。女朋友的属性：姓名、年龄、性别、爱好
        要求1：计算出平均年龄
        要求2：统计出比平均年龄小的女朋友有几个，并把他们的信息打印出来
         */
        //创建数组
        GirlFriend[] arr=new GirlFriend[4];
        //创建女朋友对象
        GirlFriend gf1=new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        GirlFriend gf2=new GirlFriend("小丹丹",19,"萌妹子","玩游戏");
        GirlFriend gf3=new GirlFriend("小惠惠",20,"萌妹子","看书学习");
        GirlFriend gf4=new GirlFriend("小莉莉",21,"憨妹子","睡觉");
        //将对象添加到数组
        arr[0]=gf1;arr[1]=gf2;arr[2]=gf3;arr[3]=gf4;
        //求年龄和，再求平均值
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf=arr[i];
            sum+=gf.getAge();
        }
        int avg=sum/arr.length;
        //看有几个比平均小
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf=arr[i];
            if(gf.getAge()<avg){
                count++;
                System.out.println(gf.getName()+","+gf.getAge()+","+gf.getGender()+","+gf.getHooby());
            }
        }
        System.out.println(count+"个");
    }
}
