package win.sz90.ui;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by shawn.zeng on 2018/5/17.
 */
public class HelloSwing {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);

        JLabel label = new JLabel("a label");

        frame.add(label);
        TimeUnit.SECONDS.sleep(2);
        label.setText("1111");
        TimeUnit.SECONDS.sleep(2);
        SwingUtilities.invokeLater(()-> label.setText("Hey"));
    }
}
