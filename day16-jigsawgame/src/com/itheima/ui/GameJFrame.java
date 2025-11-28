package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //创建一个二维数组，用来管理数据，加载图片时根据二维数组中的数据进行加载
    int[][] data=new int[4][4];

    //空白方块在二维数组中的位置
    int x=0;
    int y=0;

    //定义个变量，记录当前展示图片的路径
    String path="image"+ File.separator+"animal"+File.separator+"animal3"+File.separator;

    //定义一个二维数组，存储正确的数据
    int[][] win={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //定义变量用来统计步数
    int step=0;

    //创建选项下的条目对象
    //更换图片下的
    JMenuItem girl=new JMenuItem("美女");
    JMenuItem animal=new JMenuItem("动物");
    JMenuItem sport=new JMenuItem("运动");

    JMenuItem replayItem=new JMenuItem("重新游戏");
    JMenuItem reloginItem=new JMenuItem("重新登录");
    JMenuItem closeItem=new JMenuItem("关闭游戏");

    JMenuItem accountItem=new JMenuItem("公众号");

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
        //注意：这里一维数组是从0-15，照片序号是从1-15，所以一维数组中的0对应的照片是空白的
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i]==0){
                x=i/4;
                y=i%4;
            }
            data[i/4][i%4]=tempArr[i];
        }

    }

    //3.初始化图片，添加图片时按照二维数组中的数据进行添加
    private void initImage() {
        //清空原本已出现的图片
        this.getContentPane().removeAll();

        if(victory()){
            //返回true，显示胜利图标
            JLabel winJLabel=new JLabel(new ImageIcon("D:\\代码\\java-learningdaily(git\\day16-jigsawgame\\image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }

        //将步数加载到界面中
        JLabel stepCount=new JLabel("步数:"+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);


        //路径分为两种：
        //绝对路径：一定从盘符开始。C:\   D:\
        //相对路径：不是从盘符开始
        //相对路径是相对于当前项目而言 aaa\\bbb表示在当前项目下找aaa文件夹，里面再找bbb文件夹

        //细节：
        //先加载的图片在上方，后加载的图片塞在下面，所以添加背景图片要放到最后

        //外循环，把内循环执行四次，即添加四行图片，每行四张
        for (int i = 0; i < 4; i++) {
            //内循环，一行添加四张图片
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int num=data[i][j];
                //创建图片ImageIcon对象
                ImageIcon icon = new ImageIcon(path+num+".jpg");
                //创建JLabel对象（图片管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定图片在界面中的位置
                jLabel.setBounds(105 * j+83, 105*i+134, 105, 105);
                //给图片添加边框 0:图片凸起 1：图片凹进去
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器放到界面中
                this.getContentPane().add(jLabel);
            }
        }

        //添加背景图片
        ImageIcon bg=new ImageIcon("image\\background.png");
        JLabel background=new JLabel(bg);
        background.setBounds(40,40,508,560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);

        //更新图片
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //2.
        //初始化菜单，创建整个的菜单对象
        JMenuBar jMenuBar=new JMenuBar();
        //创建菜单上的两个选项的对象(功能，关于我们）
        JMenu functionJMenu=new JMenu("功能");//调用JMenu的有参构造
        JMenu aboutJMenu=new JMenu("关于我们");

        //创建更换图片，因为更换图片这个选项里嵌套有美女、动物、运动，所以也用JMenu
        JMenu changeImage=new JMenu("更换图片");
        //将美女等条目添加到更换图片这个选项下面
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);
        //把更换图片添加到功能这个选项下
        functionJMenu.add(changeImage);

        //将每一个选项下的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);

        //给条目绑定事件
        //给更换图片下的条目添加事件
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

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
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下A不松时出现正确答案
    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==65){
            //把界面中的图片删除
            this.getContentPane().removeAll();
            //加载出来完整图片
            JLabel all=new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //加载背景图片
            //添加背景图片
            ImageIcon bg=new ImageIcon("image\\background.png");
            JLabel background=new JLabel(bg);
            background.setBounds(40,40,508,560);
            //把背景图片添加到界面中
            this.getContentPane().add(background);

            //刷新界面
            this.getContentPane().repaint();
        }
    }

    //键盘监听，按上下左右键来移动图片
    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利此方法不再执行
        if(victory()){
            return;
        }

        //对上下左右进行判断
        //左：37，上：38，右：39，下：40
        int code=e.getKeyCode();
        if(code==37){
            System.out.println("向左移动");
            if(y==3){
                return;
            }

            //把空白方块右边的数字往左移动
            data[x][y]=data[x][y+1];
            data[x][y+1]=0;
            y++;//更新空白方块的坐标
            //每移动一次，步数就增加一次
            step++;
            //调用方法，按照最新的数字更新图片
            initImage();
        }else if(code==38){
            System.out.println("向上移动");
            if(x==3){
                //表示空白方块已经在最下方
                return;
            }

            //把空白方块（x，y）下的数字往上移动，（x+1，y）就是空白方块下的
            data[x][y]=data[x+1][y];
            data[x+1][y]=0;
            x++;//更新空白方块的坐标
            //每移动一次，步数就增加一次
            step++;
            //调用方法，按照最新的数字更新图片
            initImage();

        }else if(code==39){
            System.out.println("向右移动");
            if(y==0){
                return;
            }

            //把空白方块左边的数字往右移
            data[x][y]=data[x][y-1];
            data[x][y-1]=0;
            y--;//更新空白方块的坐标
            //每移动一次，步数就增加一次
            step++;
            //调用方法，按照最新的数字更新图片
            initImage();
        }else if(code==40){
            System.out.println("向下移动");
            if(x==0){
                return;
            }

            //把空白图片上的照片移下来
            data[x][y]=data[x-1][y];
            data[x-1][y]=0;
            x--;//更新空白方块的坐标
            //每移动一次，步数就增加一次
            step++;
            //调用方法，按照最新的数字更新图片
            initImage();
        }else if(code==65){
            initImage();
        }else if(code==87){
            //按下w键时，原来二维数组里的数据就不要了
            data=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }
    }

    //判断data数组和win中的数据是否相同，即可判断是否胜利
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    //动作监听，按更换图片、重新游戏、登录、关闭游戏，关于我们
    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的条目
        Object obj=e.getSource();
        //判断当前点击的是什么
        if(obj==replayItem){
            //步数清零
            step=0;
            //再次打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();

        }else if(obj==reloginItem){
            //相当于返回登录界面
            //关闭当前游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        }else if(obj==closeItem){
            //直接关闭虚拟机
            System.exit(0);
        }else if(obj==accountItem){
            //创建弹框对象
            JDialog jDialog=new JDialog();
            //创建管理图片的容器
            JLabel jLabel=new JLabel(new ImageIcon("image\\about.png"));
            //设置位置和宽高，以确保图片在弹框里面
            jLabel.setBounds(0,0,258,258);
            //把图片添加到弹框中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344,344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭就无法操作下面的界面
            jDialog.setModal(true);

            //让弹框显示出来
            jDialog.setVisible(true);
        }else if(obj.equals(girl)){
            randomChoosePhoto(girl);
        }else if(obj.equals(animal)){
            randomChoosePhoto(animal);
        }else if(obj.equals(sport)){
            randomChoosePhoto(sport);
        }
    }
    public void randomChoosePhoto(Object obj){
        //步数清零
        step=0;
        //打乱二维数组汇总的数据
        initData();
        //选取随机图片，即选择随机path
        Random r=new Random();
        if(obj.equals(girl)){
            int index=r.nextInt(13)+1;
            path="image"+"\\girl\\girl"+index+File.separator;
        }else if(obj.equals(animal)){
            int index=r.nextInt(8)+1;
            path="image"+"\\animal\\animal"+index+File.separator;
        }else if(obj.equals(sport)){
            int index=r.nextInt(10)+1;
            path="image"+"\\sport\\sport"+index+File.separator;
        }
        //重新图片
        initImage();
    }
}
