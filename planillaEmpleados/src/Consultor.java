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
}
