package �����ڲ���;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window_test {
    public static void main(String[] args) {
        JFrame WINDOW=new JFrame("��½����");

        JButton btn=new JButton("��¼");

        WINDOW.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(WINDOW,"�ʼ������");
            }
        });

        WINDOW.setSize(300,300);
        WINDOW.setVisible(true);

    }
}
