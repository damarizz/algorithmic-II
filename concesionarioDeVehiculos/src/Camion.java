public class Camion extends Vehiculo {
    private String tolva; // la tolva puede ser abierta, cerrada...
    private double cargaTolva; // capacidad de carga de la tolva

    public Camion(String marca, int pasajeros, String potencia, double precio,
                  String tolva, double cargaTolva) {
        super(marca, pasajeros, potencia, precio);
        this.tolva = tolva;
        this.cargaTolva = cargaTolva;
        this.setType("Camion");
    }

    public String getTolva() {
        return tolva;
    }

    public void setTolva(String tolva) {
        this.tolva = tolva;
    }

    public double getCargaTolva() {
        return cargaTolva;
    }

    public void setCargaTolva(double cargaTolva) {
        this.cargaTolva = cargaTolva;
    }

    @Override
    public String toString() {

        String s = "Tipo: " + this.getType() + "\n" +
                "Marca: " + this.getMarca() + "\n" +
                "N° de pasajeros: " + this.getPasajeros() + "\n" +
                "Potencia: " + this.getPotencia() + " hp/rpm\n" +
                "Precio: $ " + this.getPrecio() + "\n" +
                "Tolva: " + this.getTolva() + "\n" +
                "Capacidad de la Tolva: " + this.getCargaTolva() + " K\n";
        return s;
    }
}

