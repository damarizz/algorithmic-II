import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.OptionalInt;

public class SistemaCuentas extends JFrame{
    private JPanel SistemaCuentasPane;
    private JRadioButton agregarCuentaRadioButton;
    private JRadioButton operacionesRadioButton;
    private JPanel AddAccount;
    private JPanel Operations;
    private JRadioButton cuentaCorrienteRadioButton;
    private JRadioButton cuentaAPlazoRadioButton;
    private JPanel CommonPropierties;
    private JPanel AccountsPanel;
    private JPanel CuentaCorriente;
    private JPanel CuentaPlazo;
    private JLabel NroAccount;
    private JTextField AddAccountInput;
    private JLabel Name;
    private JLabel Saldo;
    private JTextField NameInput;
    private JTextField SaldoInput;
    private JLabel OpenDate;
    private JLabel OpenDateValue;
    private JLabel SobreGiro;
    private JLabel SobreGiroValue;
    private JLabel FechaDeVecimientoValue;
    private JTextField NroCuentaInput;
    private JButton SearchButton;
    private JPanel SearchAccount;
    private JPanel OperationsCards;
    private JPanel CorrienteActions;
    private JPanel PlazoActions;
    private JPanel ButtonsCorriente;
    private JTextField DepositoCorrienteInput;
    private JTextField RetiroCorrienteInput;
    private JButton DepositarButtonCorriente;
    private JButton RetirarButtonCorriente;
    private JButton calcularInteresButton;
    private JButton calcularMantenimientoButton;
    private JPanel CorrienteActionsPanel;
    private JTextField RetiroPlazoInput;
    private JTextField DepositoPlazoInput;
    private JButton depositarButton;
    private JButton retirarButton;
    private JButton calcularInteresButton1;
    private JPanel DefaultBlank;
    private JPanel CuentasPane;
    private JButton agregarCuentaButton;
    private JButton OKButtonNroCuenta;
    private JButton OKButtonNombreCompleto;
    private JButton OKButtonSaldo;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private ColeccionCuentas cuentas = new ColeccionCuentas();
    private Integer nroCuenta = null;
    private String nombre = null;
    private Float saldo = null;

    public SistemaCuentas() {

        Calendar calendar = Calendar.getInstance();
        this.OpenDateValue.setText(SimpleDateFormat.getDateInstance().format(Date.from(calendar.toInstant())));
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, 6);
        this.FechaDeVecimientoValue.setText(SimpleDateFormat.getDateInstance().format(Date.from(calendar.toInstant())));

        agregarCuentaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)CuentasPane.getLayout()).show(CuentasPane,"AddAccount");
            }
        });
        operacionesRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)CuentasPane.getLayout()).show(CuentasPane,"Operations");
            }
        });
        cuentaCorrienteRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccountsPanel.getLayout()).show(AccountsPanel,"CuentaCorriente");
            }
        });
        cuentaAPlazoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout)AccountsPanel.getLayout()).show(AccountsPanel,"CuentaPlazo");
            }
        });
        OKButtonNroCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    nroCuenta = Integer.parseInt(AddAccountInput.getText());
                } catch (Exception exception) {
                    JFrame jFrame = new JFrame();
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un valor entero");
                    return;
                }
                AddAccountInput.setEditable(false);
            }
        });
        OKButtonNombreCompleto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre = NameInput.getText();
                NameInput.setEditable(false);
            }
        });
        OKButtonSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saldo = Float.parseFloat(SaldoInput.getText());
                } catch (Exception exception) {
                    JFrame jFrame = new JFrame();
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un valor real");
                    return;
                }
                SaldoInput.setEditable(false);
                SobreGiroValue.setText(df.format(saldo * 2));
            }
        });
        agregarCuentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nroCuenta == null || nombre == null || saldo == null) {
                    JFrame jFrame = new JFrame();
                    JOptionPane.showMessageDialog(jFrame, "Debe de completar los campos para poder agregar la cuenta");
                    return;
                }

                if (cuentaCorrienteRadioButton.isSelected()) {
                    CCorriente cuenta = new CCorriente(nroCuenta, nombre, saldo);
                    cuentas.addCuenta(cuenta);
                } else {
                    CPlazo cuenta = new CPlazo(nroCuenta, nombre, saldo);
                }
            }
        });
    }

    public static void main(String[] args) {
        SistemaCuentas app = new SistemaCuentas();
        app.setContentPane(app.SistemaCuentasPane);
        app.setTitle("Sistema de cuentas");
        app.setSize(400, 400);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
