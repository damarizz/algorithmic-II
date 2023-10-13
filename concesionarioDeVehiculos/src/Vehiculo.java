public class Vehiculo {
    private String marca;
    private int pasajeros;
    private String potencia;
    private double precio;
    private String type;

    public Vehiculo(String marca, int pasajeros, String potencia, double precio) {
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

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
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
