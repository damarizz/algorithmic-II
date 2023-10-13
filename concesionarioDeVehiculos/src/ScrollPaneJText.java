import javax.swing.*;
import java.awt.*;

public class ScrollPaneJText {
    public void run(String s) {
        JFrame frame = new JFrame();

        JTextPane tp = new JTextPane();
        tp.setEditable(false);
        tp.setText(s);
        tp.setSize(new Dimension(200,550));
        JScrollPane sp = new JScrollPane(tp);
        sp.setSize(new Dimension(200, 550));
        frame.getContentPane().add( sp );
        frame.setSize(new Dimension(200,550));
        frame.pack();
        frame.setVisible( true );
    }
}
