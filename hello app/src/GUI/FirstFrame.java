package GUI;

import java.awt.*;

public class FirstFrame extends Frame {
    public static void main(String[] args) {
        FirstFrame fr = new FirstFrame("hello");
        fr.setSize(300,300);
        fr.setBackground(Color.white);
        fr.setVisible(true);
    }
    public FirstFrame(String title) throws HeadlessException {
        super(title);
    }
    
}
