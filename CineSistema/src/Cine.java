import java.util.ArrayList;
import java.util.List;

public class Cine {

    private String name;
    private String direccion;
    private String telefono;
    private List<Sala> salas = new ArrayList<>();
    private List<Promocion> promociones = new ArrayList<>();
    public Cine(String name, String direccion, String telefono) {
        this.name = name;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }
}