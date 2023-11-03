import jdk.nashorn.internal.scripts.JO;

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
    private JTextField BuscarCodigoTextField;
    private JTextField BuscarNombreTextField;
    private JButton BuscarCodigoButton;
    private JTextField modificarBuscarTextField;
    private JTextField nuevoNombreTextField;
    private JRadioButton porCódigoRadioButton1;
    private JRadioButton porPosiciónRadioButton;
    private JPanel EliminarCardPanel;
    private JPanel CodigoPanel;
    private JPanel PosicionPanel;
    private JTextField EliminarCodigoTextField;
    private JButton EliminarCodigoButton;
    private JTextField PosicionEliminarTextField;
    private JButton EliminarPosicionButton;
    private JButton BUSCARModificarButton;
    private JButton MODIFICARButton;
    private JPanel TipoAccionPanel;
    private JPanel BuscarCardPanel;
    private JPanel BuscarCodigoCardPanel;
    private JPanel BuscarNombreCardPanel;
    private JButton BuscarNombreButton;
    private JFrame jFrame = new JFrame();
    Lista lista = new Lista();

    public InstitutoForm() {
        BUSCARModificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int code;
                try {
                    code = Integer.parseInt(modificarBuscarTextField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un codigo valido");
                    return;
                }

                if (lista.existe(code)) {
                    nuevoNombreTextField.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(jFrame, "Codigo inexistente");
                }
            }
        });

        MODIFICARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nuevoNombreTextField.isEnabled()) {
                    String nuevoNombre = nuevoNombreTextField.getText();
                    int code;

                    try {
                        code = Integer.parseInt(modificarBuscarTextField.getText());
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Ingrese un codigo valido");
                        return;
                    }

                    lista.modificarNombrePorCodigo(code, nuevoNombre);
                    nuevoNombreTextField.setText("");
                    nuevoNombreTextField.setEnabled(false);
                    JOptionPane.showMessageDialog(jFrame, "Nombre actualizado correctamente");
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
        posiciónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PosicionTextField.setEnabled(true);
                PosicionTextField.setEditable(true);
            }
        });
        posiciónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PosicionTextField.setEnabled(false);
                PosicionTextField.setEditable(false);
            }
        });
        posiciónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PosicionTextField.setEnabled(false);
                PosicionTextField.setEditable(false);
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
                if (lista.existe(codigo)) {
                    JOptionPane.showMessageDialog(jFrame, "Ya existe un alumno con ese codigo");
                    return;
                }

                if (alInicioRadioButton.isSelected()) {
                    lista.addInicio(codigo, nombres);
                } if (posiciónRadioButton.isSelected()) {
                    int posicion;
                    try {
                        posicion = Integer.parseInt(PosicionTextField.getText());
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(jFrame, "Posicion invalida");
                        return;
                    }

                    if (lista.longitud() < posicion) {
                        JOptionPane.showMessageDialog(jFrame, "No se puede ingresar en una posicion inexistente");
                        return;
                    }
                    lista.insertNodo(codigo, nombres, posicion);
                } else {
                    lista.addFinal(codigo, nombres);
                }
                JOptionPane.showMessageDialog(jFrame, "Agregado correctamente");
            }
        });
        EliminarCodigoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo;
                try {
                    codigo = Integer.parseInt(EliminarCodigoTextField.getText());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un valor entero para el código del estudiante.");
                    return;
                }
                if (codigo <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Código de estudiante inválido.");
                    return;
                }
                if (lista.deleteNodo(codigo)) {
                    JOptionPane.showMessageDialog(jFrame, "Estudiante eliminado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(jFrame, "No pudo eliminarse al estudiante.");
                }

            }
        });
        EliminarPosicionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int posicion;
                try {
                    posicion = Integer.parseInt(PosicionEliminarTextField.getText());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un valor entero para la posición del estudiante.");
                    return;
                }
                if (posicion <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Posición de estudiante inválido.");
                    return;
                }
                if (lista.eliminarPorPosicion(posicion)) {
                    JOptionPane.showMessageDialog(jFrame, "Estudiante eliminado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(jFrame, "No pudo eliminarse al estudiante.");
                }
            }
        });
        BuscarCodigoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo;
                try {
                    codigo = Integer.parseInt(BuscarCodigoTextField.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un valor entero para el código del estudiante.");
                    return;
                }
                if (codigo <= 0) {
                    JOptionPane.showMessageDialog(jFrame, "Código de estudiante inválido.");
                    return;
                }

                String s = null;
                if (!lista.buscarNombrePorCodigo(codigo).equals("Alumno no encontrado")) {
                    s = "Nombres del Estudiante: " + lista.buscarNombrePorCodigo(codigo);
                    JOptionPane.showMessageDialog(jFrame, s);
                    return;
                } else {
                    JOptionPane.showMessageDialog(jFrame, "No se pudo encontrar el código del estudiante.");
                }
            }
        });
        BuscarNombreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombres;
                try {
                    nombres = BuscarNombreTextField.getText();
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese nombres válidos para el estudiante.");
                    return;
                }
                String s = null;
                if (lista.buscarCodigoPorNombre(nombres) != null) {
                    s = "Código del Estudiante: " + lista.buscarCodigoPorNombre(nombres);
                    JOptionPane.showMessageDialog(jFrame, s);
                } else {
                    JOptionPane.showMessageDialog(jFrame, "No se pudo encontrar los nombres del estudiante.");
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
