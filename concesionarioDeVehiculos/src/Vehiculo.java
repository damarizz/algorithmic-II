public class Vehiculo {
    private String marca;
    private int pasajeros;
    private float potencia;
    private double precio;
    private String type;

    public Vehiculo(String marca, int pasajeros, float potencia, double precio) {
        this.marca = marca;
        this.pasajeros = pasajeros;
        this.potencia = potencia;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
