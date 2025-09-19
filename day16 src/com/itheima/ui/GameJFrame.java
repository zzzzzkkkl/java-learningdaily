package com.itheima.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    //创建一个二维数组，用来管理数据，加载图片时根据二维数组中的数据进行加载
    int[][] data=new int[4][4];

    public GameJFrame(){
        //1.初始化界面
        initJFrame();

        //2.初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();

        //3.初始化图片，相当于把图片加载出来（根据打乱后的去加载）
        initImage();

        //创建的界面默认隐藏，要用setVisiable函数把他显示出来，写在最后
        this.setVisible(true);
    }

    //初始化数据
    private void initData() {
        //把一位数组中的数据打乱顺序，按照四个一组的方式添加到二维数组中
        //定义一个一维数组
        int[] tempArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //打乱数组中的数据 方法一：遍历数组，拿着每个元素和一个随机索引对应的元素交换
        Random r=new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机索引
            int index=r.nextInt(tempArr.length);
            //遍历得到的每个元素和随机索引对应的元素交换
            int temp=tempArr[i];
            tempArr[i]=tempArr[index];
            tempArr[index]=temp;
        }
        //给二维数组添加数据
        //方法一：遍历一维数组得到每个元素，将每个元素依次添加到二维数组中
        for (int i = 0; i < tempArr.length; i++) {
            data[i/4][i%4]=tempArr[i];
        }

    }

    //3.初始化图片，添加图片时按照二维数组中的数据进行添加
    private void initImage() {
        int number=1;
        //外循环，把内循环执行四次，即添加四行图片，每行四张
        for (int i = 0; i < 4; i++) {
            //内循环，一行添加四张图片
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int num=data[i][j];
                //创建图片ImageIcon对象
                ImageIcon icon = new ImageIcon("D:\\代码\\java-learningdaily(git\\day16-jigsawgame\\image\\animal\\animal3\\"+num+".jpg");
                //创建JLabel对象（图片管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定图片在界面中的位置
                jLabel.setBounds(105 * j, 105*i, 105, 105);
                //把管理容器放到界面中
                this.getContentPane().add(jLabel);
            }
        }
    }

    private void initJMenuBar() {
        //2.
        //初始化菜单，创建整个的菜单对象
        JMenuBar jMenuBar=new JMenuBar();
        //创建菜单上的两个选项的对象(功能，关于我们）
        JMenu functionJMenu=new JMenu("功能");//调用JMenu的有参构造
        JMenu aboutJMenu=new JMenu("关于我们");
        //创建选项下的条目对象
        JMenuItem replayItem=new JMenuItem("重新游戏");
        JMenuItem reloginItem=new JMenuItem("重新登录");
        JMenuItem closeItem=new JMenuItem("关闭游戏");

        JMenuItem accountItem=new JMenuItem("公众号");
        //将每一个选项下的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);
        //将菜单里的两个选项（功能，关于我们）添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);//表示把上面设置的菜单放到界面里
    }

    private void initJFrame() {
        //1.
        //设置界面的宽高
        this.setSize(603,680);//单位是像素
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //取消默认的居中方式，这样才能按坐标的位置添加组件
        this.setLayout(null);
    }
}
