public abstract class Seguro {
    protected int poliza;
    protected String nombre;
    protected double prima;
    protected String planSeguro;
    protected double cobertura;

    public Seguro(int poliza, String nombre, double prima, String planSeguro) {
        this.poliza = poliza;
        this.nombre = nombre;
        this.prima = prima;
        this.planSeguro = planSeguro;
        this.cobertura = 0;
    }

    public abstract void calcularCobertura();

    public int getPoliza() {
        return poliza;
    }

    public void setPoliza(int poliza) {
        this.poliza = poliza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrima() {
        return prima;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

    public String getPlanSeguro() {
        return planSeguro;
    }

    public void setPlanSeguro(String planSeguro) {
        this.planSeguro = planSeguro;
    }

    public double getCobertura() {
        return cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }
}
