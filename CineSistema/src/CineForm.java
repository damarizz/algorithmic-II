import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CineForm extends JFrame {
    private JFrame jFrame = new JFrame();
    private JPanel CinePanel;
    private JRadioButton registrarCineRadioButton;
    private JRadioButton registrarRepartoRadioButton;
    private JRadioButton mostrarCarteleraRadioButton;
    private JPanel AccionesCardLayout;
    private JPanel RegistroCine;
    private JRadioButton registrarSalaRadioButton;
    private JPanel RegistroSala;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton REGISTRARButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton REGISTRARButton1;
    private JRadioButton registrarPeliculaRadioButton;
    private JPanel RegistroPeliPanel;
    private JPanel RegistroReparto;
    private JButton REGISTRARButton2;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JRadioButton SÍRadioButton;
    private JRadioButton NORadioButton;
    private JButton REGISTRARButton3;
    private JTextField textField19;
    private JTextField textField20;
    private JComboBox comboBox2;
    private JTextField textField21;
    private JRadioButton actorRadioButton;
    private JRadioButton directorRadioButton;
    private JRadioButton actorYDirectorRadioButton;
    private JRadioButton registrarOpiniónRadioButton;
    private JPanel RegistroOpinionPanel;
    private JButton REGISTRARButton4;
    private JTextField textField22;
    private JComboBox comboBox3;
    private JTextField textField23;
    private JTextField textField24;
    private JTextField textField25;
    private JTextField textField26;
    private JComboBox comboBox4;
    private JRadioButton registrarFunciónRadioButton;
    private JPanel RegistroFuncionPanel;
    private JButton REGISTRARButton5;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JTextField textField27;
    private JComboBox comboBox7;
    private JTextField textField28;
    private JRadioButton síRadioButton;
    private JRadioButton noRadioButton;
    private JPanel PromocionCardPanel;
    private JPanel siPromoPanel;
    private JPanel noPromoPanel;
    private JTextField textField29;
    private JTextField textField30;

    public CineForm() {
        registrarCineRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(RegistroCine, "RegistroCineCard");
            }
        });
        registrarSalaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(RegistroSala, "RegistroSalaCard");
            }
        });
        registrarPeliculaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(RegistroPeliPanel, "RegistroPeliCard");
            }
        });
        registrarFunciónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(RegistroFuncionPanel, "RegistroFuncionCard");
            }
        });
        registrarRepartoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(RegistroReparto, "RegistroRepartoCard");
            }
        });
        registrarOpiniónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(RegistroOpinionPanel, "RegistroOpinionCard");
            }
        });
    }

    public static void main(String[] args) {
        CineForm app = new CineForm();
        app.setContentPane(app.CinePanel);
        app.setTitle("CineStar");
        app.setSize(1000, 500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}