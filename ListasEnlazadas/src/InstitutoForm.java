import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstitutoForm extends JFrame {
    private JPanel panel1;
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
    private JFrame jFRame = new JFrame();

    public InstitutoForm() {
        BUSCARModificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int code = Integer.parseInt(modificarBuscarTextField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFRame, "Ingrese un codigo valido");
                }


            }
        });
    }

    private void createUIComponents() {

    }
}
