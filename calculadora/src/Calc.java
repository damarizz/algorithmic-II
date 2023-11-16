public abstract class Calc {
    private double acumulador;
    protected double operando;
    private int operadorAnterior;
    private double visor; //este atributo puede ser eliminado es equivalente al acumulador

    public Calc() {
        this.acumulador = 0;
        this.operadorAnterior = 0;
        this.operando = 0;
        this.visor = 0;
    }

    public void borra() {
        this.operando = 0;
        this.visor = 0; // // versión anterior de visoracumulador (dk what this means tbh)
    }

    public void borraTodo() {
        this.acumulador = 0;
        this.operadorAnterior = 0;
        this.operando = 0;
        this.visor = 0;
    }

    public void opera(int signo) {
        if (operadorAnterior == 0) {
            acumulador = operando;
            operadorAnterior = signo;
        } else {
            switch (operadorAnterior) {
                case 1:
                    acumulador += operando;
                    break;
                case 2:
                    acumulador -= operando;
                    break;
                case 3:
                    acumulador *= operando;
                    break;
                case 4:
                    acumulador /= operando;
                    break;
            }
            if (signo == 5) { //check l8ter
                operando = acumulador;
            } else {
                operadorAnterior = signo;
            }
        }

        visor = acumulador;
        operando = 0;
    }

    public void ingresaValor (int valor) {
        // ingresa dígito a dígito
        // nValor es un solo dígito
        // podría ser manejado en la interfaz
        // y este método tener como parámetro el operando
        int digitos = 0;
        double num = operando;
        while (num != 0) {
            num = num / 10;
            digitos += 1;
        }
        // máximo número de dígitos 10, si tiene más de 10 dígitos no anexa el dígito
        // nValor a la derecha
        if (10 > num) {
            if (operando == 0) {
                operando = valor;
            } else {
                operando = operando * 10 + valor;
            }
            visor = operando;
        }
    }

    public double getVisor() {
        return visor;
    }
    public void retroceder () {
        operando /= 10;
        visor = operando;
    }
}
