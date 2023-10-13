import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ColeccionVehiculo {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    ColeccionVehiculo () { }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
    public void deleteVehiculo (String marca) {
        if (buscarVehiculo(marca) != null) {
            for (int i = 0; i < vehiculos.size(); i++) {
                if (Objects.equals(marca, vehiculos.get(i).getMarca())) {
                    vehiculos.remove(i);
                    break;
                }
            }
        }
    }
    public Vehiculo[] buscarVehiculo(String marca) {
        Vehiculo finded[] = new Vehiculo[2];
        int index = 0;
        for (Vehiculo v: vehiculos) {
            if (Objects.equals(v.getMarca(), marca)) {
                if (v.getType().equals("Automovil")) {
                    finded[0] = v;
                } else {
                    finded[1] = v;
                }
            }
        }

        return finded;
    }
    public int getSize() {
        return vehiculos.size();
    }
    public Vehiculo at(int i) {
        return vehiculos.get(i);
    }
}
