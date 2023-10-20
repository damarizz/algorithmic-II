public abstract class Trabajador {
    private int codigo;
    private String nombre;
    private double basico;
    private double retenciones;
    private double neto;

    public Trabajador(int codigo, String nombre, double basico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.basico = basico;
        this.retenciones = 0;
        this.neto = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public double getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(double retenciones) {
        this.retenciones = retenciones;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public void calcularRetenciones (float tasa) {
        this.retenciones = basico * tasa;
    }
    public abstract void calcularNeto ();
}
