public class Lista {
    private Nodo inicio;

    Lista() {
        this.inicio = null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int longitud() {
        Nodo ptr = this.inicio;
        int num = 0;

        while (ptr != null) {
            num++;
            ptr = ptr.getSiguiente();
        }

        return num;
    }

    public boolean existe(int codigo) {
        Nodo ptr = this.inicio;

        while (ptr != null && ptr.getCodigo() != codigo) {
            ptr  = ptr.getSiguiente();
        }

        if (ptr == null) {
            return false;
        }
        return true;
    }

    public void addInicio(int codigo, String nombre) {
        if (!this.existe(codigo)) {
            Nodo nuevo = new Nodo(codigo, nombre);
            nuevo.setSiguiente(this.inicio);
            this.inicio = nuevo;
        }
    }

    public void addFinal(int codigo, String nombre) {
        if (!this.existe(codigo)) {
            Nodo nuevo = new Nodo(codigo, nombre);
            if (this.inicio == null) {
                this.inicio = nuevo;
            } else {
                Nodo ptr = this.inicio;
                while (ptr.getSiguiente() != null) {
                    ptr = ptr.getSiguiente();
                }
                ptr.setSiguiente(nuevo);
            }
        }
    }

    public boolean insertNodo(int codigo, String nombre, int posicion) {
        int num = longitud();
        if (posicion <= num) {
            if (!this.existe(codigo)) {
                Nodo nuevo = new Nodo(codigo, nombre);
                Nodo ptr = this.inicio;
                Nodo qtr = ptr;
                int k = 1;

                while (k < posicion) {
                    qtr = ptr;
                    ptr = ptr.getSiguiente();
                    k++;
                }

                if (ptr == this.inicio) {
                    nuevo.setSiguiente(inicio);
                    this.inicio = nuevo;
                } else {
                    nuevo.setSiguiente(ptr);
                    qtr.setSiguiente(nuevo);
                }

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean deleteNodo(int codigo) {
        if (this.existe(codigo)) {
            Nodo ptr = this.inicio;
            Nodo qtr = ptr;

            while (ptr.getCodigo() != codigo) {
                qtr = ptr;
                ptr = ptr.getSiguiente();
            }

            if (ptr == this.inicio) {
                this.inicio = inicio.getSiguiente();
            } else {
                qtr.setSiguiente(ptr.getSiguiente());
            }

            return true;
        } else {
            return false;
        }
    }

    public String buscarNombrePorCodigo(int codigo) {
        Nodo ptr = this.inicio;
        while (ptr != null) {
            if (ptr.getCodigo() == codigo) {
                return ptr.getNombre();
            }
            ptr = ptr.getSiguiente();
        }
        return "Alumno no encontrado";
    }

    public Integer buscarCodigoPorNombre(String nombreBuscado) {
        Nodo ptr = this.inicio;
        while (ptr != null) {
            if (ptr.getNombre().equals(nombreBuscado)) {
                return ptr.getCodigo();
            }
            ptr = ptr.getSiguiente();
        }
        return null;
    }

    public boolean modificarNombrePorCodigo(int codigo, String nuevoNombre) {
        Nodo ptr = this.inicio;
        while (ptr != null) {
            if (ptr.getCodigo() == codigo) {
                ptr.setNombre(nuevoNombre);
                return true;
            }
            ptr = ptr.getSiguiente();
        }
        return false;
    }

    public boolean eliminarPorPosicion(int posicion) {
        int num = longitud();
        if (posicion >= 1 && posicion <= num) {
            if (posicion == 1) {
                this.inicio = inicio.getSiguiente();
                return true;
            } else {
                Nodo ptr = this.inicio;
                Nodo qtr = ptr;
                int k = 1;

                while (k < posicion) {
                    qtr = ptr;
                    ptr = ptr.getSiguiente();
                    k++;
                }

                qtr.setSiguiente(ptr.getSiguiente());
                return true;
            }
        }
        return false;
    }
}
