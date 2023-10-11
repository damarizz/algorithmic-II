import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Concesionario extends JFrame {
    private JRadioButton registrarVehículoRadioButton;
    private JRadioButton buscarRegistroRadioButton;
    private JPanel Common;
    private JPanel RegistrarVehiculo;
    private JPanel TipoVehiculo;
    private JPanel Automóvil;
    private JPanel Camión;
    private JPanel BuscarRegistro;
    private JPanel Option;
    private JPanel ConcesionarioForm;
    private JRadioButton automóvilRadioButton;
    private JRadioButton camiónRadioButton;
    private JTextField marcaTextField;
    private JTextField pasajerosTextField;
    private JTextField potenciaTextField;
    private JTextField precioTextField;
    private JButton RegistrarButton;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField capacidadTolvaTextField;
    private JTextField tolvaTextField;
    private JButton BUSCARButton;
    private JRadioButton automóvilRadioButton1;
    private JRadioButton camiónRadioButton1;
    private JTextField textField1;

    public Concesionario() {
        registrarVehículoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)Option.getLayout()).show(Option, "RegistrarVehiculo");
            }
        });
        buscarRegistroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)Option.getLayout()).show(Option, "BuscarRegistro");
            }
        });
        automóvilRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)TipoVehiculo.getLayout()).show(TipoVehiculo, "Automóvil");
            }
        });
        camiónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)TipoVehiculo.getLayout()).show(TipoVehiculo, "Camión");
            }
        });
    }

    public static void main(String[] args) {
        Concesionario app = new Concesionario();
        app.setContentPane(app.ConcesionarioForm);
        app.setTitle("Concesionario de Vehículos");
        app.setSize(500, 500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
