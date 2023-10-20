public class Empleado extends Trabajador {
    protected int diasFaltas;
    protected double descuentos;
    protected float horasExtras;

    public Empleado(int codigo, String nombre, double basico, int diasFaltas, float horasExtras) {
        super(codigo, nombre, basico);
        this.diasFaltas = diasFaltas;
        this.horasExtras = horasExtras;
        descuentos = 0;
    }

    public int getDiasFaltas() {
        return diasFaltas;
    }

    public void setDiasFaltas(int diasFaltas) {
        this.diasFaltas = diasFaltas;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void calcularDescuento () {
        descuentos = (getBasico()/30) * diasFaltas;
    }

    public double calcularSueldoHoraExtra () {
        return ((getBasico() / 30) / 8) * 1.5;
    }

    @Override
    public void calcularNeto() {
        setNeto(getBasico() - getRetenciones() - descuentos +
                horasExtras * calcularSueldoHoraExtra());
    }

}
