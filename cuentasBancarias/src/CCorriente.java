import java.util.Date;

public class CCorriente extends Cuenta {

    private double sobregiro;

    public CCorriente(long nroCuenta, String nombreCliente, float saldo) {
        super(nroCuenta, nombreCliente, saldo);
        this.sobregiro = 2*getSaldo();
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public boolean depositar(float monto) {
        setSaldo(getSaldo() + monto);
        return true;
    }

    @Override
    public boolean retirar(float monto) {
        if (monto <= (getSaldo() + sobregiro)) {
            if (monto <= getSaldo()) {
                setSaldo(getSaldo() - monto);
            } else {
                sobregiro = sobregiro + (getSaldo() - monto);
                setSaldo(0);
            } return true;
        } return false;
    }

    @Override
    public boolean calcularInteres(float porcentaje) {
        float interes = this.getSaldo() * porcentaje;
        this.setSaldo(this.getSaldo() + interes);
        return true;
    }

    public boolean calcularMantenimiento(float porcentaje) {
        float mantenimiento = getSaldo() * porcentaje;
        setSaldo(getSaldo() - mantenimiento);
        return true;
    }
}