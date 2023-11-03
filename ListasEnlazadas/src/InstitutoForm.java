import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstitutoForm extends JFrame {
    private JPanel InstitutoForm;
    private JRadioButton agregarRadioButton;
    private JRadioButton modificarRadioButton;
    private JRadioButton buscarRadioButton;
    private JRadioButton eliminarRadioButton;
    private JPanel AgregarPanel;
    private JPanel ModificarPanel;
    private JPanel BuscarPanel;
    private JPanel EliminarPanel;
    private JButton AgregarButton;
    private JTextField CodigoTextField;
    private JTextField NombresTextField;
    private JRadioButton alFinalRadioButton;
    private JRadioButton posiciónRadioButton;
    private JRadioButton alInicioRadioButton;
    private JTextField PosicionTextField;
    private JRadioButton porCódigoRadioButton;
    private JRadioButton porNombreRadioButton;
    private JTextField textField4;
    private JTextField textField5;
    private JButton BUSCARButton;
    private JTextField modificarBuscarTextField;
    private JTextField nuevoNombreTextField;
    private JRadioButton porCódigoRadioButton1;
    private JRadioButton porPosiciónRadioButton;
    private JPanel EliminarCardPanel;
    private JPanel CodigoPanel;
    private JPanel PosicionPanel;
    private JTextField EliminarCodigoTextField;
    private JButton EliminarButton;
    private JTextField textField3;
    private JButton ELIMINARButton;
    private JButton BUSCARModificarButton;
    private JButton MODIFICARButton;
    private JPanel TipoAccionPanel;
    private JPanel BuscarCardPanel;
    private JPanel BuscarCodigoCardPanel;
    private JPanel BuscarNombreCardPanel;
    private JFrame jFrame = new JFrame();

    public InstitutoForm() {
        BUSCARModificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int code = Integer.parseInt(modificarBuscarTextField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un codigo valido");
                }


            }
        });
        agregarRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)TipoAccionPanel.getLayout()).show(TipoAccionPanel, "AgregarCard");
            }
        });
        modificarRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)TipoAccionPanel.getLayout()).show(TipoAccionPanel, "ModificarCard");
            }

        });
        buscarRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)TipoAccionPanel.getLayout()).show(TipoAccionPanel, "BuscarCard");
            }
        });
        eliminarRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)TipoAccionPanel.getLayout()).show(TipoAccionPanel, "EliminarCard");
            }
        });
        porCódigoRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)EliminarCardPanel.getLayout()).show(EliminarCardPanel, "CodigoEliminarCard");
            }
        });
        porPosiciónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)EliminarCardPanel.getLayout()).show(EliminarCardPanel, "PosicionEliminarCard");
            }
        });
        porCódigoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)BuscarCardPanel.getLayout()).show(BuscarCardPanel, "BuscarCodigoCard");
            }
        });
        porNombreRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)BuscarCardPanel.getLayout()).show(BuscarCardPanel, "BuscarNombreCard");
            }
        });
        AgregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo;
                String nombres;

                try {
                    nombres = NombresTextField.getText();
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese nombres válidos para el estudiante.");
                    return;
                }
                try {
                    codigo = Integer.parseInt(CodigoTextField.getText());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un valor entero para el código del estudiante.");
                    return;
                }
                if (codigo <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Código de estudiante inválido.");
                    return;
                }

            }
        });
    }

    public static void main(String[] args) {
        InstitutoForm app = new InstitutoForm();
        app.setContentPane(app.InstitutoForm);
        app.setTitle("Registro de Alumnos");
        app.setSize(500, 500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
