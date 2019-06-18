package com.wanghonghui.test;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.sun.awt.AWTUtilities;

@SuppressWarnings("restriction")
public class FlyingDragon extends JFrame implements Runnable {

    // ImageIcon ii = new ImageIcon("C:\\Users\\ee\\Desktop\\test\\test\\images\\1.png");// 这里换成你的图片文件名,放在你的项目名的文件夹中
    ImageIcon ii = new ImageIcon("C:\\Users\\Qinglanhui\\Desktop\\飞龙\\1.png");// 这里换成你的图片文件名,放在你的项目名的文件夹中

    FlyingDragon() {
        setSize(495, 331);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        AWTUtilities.setWindowOpaque(this, false);// 窗口透明关键代码
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(ii.getImage(), 0, 0, 495, 331, null);
    }

    int count = 1;

    public void run() {
        while (true) {
            try {
                Thread.sleep(50);// 这里是幻灯片播放间隔的时间,这里为500毫秒=0.5秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // int i=(int)(Math.random()*35)+1;//这里是产生从1-3的随机数,如果你有6个图片文件,把3改成6就是从1-6的随机数了.
            if (count <= 35) {
                ii = new ImageIcon("C:\\Users\\Qinglanhui\\Desktop\\飞龙\\" + count + ".png");// 这里调用你的图片文件,如果你有6个图片文件,改成从1-6的文件名方便调用
            } else {
                this.setVisible(false);
            }
            count++;
            this.repaint();
        }
    }

    public static void main(String[] args) {
        FlyingDragon flyingDragon = new FlyingDragon();
        Thread t = new Thread(flyingDragon);
        t.start();
    }
}