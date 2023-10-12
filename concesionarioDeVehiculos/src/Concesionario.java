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
    private JButton registrarButton;
    private JTextField capacidadMaleteraTextField;
    private JTextField maleteraTextField;
    private JTextField capacidadTolvaTextField;
    private JTextField tolvaTextField;
    private JButton BUSCARButton;
    private JRadioButton automóvilRadioButton1;
    private JRadioButton camiónRadioButton1;
    private JTextField textField1;
    private ColeccionVehiculo vehiculos = new ColeccionVehiculo();
    private JFrame jFrame = new JFrame();

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
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca;
                int pasajeros;
                float potencia;
                double precio;

                try {
                    marca = marcaTextField.getText();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor valido para marca");
                    return;
                }
                if (marca == null || marca.equals("")) {
                    JOptionPane.showMessageDialog(jFrame, "Debe ingresar una marca");
                    return;
                }

                try {
                    pasajeros = Integer.parseInt(pasajerosTextField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor entero valido para pasajeros");
                    return;
                }
                if (pasajeros <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Debe haber al menos un pasajero");
                    return;
                }

                try {
                    potencia = Float.parseFloat(potenciaTextField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor valido para potencia");
                    return;
                }
                if (potencia <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "La potencia no puede ser menor o igual a 0");
                    return;
                }

                try {
                    precio = Double.parseDouble(precioTextField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor valido para precio");
                    return;
                }
                if (precio < 0) {
                    JOptionPane.showMessageDialog(jFrame, "El precio no puede ser negativo");
                    return;
                }

                if (automóvilRadioButton.isSelected()) {
                    String maletera = maleteraTextField.getText();
                    int capacidadMaletera;

                    if (maletera == null) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese un tipo de maletera");
                        return;
                    }

                    try {
                        capacidadMaletera = Integer.parseInt(capacidadMaleteraTextField.getText());
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese un valor entero valido para la capacidad de la maletera");
                        return;
                    }

                    if (capacidadMaletera < 0) {
                        JOptionPane.showMessageDialog(jFrame, "La capacidad de la maletera no puede ser negativa");
                        return;
                    }

                    vehiculos.addVehiculo(new Automovil(marca, pasajeros, potencia, precio, maletera, capacidadMaletera));
                    JOptionPane.showMessageDialog(jFrame, "Agregado con exito");

                    maleteraTextField.setText(null);
                    capacidadMaleteraTextField.setText(null);
                } else {
                    String tolva = tolvaTextField.getText();
                    double cargaTolva = -1;

                    if (tolva == null || tolva.equals("")) {
                        JOptionPane.showMessageDialog(jFrame, "Debe ingresar una tolva");
                        return;
                    }

                    try {
                        cargaTolva = Double.parseDouble(capacidadTolvaTextField.getText());
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese un valor valido para la capacidad de la tolva");
                    }
                    if (cargaTolva < 0) {
                        JOptionPane.showMessageDialog(jFrame, "La capacidad de la tolva no puede ser negativa");
                        return;
                    }

                    vehiculos.addVehiculo(new Camion(marca, pasajeros, potencia, precio, tolva, cargaTolva));
                    JOptionPane.showMessageDialog(jFrame, "Agregado con exito");
                    tolvaTextField.setText(null);
                    capacidadTolvaTextField.setText(null);

                }
                marcaTextField.setText(null);
                pasajerosTextField.setText(null);
                potenciaTextField.setText(null);
                precioTextField.setText(null);
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
