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
    private JTextField searchMarcaTextField;
    private JButton mostrarRegistrosButton;
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
                String potencia;
                double precio;

                try {
                    marca = marcaTextField.getText();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor válido para la marca del vehículo.");
                    return;
                }
                if (marca == null || marca.equals("")) {
                    JOptionPane.showMessageDialog(jFrame, "Debe ingresar una marca del vehículo.");
                    return;
                }


                try {
                    pasajeros = Integer.parseInt(pasajerosTextField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor entero válido para capacidad de pasajeros.");
                    return;
                }
                if (pasajeros <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Debe haber espacio para al menos un pasajero.");
                    return;
                }

                try {
                    potencia = potenciaTextField.getText();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor, ingrese un valor válido para la potencia del vehículo (hp/rpm).");
                    return;
                }
                if (potencia == null || potencia.isEmpty()) {
                    JOptionPane.showMessageDialog(jFrame, "Debe ingresar la potencia del vehículo.");
                    return;
                }

                try {
                    precio = Double.parseDouble(precioTextField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Por favor ingrese un valor valido para el precio del vehículo en dólares.");
                    return;
                }
                if (precio < 0) {
                    JOptionPane.showMessageDialog(jFrame, "El precio no puede ser negativo.");
                    return;
                }

                if (automóvilRadioButton.isSelected()) {
                    String maletera = maleteraTextField.getText();
                    int capacidadMaletera;

                    Automovil auto = (Automovil) vehiculos.buscarVehiculo(marca);

                    if (auto != null && auto.getType().equals("Automovil")) {
                        JOptionPane.showMessageDialog(jFrame, "Marca ya registrada para automóvil.");
                        return;
                    }

                    if (maletera == null) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese un tipo de maletera.");
                        return;
                    }

                    try {
                        capacidadMaletera = Integer.parseInt(capacidadMaleteraTextField.getText());
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese un valor entero válido para la capacidad de la maletera.");
                        return;
                    }

                    if (capacidadMaletera < 0) {
                        JOptionPane.showMessageDialog(jFrame, "La capacidad de la maletera no puede ser negativa");
                        return;
                    }

                    vehiculos.addVehiculo(new Automovil(marca, pasajeros, potencia, precio, maletera, capacidadMaletera));
                    JOptionPane.showMessageDialog(jFrame, "Agregado con éxito.");

                    maleteraTextField.setText(null);
                    capacidadMaleteraTextField.setText(null);

                } else {
                    String tolva = tolvaTextField.getText();
                    double cargaTolva = -1;

                    Camion camion = (Camion) vehiculos.buscarVehiculo(marca);

                    if (camion != null && camion.getType().equals("Camion")) {
                        JOptionPane.showMessageDialog(jFrame, "Marca ya registrada para camión.");
                        return;
                    }
                    if (tolva == null || tolva.equals("")) {
                        JOptionPane.showMessageDialog(jFrame, "Debe ingresar un modelo de tolva (abierta, cerrada, etc.).");
                        return;
                    }

                    try {
                        cargaTolva = Double.parseDouble(capacidadTolvaTextField.getText());
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese un valor válido para la capacidad de la tolva.");
                    }
                    if (cargaTolva < 0) {
                        JOptionPane.showMessageDialog(jFrame, "La capacidad de la tolva no puede ser negativa.");
                        return;
                    }

                    vehiculos.addVehiculo(new Camion(marca, pasajeros, potencia, precio, tolva, cargaTolva));
                    JOptionPane.showMessageDialog(jFrame, "Agregado con éxito.");

                    tolvaTextField.setText(null);
                    capacidadTolvaTextField.setText(null);

                }
                marcaTextField.setText(null);
                pasajerosTextField.setText(null);
                potenciaTextField.setText(null);
                precioTextField.setText(null);
            }
        });
        BUSCARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = searchMarcaTextField.getText();

                if (marca.equals("")) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese una marca.");
                    return;
                }

                Vehiculo vehiculo = vehiculos.buscarVehiculo(marca);

                if (automóvilRadioButton1.isSelected()) {

                    if (vehiculo == null || vehiculo.getType().equals("Camion")) {
                        JOptionPane.showMessageDialog(jFrame, "Marca no encontrada para automóvil.");
                        return;
                    }

                    Automovil automovil = (Automovil) vehiculos.buscarVehiculo(marca);

                    String s = "Tipo: Automóvil\n" +
                                "Marca: " + automovil.getMarca() + "\n" +
                                "N° de pasajeros: " + automovil.getPasajeros() + "\n" +
                                "Potencia: " + automovil.getPotencia() + "\n" +
                                "Precio: $" + automovil.getPrecio() + "\n" +
                                "Maletera: " + automovil.getMaletera() + "\n" +
                                "Capacidad de maletera: " + automovil.getCapacidadMaletera() + "L";

                    JOptionPane.showMessageDialog(jFrame, s);
                } else {

                    if (vehiculo == null || vehiculo.getType().equals("Automovil")) {
                        JOptionPane.showMessageDialog(jFrame, "Marca no encontrada para camion");
                        return;
                    }

                    Camion camion = (Camion) vehiculos.buscarVehiculo(marca);

                    String s = "Tipo: Camión\n" +
                            "Marca: " + camion.getMarca() + "\n" +
                            "N° de pasajeros: " + camion.getPasajeros() + "\n" +
                            "Potencia: " + camion.getPotencia() + "\n" +
                            "Precio: $" + camion.getPrecio() + "\n" +
                            "Tolva: " + camion.getTolva() + "\n" +
                            "Capacidad de la tolva: " + camion.getCargaTolva() + "K";

                    JOptionPane.showMessageDialog(jFrame, s);
                }

                searchMarcaTextField.setText("");
            }
        });
        mostrarRegistrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vehiculos.getSize() == 0) {
                    JOptionPane.showMessageDialog(jFrame, "No se han registrado vehículos todavía.");
                    return;
                }

                String s = "";

                for (int i = 0; i < vehiculos.getSize(); i++) {
                    s += "Vehiculo N°" + (i+1) + "\n";

                    if (vehiculos.at(i).getType().equals("Automovil")) {
                        s += ((Automovil) vehiculos.at(i)).toString();
                    } else {
                        s += ((Camion) vehiculos.at(i)).toString();
                    }
                    s += "\n";
                }

                ScrollPaneJText jscroll = new ScrollPaneJText();
                jscroll.run( s );
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
