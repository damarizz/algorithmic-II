public class Automovil extends Vehiculo {
    private String maletera; // tipo de maletera (e.g., sedán, hatchback, etc.)
    private int capacidadMaletera; // capacidad de la maletera en litros

    public Automovil(String marca, int pasajeros, String potencia, double precio,
                     String maletera, int capacidadMaletera) {
        super(marca, pasajeros, potencia, precio);
        this.maletera = maletera;
        this.capacidadMaletera = capacidadMaletera;
        this.setType("Automovil");
    }

    public String getMaletera() {
        return maletera;
    }
    public void setMaletera(String maletera) {
        this.maletera = maletera;
    }
    public int getCapacidadMaletera() {
        return capacidadMaletera;
    }
    public void setCapacidadMaletera(int capacidadMaletera) {
        this.capacidadMaletera = capacidadMaletera;
    }

    @Override
    public String toString() {
        String s = "Tipo: " + this.getType() + "\n" +
                "Marca: " + this.getMarca() + "\n" +
                "N° de pasajeros: " + this.getPasajeros() + "\n" +
                "Potencia: " + this.getPotencia() + " hp/rpm\n" +
                "Precio: $ " + this.getPrecio() + "\n" +
                "Maletera: " + this.getMaletera() + "\n" +
                "Capacidad de maletera: " + this.getCapacidadMaletera() + " L\n";

        return s;
    }
}
