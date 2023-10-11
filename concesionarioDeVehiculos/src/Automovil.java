public class Automovil extends Vehiculo {
    private String maletera; // tipo de maletera (e.g., sedán, hatchback, etc.)
    private int capacidadMaletera; // capacidad de la maletera en litros


    public Automovil(String marca, int pasajeros, float potencia, double precio,
                     String maletera, int capacidadMaletera) {
        super(marca, pasajeros, potencia, precio);
        this.maletera = maletera;
        this.capacidadMaletera = capacidadMaletera;
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
}
