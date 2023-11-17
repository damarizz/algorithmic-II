import java.util.ArrayList;
import java.util.List;

public class Sala {
    protected String nombre;
    protected int id;
    protected int butacas;
    private List<Funcion> funciones = new ArrayList<>();

    public Sala(String nombre, int id, int butacas) {
        this.nombre = nombre;
        this.id = id;
        this.butacas = butacas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getButacas() {
        return butacas;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }
}