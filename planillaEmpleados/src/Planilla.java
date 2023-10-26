import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Planilla extends JFrame{
    private JFrame jFrame = new JFrame();
    private JPanel PlanillaForm;
    private JRadioButton agregarRadioButton;
    private JRadioButton buscarRadioButton;
    private JRadioButton mostrarRadioButton;
    private JPanel Acciones;
    private JPanel Agregar;
    private JPanel Buscar;
    private JPanel Mostrar;
    private JPanel TipoTrabajador;
    private JPanel AgregarCommon;
    private JPanel Empleado;
    private JPanel Consultor;
    private JRadioButton empleadoRadioButton;
    private JRadioButton consultarRadioButton;
    private JTextField CódigoEmpleadotextField;
    private JButton buscarButton;
    private JLabel CódigoEmpleadoJLabel;
    private JButton mostrarTrabajadoresRegistradosButton;
    private JButton mostrarConsultoresRegistradosButton;
    private JButton mostrarEmpleadosRegistradosButton;
    private JTextField codigoTextField;
    private JTextField nombresTextField;
    private JTextField basicoTextField;
    private JTextField faltasTextField;
    private JTextField tasaTextField;
    private JTextField bonificacionTextField;
    private JButton CALCULARYAGREGARButton;
    private JLabel retencionesLabel;

    public Planilla() {
        agregarRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)Acciones.getLayout()).show(Acciones, "AgregarCard");
            }
        });
        buscarRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)Acciones.getLayout()).show(Acciones, "BuscarCard");
            }
        });
        mostrarRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)Acciones.getLayout()).show(Acciones, "MostrarCard");
            }
        });
        CALCULARYAGREGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo;
                String nombres;
                double basico;
                float tasa;

                try {
                    codigo = Integer.parseInt(codigoTextField.getText());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor entero para el código del trabajador.");
                    return;
                }
                if (codigo <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Código inválido.");
                    return;
                }
                try {
                    nombres = nombresTextField.getText();
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese nombres válidos del trabajador.");
                    return;
                }
                if (nombres == null || nombres.isEmpty()) {
                    JOptionPane.showMessageDialog(jFrame, "Debe ingresar los nombres del trabajador.");
                    return;
                }
                try {
                    basico = Double.parseDouble(basicoTextField.getText());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor válido para el sueldo básico.");
                    return;
                }
                if (basico <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Sueldo básico inválido.");
                    return;
                }
                try {
                    tasa = Float.parseFloat(basicoTextField.getText());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor válido para la tasa.");
                    return;
                }
                if (tasa <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Tasa inválida.");
                    return;
                }
                if (empleadoRadioButton.isSelected()) {
                    int diasFalta;

                    try {
                        diasFalta = Integer.parseInt(faltasTextField.getText());
                    }catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese un entero valido");
                        return;
                    }

                    if (diasFalta < 0) {
                        JOptionPane.showMessageDialog(jFrame,"El numero de faltas no puede ser menor a 0");
                    }
                    Empleado empleado = new Empleado(codigo, nombres, basico, diasFalta)
                    retencionesLabel.setText();
                } else {
                    double bonificacion;

                    try {
                        bonificacion = Double.parseDouble(bonificacionTextField.getText());
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese una bonificacion valida");
                    }
                }


            }
        });
    }

    public static void main(String[] args) {
        Planilla app = new Planilla();
        app.setContentPane(app.PlanillaForm);
        app.setTitle("Planilla de empleados");
        app.setSize(500, 500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
