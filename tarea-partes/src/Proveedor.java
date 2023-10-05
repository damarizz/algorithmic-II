public class Proveedor {
    private int proveedorId;
    private String proveedorNombre;

    Proveedor(int proveedorId, String nombreProvedor) {
        this.proveedorId = proveedorId;
        this.proveedorNombre = nombreProvedor;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getProveedorNombrer() {
        return proveedorNombre;
    }

    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }
}
