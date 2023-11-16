public class CalcM extends Calc {
    protected double memoria;

    public void guardaMemoria() {
        this.memoria = operando;
    }

    public void sumaMemoria() {
        this.memoria =+ operando;
    }

    public void borraMemoria () {
        this.memoria = 0;
    }

    public void muestraMemoria () {
        double muestraMemoria = memoria;
    }
}
