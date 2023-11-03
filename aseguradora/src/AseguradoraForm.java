import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AseguradoraForm extends JFrame {
    private JFrame jFrame = new JFrame();
    private JButton buscarButton;
    private JButton agregarButton;
    private JButton mostrarButton;
    private JRadioButton seguroMédicoRadioButton;
    private JRadioButton seguroViviendaRadioButton;
    private JTextField PolizaTextField;
    private JTextField NombresTextField;
    private JTextField CoberturaTextField;
    private JTextField PrimaTextField;
    private JTextField PlanTextField;
    private JTextField EdadTextField;
    private JTextField SaludTextField;
    private JButton AGREGARButton;
    private JTextField UbicacionTextField;
    private JButton AGREGARButton1;
    private JPanel AgregarCardPanel;
    private JPanel CardBase;
    private JPanel MostrarCardPanel;
    private JPanel BuscarCardPanel;
    private JTextField PrecioTextField;
    private JTextField PorcentajeTextField;
    private JTextField PolizaBuscarTextField;
    private JButton BUSCARButton;
    private JPanel AseguradoraJFrame;
    private JPanel TipoSeguroPanel;
    private JPanel MedicoCardPanel;
    private JPanel ViviendaCardPanel;

    List <Seguro> seguros = new ArrayList<>();

    public AseguradoraForm() {
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)CardBase.getLayout()).show(CardBase, "AgregarCard");
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)CardBase.getLayout()).show(CardBase, "MostrarCard");
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)CardBase.getLayout()).show(CardBase, "BuscarCard");
            }
        });
        seguroMédicoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)TipoSeguroPanel.getLayout()).show(TipoSeguroPanel, "MedicoCard");
            }
        });
        seguroViviendaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)TipoSeguroPanel.getLayout()).show(TipoSeguroPanel, "ViviendaCard");
            }
        });
        AGREGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int poliza;
                String nombre;
                double prima;
                String planSeguro = PlanTextField.getText();
                double cobertura;

                try {
                    poliza = Integer.parseInt(PolizaTextField.getText());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor entero para el N° de póliza.");
                    return;
                }
                if (poliza <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Póliza inválido.");
                    return;
                }
                try {
                    nombre = NombresTextField.getText();
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese nombres válidos del cliente.");
                    return;
                }
                if (nombre == null || nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(jFrame, "Debe ingresar los nombres del cliente.");
                    return;
                }

                try {
                    prima = Double.parseDouble(PolizaTextField.getText());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor entero para el valor de la prima.");
                    return;
                }
                if (prima <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Prima inválido.");
                    return;
                }

                if (planSeguro == null || PlanTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(jFrame, "Debe ingresar los nombres del cliente.");
                    return;
                }

                try {
                    cobertura = Double.parseDouble(PolizaTextField.getText());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor valido para la cobertura.");
                    return;
                }
                if (cobertura <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Cobertura inválido.");
                    return;
                }

                if (seguroMédicoRadioButton.isSelected()) {
                    int edad;
                    String salud = SaludTextField.getText();

                    try {
                        edad = Integer.parseInt(EdadTextField.getText());
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese una edad valida");
                        return;
                    }

                    if (edad < 0) {
                        JOptionPane.showMessageDialog(jFrame, "La edad no puede ser menor a 0");
                        return;
                    }

                    seguros.add(new Medico(poliza, nombre, prima, planSeguro, edad, salud));
                } else {
                    String ubicacion = UbicacionTextField.getText();
                    double precio;

                    try {
                        precio = Double.parseDouble(PrecioTextField.getText());
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Valor invalido");
                        return;
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        AseguradoraForm app = new AseguradoraForm();
        app.setContentPane(app.AseguradoraJFrame);
        app.setTitle("Sistema de Seguros");
        app.setSize(500, 500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
