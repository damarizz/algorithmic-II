import java.util.Objects;

public class Medico extends Seguro{

    private int edad;
    private String salud;

    public Medico(int poliza, String nombre, double prima, String planSeguro, int edad, String salud) {
        super(poliza, nombre, prima, planSeguro);
        this.edad = edad;
        this.salud = salud;
    }

    @Override
    private void calcularCobertura() {
        if (this.edad > 80) {
            this.setCobertura(this.getPrima() * 100);
        } else {
            if (edad > 60) {
                this.setCobertura(this.getPrima() * 200);
            } else {
                if (edad > 40) {
                    this.setCobertura(this.getCobertura() * 300);
                } else {
                    this.setCobertura(this.getCobertura() * 400);
                }
            }
        }
        // ojito
        if (Objects.equals(salud, "normal")) {
            this.setCobertura(getCobertura() * 2);
        } else {
            this.setCobertura(this.getCobertura() / 2);

        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }
}
