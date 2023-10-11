import java.util.Date;
import java.util.Calendar;

public abstract class Cuenta {
    private long nroCuenta;
    private String nombreCliente;
    private float saldo;
    private Date fechaApertura;

    public Cuenta(long nroCuenta, String nombreCliente, float saldo) {
        this.nroCuenta = nroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
        this.fechaApertura = new Date();
    }

    public long getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(long nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    abstract public boolean depositar(float monto);
    abstract public boolean retirar(float monto);

    abstract public boolean calcularInteres(float porcentaje);

}
