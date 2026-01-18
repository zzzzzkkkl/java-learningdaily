package domain;



import game.GameJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {

    //游戏的主界面
    GameJFrame gameJFrame;
    //属性
    //牌的名字
    String name;
    //牌显示正面还是反面
    boolean up;
    //是否可点击
    boolean canClick = false;
    //当前状态，是否已经被点击
    //如果是没有被点击的状态，此时被点击了，牌会执行弹起的操作
    //如果是已经被点击的状态，此时再被点击，牌会执行降落的操作
    boolean clicked = false;

    //构造方法
    public Poker(GameJFrame m, String name, boolean up) {
        this.gameJFrame = m;
        this.name = name;
        this.up = up;
        //判断当前的牌是显示正面还是背面
        if (this.up){
            this.turnFront();
        }else {
            this.turnRear();
        }
        //设置牌的宽高大小
        this.setSize(71, 96);
        //把牌显示出来
        this.setVisible(true);
        //给每一张牌添加鼠标监听
        this.addMouseListener(this);
    }

    public Poker() {
    }

    public Poker(GameJFrame gameJFrame, String name, boolean up, boolean canClick, boolean clicked) {
        this.gameJFrame = gameJFrame;
        this.name = name;
        this.up = up;
        this.canClick = canClick;
        this.clicked = clicked;
    }

    //成员方法：
    //显示正面
    public void turnFront() {
        this.setIcon(new ImageIcon("doudizhu\\farmerandlord\\image\\poker\\" + name + ".png"));
        this.up = true;
    }

    //显示背面
    public void turnRear() {
        this.setIcon(new ImageIcon("doudizhu\\farmerandlord\\image\\poker\\rear.png"));
        this.up = false;
    }


    //出牌时，需要点击牌
    //被点击之后，牌向上移动20个像素
    //再次被点击，牌回落20个像素
    @Override
    public void mouseClicked(MouseEvent e) {
        //判断当前的牌可以被点击吗
        if (canClick) {
            Point from = this.getLocation();
            //牌的位移
            int step;
            if (clicked){
                //被点击了，表示牌要降落
                step = 20;
            }else {
                step = -20;
            }
            //修改clicked的值
            clicked = !clicked;
            //修改牌的位置
            Point to = new Point(from.x, from.y + step);
            this.setLocation(to);
        }
    }

    public void mouseEntered(MouseEvent arg0) {
    }

    public void mouseExited(MouseEvent arg0) {
    }

    public void mouseReleased(MouseEvent arg0) {
    }

    public void mousePressed(MouseEvent e) {
    }


    /**
     * 获取
     * @return gameJFrame
     */
    public GameJFrame getGameJFrame() {
        return gameJFrame;
    }

    /**
     * 设置
     * @param gameJFrame
     */
    public void setGameJFrame(GameJFrame gameJFrame) {
        this.gameJFrame = gameJFrame;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{gameJFrame = " + gameJFrame + ", name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }
}

