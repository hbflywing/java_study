package win.sz90.ui;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by shawn.zeng on 2018/5/17.
 */
public class SubmitSwingProgram extends JFrame{
    JLabel label;
    public SubmitSwingProgram() throws InterruptedException {
        super("hello Swing");
        label = new JLabel("A Label");
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,1000);
        label.setText("ggggg");
        setVisible(true);
        TimeUnit.SECONDS.sleep(2);
    }

    static SubmitSwingProgram ssp;

    public static void main(String[] args) throws InterruptedException {
        SwingUtilities.invokeLater(()-> {
            try {
                ssp = new SubmitSwingProgram();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        SwingUtilities.invokeLater(()-> ssp.label.setText("HEEEEEEE"));
    }

}
