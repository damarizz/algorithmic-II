public class ColeccionParte {
    private int indice = 0;
    private int lenght;
    private Parte[] partes;

    ColeccionParte(int lenght) {
        this.lenght = lenght;
        partes = new Parte[lenght];
    }

    public void addParte(int parteId, String nombreParte) {
        partes[this.indice] = new Parte(parteId, nombreParte);
        this.indice++;
    }

    public void deleteParte(int id) {
        int index = 0;
        for (Parte parte: partes) {
            if (parte.getParteId() == id) {
                break;
            }
            index++;
        }

        for (int i = index; i < this.indice; i++) {
            partes[i] = partes[i+1];
        }
        this.indice--;
    }

    public void modifyParte(Parte parte) {

    }

    public Parte[] buscarParte (int parteId) {
        return partes;
    }

    public void mostrarParte () {

    }

    public int getIndice() {
        return indice;
    }

}
