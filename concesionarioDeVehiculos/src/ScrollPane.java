import javax.swing.*;
import java.awt.*;

public class ScrollPane extends JFrame {
    JLabel label = new JLabel();
    JScrollPane jScrollPane = new JScrollPane();

    public ScrollPane (String s) {
        label.setText(s);
        jScrollPane.setViewportView(label);
        jScrollPane.setMinimumSize(new Dimension(300,500));
        jScrollPane.setSize(400,700);
        jScrollPane.setPreferredSize(new Dimension(400,700));
        add(jScrollPane);
    }


    public void main(String s) {
        ScrollPane sp = new ScrollPane(s);
        sp.setMinimumSize(new Dimension(300, 500));
        sp.setTitle("Registro completo");
        sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sp.setSize(400, 700);
        sp.setPreferredSize(new Dimension(400, 700));
        setVisible(true);
    }
}



