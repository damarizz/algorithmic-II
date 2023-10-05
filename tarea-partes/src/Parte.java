public class Parte {
    private int parteId;
    private String parteNombre;

    Parte(int parteId, String parteNombre) {
        this.parteId = parteId;
        this.parteNombre = parteNombre;
    }

    public int getParteId() {
        return parteId;
    }

    public void setParteId(int parteId) {
        this.parteId = parteId;
    }

    public String getParteNombre() {
        return parteNombre;
    }

    public void setParteNombre(String parteNombre) {
        this.parteNombre = parteNombre;
    }
}
