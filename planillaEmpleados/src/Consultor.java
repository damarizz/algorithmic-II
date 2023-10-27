public class Consultor extends Trabajador {
    protected double bonificacion;

    public Consultor(int codigo, String nombre, double basico, double bonificacion) {
        super(codigo, nombre, basico);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public void calcularNeto() {
        setNeto(getBasico()-getRetenciones()+bonificacion);
    }


    @Override
    public String toString() {
        return "Codigo: " + this.getCodigo() + "'\n'Nombre: " + this.getNombre() +
                "'\n'Sueldo basico: " + this.getBasico() + "'\n'Retenciones: " + this.getRetenciones() +
                "'\n'Bonificación: " + this.getBonificacion() + "'\n'Neto: " + this.getNeto() + '\n';
    }
}
