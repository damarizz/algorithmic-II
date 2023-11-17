public class Staff {
    private String tipo;

    private String nombre;

    private String nacionalidad;

    private int cantidadDePeliculas;

    public Staff(String tipo, String nombre, String nacionalidad, int cantidadDePeliculas) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.cantidadDePeliculas = cantidadDePeliculas;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getCantidadDePeliculas() {
        return cantidadDePeliculas;
    }
}
