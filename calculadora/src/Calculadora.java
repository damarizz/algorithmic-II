import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Calculadora extends JFrame{
    float operador1, operador2;
    String signo;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton powerButton;
    private JButton dotButton;
    private JButton plusButton;
    private JButton lessButton;
    private JButton equalsButton;
    private JLabel CalcLabel;
    private JButton clearButton;
    private JButton divButton;
    private JButton timesButton;
    private JButton percButton;
    private JPanel CalcPanel;
    private boolean operationBefore = false;
    private JFrame jFrame = new JFrame();

    public Calculadora() {

        Border border = new LineBorder(Color.BLACK, 1);

        CalcLabel.setBorder(border);

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"8");
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operationBefore) {
                    CalcLabel.setText("");
                    operationBefore = false;
                }
                CalcLabel.setText(CalcLabel.getText()+"9");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcLabel.setText("");
                operationBefore = false;
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador1 = Float.parseFloat(CalcLabel.getText());
                signo = "/";
                CalcLabel.setText("");
            }
        });
        timesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador1 = Float.parseFloat(CalcLabel.getText());
                signo = "*";
                CalcLabel.setText("");
            }
        });
        percButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador1 = Float.parseFloat(CalcLabel.getText());
                signo = "%";
                CalcLabel.setText("");
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador1 = Float.parseFloat(CalcLabel.getText());
                signo = "+";
                CalcLabel.setText("");
            }
        });
        lessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador1 = Float.parseFloat(CalcLabel.getText());
                signo = "-";
                CalcLabel.setText("");
            }
        });
        powerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador1 = Float.parseFloat(CalcLabel.getText());
                signo = "^";
                CalcLabel.setText("");
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador2 = Float.parseFloat(CalcLabel.getText());
                operationBefore = true;
                switch (signo) {
                    case "+":
                        CalcLabel.setText(checkDecimals(operador1 + operador2));
                        break;
                    case "-":
                        CalcLabel.setText(checkDecimals(operador1 - operador2));
                        break;
                    case "*":
                        CalcLabel.setText(checkDecimals(operador1 * operador2));
                        break;
                    case "/":
                        if (operador2 == 0) {
                            CalcLabel.setText("Imposible dividir entre 0");
                            break;
                        }
                        CalcLabel.setText(checkDecimals(operador1 / operador2));
                        break;
                    case "%":
                        CalcLabel.setText(checkDecimals(operador1 * operador2 / 100));
                        break;
                    case "^":
                        CalcLabel.setText(checkDecimals((float) Math.pow(operador1, operador2)));
                        break;
                }
            }
        });

        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!CalcLabel.getText().contains(".") && !CalcLabel.getText().isEmpty()) {
                    CalcLabel.setText(CalcLabel.getText() + ".");
                }
            }
        });

    }
    public String checkDecimals(float num){
        String s = Float.toString(num);
        if (num % 1 == 0) {
            return s.substring(0, s.indexOf("."));
        }

        return s;
    }
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setContentPane(app.CalcPanel);
        app.setTitle("Calculadora");
        app.setSize(300, 400);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
