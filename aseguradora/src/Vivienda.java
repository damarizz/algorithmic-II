public class Vivienda extends Seguro {
    private String ubicacion;
    private double precio;
    private float porcentaje;

    public Vivienda(int poliza, String nombre, double prima, String planSeguro, String ubicacion, double precio, float porcentaje) {
        super(poliza, nombre, prima, planSeguro);
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.porcentaje = porcentaje;
    }

    @Override
    public void calcularCobertura() {
        setCobertura(precio * porcentaje);
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Seguro Medico" + '\n' +
                "N° Poliza: " + this.poliza + '\n' +
                "Nombre: " + this.nombre + '\n' +
                "Prima: " + this.prima + '\n' +
                "Plan de seguro: " + this.planSeguro+ '\n' +
                "Cobertura: " + this.cobertura + '\n' +
                "Ubicacion: " + this.ubicacion + '\n' +
                "Precio: " + this.precio + '\n' +
                "Porcentaje: " + this.porcentaje + '\n' + '\n';
    }
}
