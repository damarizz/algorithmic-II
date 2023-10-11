import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    private JTextField SearchCuentaInput;
    private JButton SearchButton;
    private JPanel SearchAccount;
    private JPanel OperationsCards;
    private JPanel CorrienteActions;
    private JPanel PlazoActions;
    private JButton calcularInteresButton;
    private JButton calcularMantenimientoButton;
    private JButton calcularInteresPlazoButton;
    private JPanel DefaultBlank;
    private JPanel CuentasPane;
    private JButton agregarCuentaButton;
    private JButton OKButtonNroCuenta;
    private JButton OKButtonNombreCompleto;
    private JButton OKButtonSaldo;
    private JTextField DepositarInput;
    private JButton DepositarButton;
    private JTextField RetirarInput;
    private JButton RetirarButton;
    private JLabel MantenimientoLabel;
    private JTextField ProcentajeMantenimientoInput;
    private JTextField PorcentajeInteresInput;
    private JTextField PorcentajeInteresPlazo;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private ColeccionCuentas cuentas = new ColeccionCuentas();
    private Long nroCuenta = null;
    private String nombre = null;
    private Float saldo = null;
    private CPlazo cuentaPlazo = null;
    private CCorriente cuentaCorriente = null;

    public SistemaCuentas() {

        Calendar calendar = Calendar.getInstance();
        this.OpenDateValue.setText(SimpleDateFormat.getDateInstance().format(Date.from(calendar.toInstant())));
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, 6);
        this.FechaDeVecimientoValue.setText(SimpleDateFormat.getDateInstance().format(Date.from(calendar.toInstant())));
        JFrame jFrame = new JFrame();
        ((CardLayout) OperationsCards.getLayout()).show(OperationsCards, "BlankCard");

        agregarCuentaRadioButton.addActionListener(e -> ((CardLayout)CuentasPane.getLayout()).show(CuentasPane,"AddAccount"));
        operacionesRadioButton.addActionListener(e -> ((CardLayout)CuentasPane.getLayout()).show(CuentasPane,"Operations"));
        cuentaCorrienteRadioButton.addActionListener(e -> ((CardLayout)AccountsPanel.getLayout()).show(AccountsPanel,"CuentaCorriente"));
        cuentaAPlazoRadioButton.addActionListener(e -> ((CardLayout)AccountsPanel.getLayout()).show(AccountsPanel,"CuentaPlazo"));
        OKButtonNroCuenta.addActionListener(e -> {
            try {
                nroCuenta = Long.parseLong(AddAccountInput.getText());
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(jFrame, "Ingrese un valor entero");
                return;
            }
            AddAccountInput.setEditable(false);
        });
        OKButtonNombreCompleto.addActionListener(e -> {
            nombre = NameInput.getText();
            NameInput.setEditable(false);
        });
        OKButtonSaldo.addActionListener(e -> {
            try {
                saldo = Float.parseFloat(SaldoInput.getText());
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(jFrame, "Ingrese un valor real");
                return;
            }
            SaldoInput.setEditable(false);
            SobreGiroValue.setText(df.format(saldo * 2));
        });
        agregarCuentaButton.addActionListener(e -> {
            if (nroCuenta == null || nombre == null || saldo == null) {
                JOptionPane.showMessageDialog(jFrame, "Debe de completar los campos para poder agregar la cuenta");
                return;
            }

            if (cuentas.buscarCuenta(nroCuenta) != null) {
                JOptionPane.showMessageDialog(jFrame, "Ya existe una cuenta con ese numero de cuenta");
                SaldoInput.setEditable(true);
                NameInput.setEditable(true);
                AddAccountInput.setEditable(true);
                return;
            }

            if (cuentaCorrienteRadioButton.isSelected()) {
                CCorriente cuenta = new CCorriente(nroCuenta, nombre, saldo); cuentas.addCuenta(cuenta);
            } else {
                CPlazo cuenta = new CPlazo(nroCuenta, nombre, saldo); cuentas.addCuenta(cuenta);
            }
            SaldoInput.setEditable(true);
            NameInput.setEditable(true);
            AddAccountInput.setEditable(true);
        });
        SearchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Cuenta cuenta = cuentas.buscarCuenta(Long.parseLong(SearchCuentaInput.getText()));
                } catch (Exception exception) {
                    ((CardLayout) OperationsCards.getLayout()).show(OperationsCards, "BlankCard");

                    JOptionPane.showMessageDialog(jFrame, "Numero de cuenta no encontrado");
                    DepositarInput.setEnabled(false);
                    DepositarButton.setEnabled(false);
                    RetirarInput.setEnabled(false);
                    RetirarButton.setEnabled(false);
                    calcularInteresButton.setEnabled(false);
                    calcularMantenimientoButton.setEnabled(false);
                    calcularInteresPlazoButton.setEnabled(false);
                    ProcentajeMantenimientoInput.setEnabled(false);
                    PorcentajeInteresInput.setEnabled(false);
                    PorcentajeInteresPlazo.setEnabled(false);
                    return;
                }

                if (cuentas.buscarCuenta(Long.parseLong(SearchCuentaInput.getText())) != null) {
                    DepositarInput.setEnabled(true);
                    DepositarButton.setEnabled(true);
                    RetirarInput.setEnabled(true);
                    RetirarButton.setEnabled(true);
                    calcularInteresButton.setEnabled(true);
                    calcularMantenimientoButton.setEnabled(true);
                    calcularInteresPlazoButton.setEnabled(true);
                    ProcentajeMantenimientoInput.setEnabled(true);
                    PorcentajeInteresInput.setEnabled(true);
                    PorcentajeInteresPlazo.setEnabled(true);


                    if (cuentas.buscarCuenta(Long.parseLong(SearchCuentaInput.getText())).getClass() == CPlazo.class) {
                        cuentaPlazo = (CPlazo) cuentas.buscarCuenta(Long.parseLong(SearchCuentaInput.getText()));
                        cuentaCorriente = null;
                        ((CardLayout)OperationsCards.getLayout()).show(OperationsCards,"PlazoActions");
                    } else if (cuentas.buscarCuenta(Long.parseLong(SearchCuentaInput.getText())).getClass() == CCorriente.class) {
                        cuentaCorriente = (CCorriente) cuentas.buscarCuenta(Long.parseLong(SearchCuentaInput.getText()));
                        cuentaPlazo = null;
                        ((CardLayout)OperationsCards.getLayout()).show(OperationsCards,"CorrienteActions");
                    } else {
                        ((CardLayout) OperationsCards.getLayout()).show(OperationsCards, "BlankCard");
                    }
                } else {

                    ((CardLayout) OperationsCards.getLayout()).show(OperationsCards, "BlankCard");
                    JOptionPane.showMessageDialog(jFrame, "Numero de cuenta no encontrado");
                    DepositarInput.setEnabled(false);
                    DepositarButton.setEnabled(false);
                    RetirarInput.setEnabled(false);
                    RetirarButton.setEnabled(false);
                    calcularInteresButton.setEnabled(false);
                    calcularMantenimientoButton.setEnabled(false);
                    calcularInteresPlazoButton.setEnabled(false);
                    ProcentajeMantenimientoInput.setEnabled(false);
                    PorcentajeInteresInput.setEnabled(false);
                    PorcentajeInteresPlazo.setEnabled(false);
                }
            }
        });
        DepositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float monto;
                try {
                    monto = Float.parseFloat(DepositarInput.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un valor real por favor");
                    return;
                }

                if (cuentaPlazo == null) {
                    cuentaCorriente.depositar(monto);
                } else {
                    cuentaPlazo.depositar(monto);
                }
                JOptionPane.showMessageDialog(jFrame, "Deposito exitoso");
            }
        });
        RetirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float monto;
                try {
                    monto = Float.parseFloat(RetirarInput.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un valor real por favor");
                    return;
                }

                if (cuentaPlazo == null) {
                    cuentaCorriente.retirar(monto);
                } else {
                    cuentaPlazo.retirar(monto);
                }

                JOptionPane.showMessageDialog(jFrame, "Retiro exitoso");
            }
        });

        calcularMantenimientoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float monto;

                try {
                    monto = Float.parseFloat(ProcentajeMantenimientoInput.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un numero real entre 0 y 1");
                    return;
                }

                if (monto > 1 || monto < 0) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un numero real entre 0 y 1");
                    return;
                }

                cuentaCorriente.calcularInteres(monto);
                JOptionPane.showMessageDialog(jFrame, "Interes agregado con exito");
            }
        });
        calcularInteresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float monto;

                try {
                    monto = Float.parseFloat(PorcentajeInteresInput.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un numero real entre 0 y 1");
                    return;
                }

                if (monto > 1 || monto < 0) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un numero real entre 0 y 1");
                    return;
                }

                cuentaCorriente.calcularMantenimiento(monto);
                JOptionPane.showMessageDialog(jFrame, "Mantenimiento agregado con exito");
            }
        });
        calcularInteresPlazoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float monto;

                try {
                    monto = Float.parseFloat(PorcentajeInteresPlazo.getText());
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un numero real entre 0 y 1");
                    return;
                }

                if (monto > 1 || monto < 0) {
                    JOptionPane.showMessageDialog(jFrame, "Ingrese un numero real entre 0 y 1");
                    return;
                }

                cuentaPlazo.calcularInteres(monto);
                JOptionPane.showMessageDialog(jFrame, "Interes agregado con exito");
            }
        });
    }

    public static void main(String[] args) {
        SistemaCuentas app = new SistemaCuentas();
        app.setContentPane(app.SistemaCuentasPane);
        app.setTitle("Sistema de cuentas");
        app.setSize(500, 400);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
