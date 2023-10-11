import java.util.Date;
import java.util.Calendar;

public class CPlazo extends Cuenta {

    private int periodosMeses;
    private Date fechaVencimiento;

    public CPlazo(long nroCuenta, String nombreCliente, float saldo) {
        super(nroCuenta, nombreCliente, saldo);
        this.periodosMeses = 6;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, this.periodosMeses);
        this.fechaVencimiento = calendar.getTime();
    }

    public int getPeriodosMeses() {
        return periodosMeses;
    }

    public void setPeriodosMeses(int periodosMeses) {
        this.periodosMeses = periodosMeses;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public boolean depositar(float monto) {
        if (getFechaApertura().compareTo(getFechaVencimiento()) >= 0) {
            setSaldo(getSaldo() + monto);
            return true;
        }
        return false;
    }

    @Override
    public boolean retirar(float monto) {
        if (getFechaApertura().compareTo(getFechaVencimiento()) >= 0) {
            setSaldo(getSaldo() - monto);
            return true;
        }
        return false;
    }

    @Override
    public boolean calcularInteres(float porcentaje) {
        if (getFechaApertura().compareTo(getFechaVencimiento()) >=0) {
            float interes = getSaldo() * porcentaje;
            setSaldo(getSaldo() + interes);
            return true;
        }
        return false;
    }
}
