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
}
