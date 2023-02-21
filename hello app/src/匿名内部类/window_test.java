package 匿名内部类;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window_test {
    public static void main(String[] args) {
        JFrame WINDOW=new JFrame("登陆界面");

        JButton btn=new JButton("登录");

        WINDOW.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(WINDOW,"皇家马德里");
            }
        });

        WINDOW.setSize(300,300);
        WINDOW.setVisible(true);

    }
}
