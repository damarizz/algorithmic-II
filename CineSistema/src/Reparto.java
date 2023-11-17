public class Reparto {
    private String rol;

    private String nombre;

    private String nacionalidad;

    private int cantidadDePeliculas;

    public Reparto(String rol, String nombre, String nacionalidad, int cantidadDePeliculas) {
        this.rol = rol;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.cantidadDePeliculas = cantidadDePeliculas;
    }

    public String getRol() {
        return rol;
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
