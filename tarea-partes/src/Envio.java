public class Envio {
    private int cantidad;
    private int parteId;
    private int proveedorId;

    Envio(int cantidad, int parteId, int proveedorId) {
        this.cantidad = cantidad;
        this.parteId = parteId;
        this.proveedorId = proveedorId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getParteId() {
        return parteId;
    }

    public void setParteId(int parteId) {
        this.parteId = parteId;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }
}
