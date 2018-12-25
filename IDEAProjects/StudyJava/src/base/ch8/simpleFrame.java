package base.ch8;

import javax.swing.*;
import java.awt.*;

public class simpleFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{//事件分派线程
            MyFrame myFrame = new MyFrame();
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
        });
    }
}
class MyFrame extends JFrame {
    public static final int WIDTH = 100;
    public static final int HEIGHT = 100;

    public MyFrame() {
        this.setSize(WIDTH, HEIGHT);
    }
}