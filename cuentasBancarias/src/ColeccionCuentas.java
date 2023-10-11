import java.util.List;

public class ColeccionCuentas {
    private List<Cuenta> cuentas;

    ColeccionCuentas(){}

    public void addCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void deleteCuenta(long nroCuenta) {
        if (buscarCuenta(nroCuenta) != null) {
            for (int i = 0; i < cuentas.size(); i++) {
                if (nroCuenta == cuentas.get(i).getNroCuenta()) {
                    cuentas.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("Cuenta inexistente");
        }
    }

    public Cuenta buscarCuenta(long nroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (nroCuenta == cuenta.getNroCuenta()) {
                return cuenta;
            }
        }
        return null;
    }
}
