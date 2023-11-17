import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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
    private JComboBox cineSalaComboBox;
    private JTextField nombreSalaTextField;
    private JTextField numeroSalaTextField;
    private JTextField butacasTextField;
    private JButton registrarSalaRButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton REGISTRARButton1;
    private JRadioButton registrarPeliculaRadioButton;
    private JPanel RegistroPeliPanel;
    private JPanel RegistroReparto;
    private JButton RegistrarRepartoButton;
    private JTextField idPeliTextField;
    private JTextField DistribucionTextField;
    private JTextField originalTextField;
    private JTextField generoTextField;
    private JTextField idiomaTextField;
    private JTextField paisTextField;
    private JTextField anoProdTextField;
    private JTextField resumenTextField;
    private JTextField estrenoTextField;
    private JTextField duracionTextField;
    private JTextField websiteTextField;
    private JRadioButton SÍRadioButton;
    private JRadioButton NORadioButton;
    private JButton RegistrarPeliButton;
    private JTextField nacionalidadTextField;
    private JTextField nombreRepartoTextField;
    private JComboBox peliRepartoComboBox;
    private JTextField nroPelisTextField;
    private JRadioButton actorRadioButton;
    private JRadioButton directorRadioButton;
    private JRadioButton actorYDirectorRadioButton;
    private JRadioButton registrarOpiniónRadioButton;
    private JPanel RegistroOpinionPanel;
    private JButton RegistrarOpinionButton;
    private JTextField idOpinionTextField;
    private JComboBox calificacionComboBox;
    private JTextField ComentarioTextField;
    private JTextField EdadTextField;
    private JTextField nombreOpinionTextField;
    private JTextField fechaTextField;
    private JComboBox peliOpinionComboBox;
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
    private JComboBox clasifComboBox;

    private List<Cine> cines = new ArrayList<>();
    private List<Pelicula> peliculas = new ArrayList<>();

    public CineForm() {

        ((CardLayout)AccionesCardLayout.getLayout()).show(AccionesCardLayout, "RegistroCineCard");
        registrarCineRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(AccionesCardLayout, "RegistroCineCard");
            }
        });
        registrarSalaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(AccionesCardLayout, "RegistroSalaCard");
                Vector<String> nombres = new Vector<>();
                for (Cine cine : cines) {
                    nombres.add(cine.getName());
                }
                DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>((Vector) nombres);
                registroFuncionCineComboBox.setModel( model );
            }
        });
        registrarPeliculaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(AccionesCardLayout, "RegistroPeliCard");
            }
        });
        registrarFunciónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(AccionesCardLayout, "RegistroFuncionCard");
            }
        });
        registrarRepartoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(AccionesCardLayout, "RegistroRepartoCard");
                Vector<String> nombres = new Vector<>();
                for (Pelicula pelicula : peliculas) {
                    nombres.add(pelicula.getTituloDistribucion());
                }
                DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>((Vector) nombres);
                peliRepartoComboBox.setModel( model );
            }
        });
        registrarOpiniónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccionesCardLayout.getLayout()).show(AccionesCardLayout, "RegistroOpinionCard");
                Vector<String> nombres = new Vector<>();
                for (Pelicula pelicula : peliculas) {
                    nombres.add(pelicula.getTituloDistribucion());
                }
                DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>((Vector) nombres);
                peliOpinionComboBox.setModel( model );

            }
        });
        síRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)PromocionCardPanel.getLayout()).show(PromocionCardPanel, "siPromoCard");
            }
        });
        noRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)PromocionCardPanel.getLayout()).show(PromocionCardPanel, "noPromoCard");
            }
        });
        registrarSalaRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarSala();
                JOptionPane.showMessageDialog(jFrame, "Sala agregada correctamente");
            }
        });
        RegistrarOpinionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarOpinion();
                JOptionPane.showMessageDialog(jFrame, "Opinión agregada correctamente");
            }
        });
        RegistrarRepartoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarReparto();
                JOptionPane.showMessageDialog(jFrame, "Miembro de reparto agregado correctamente");
            }
        });

        RegistrarPeliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarPelicula();
                JOptionPane.showMessageDialog(jFrame, "Película agregada correctamente");
            }
        });
    }

    public void registrarSala() {
        String nombreCine = cineSalaComboBox.getSelectedItem().toString();
        String salaNombre = nombreSalaTextField.getText();
        int salaNumero = Integer.parseInt(numeroSalaTextField.getText());
        int butacas = Integer.parseInt(butacasTextField.getText());

        Sala sala = new Sala(salaNombre, salaNumero, butacas);
        for (Cine cine: cines) {
            if (nombreCine.equals(cine.getName())) {
                cine.getSalas().add(sala);
                break;
            }
        }
    }

    public void registrarOpinion () {
        String nombrePelicula = peliOpinionComboBox.getSelectedItem().toString();
        int id = Integer.parseInt(idOpinionTextField.getText());
        String nombre = nombreOpinionTextField.getText();
        int edad = Integer.parseInt(EdadTextField.getText());
        String fecha = fechaTextField.getText();
        String calificacion = calificacionComboBox.getSelectedItem().toString();
        String comentario = ComentarioTextField.getText();

        Opinion opinion = new Opinion(id, nombre, edad, fecha, calificacion, comentario);
        for (Pelicula pelicula: peliculas) {
            if (nombrePelicula.equals(pelicula.getTituloDistribucion())) {
                pelicula.getOpinions().add(opinion);
                break;
            }
        }
    }

    public void registrarPelicula () {
        int id = Integer.parseInt(idPeliTextField.getText());
        String tituloDistribucion = DistribucionTextField.getText();
        String tituloOriginal = originalTextField.getText();
        String genero = generoTextField.getText();
        String idiomaOriginal = idiomaTextField.getText();
        String paisOrigen = paisTextField.getText();
        int anoProd = Integer.parseInt(anoProdTextField.getText());
        String sitioWeb = websiteTextField.getText();
        String duracion = duracionTextField.getText();
        String clasificacion = clasifComboBox.getSelectedItem().toString();
        String fechaEstreno = estrenoTextField.getText();
        String resumen = resumenTextField.getText();
        boolean subtitulos = false;
        if (síRadioButton.isSelected()) {
            subtitulos = true;
        }
        if (noRadioButton.isSelected()) {
            subtitulos = false;
        }
        Pelicula pelicula = new Pelicula(id, tituloDistribucion, tituloOriginal, genero, idiomaOriginal, subtitulos, paisOrigen, anoProd,
                sitioWeb, duracion, clasificacion, fechaEstreno, resumen);
    }

    public void registrarReparto() {
        String nombrePelicula = peliRepartoComboBox.getSelectedItem().toString();
        String nombres = nombreOpinionTextField.getText();
        String nacionalidad = nombreRepartoTextField.getText();
        int participaciones = Integer.parseInt(nroPelisTextField.getText());
        String rol = "";
        if (actorRadioButton.isSelected()) {
            rol = "Actor";
        }
        if (directorRadioButton.isSelected()) {
            rol= "Director";
        }
        if (actorYDirectorRadioButton.isSelected()) {
            rol = "Actor y Director";
        }

        Reparto reparto = new Reparto(rol, nombres, nacionalidad, participaciones);
        for (Pelicula pelicula: peliculas) {
            if (nombrePelicula.equals(pelicula.getTituloDistribucion())) {
                pelicula.getRepartos().add(reparto);
                break;
            }
        }
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
