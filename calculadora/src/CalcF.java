public class CalcF extends Calc {

    @Override
    public void opera(int signo) {
        if (this.operadorAnterior == 0) {
            this.acumulador = this.operando;
            this.operadorAnterior = signo;
        } else {
            switch (operadorAnterior) {
                case 1:
                    this.acumulador += this.operando;
                case 2:
                    this.acumulador -= this.operando;
                case 3:
                    this.acumulador *= this.operando;
                case 4:
                    this.acumulador /= this.operando;
                case 6:
                    this.acumulador = (this.acumulador * operando) / 100;
                case 7:
                    double base = this.acumulador;
                    double potencia = 1;
                    for (int i = 0; i < this.operando; i++) {
                        potencia *= base;
                    }
                    this.acumulador = potencia;
                if (signo == 4) {
                    this.operadorAnterior = -1;
                    this.operando = this.acumulador;
                } else {
                    this.operadorAnterior = signo;
                }
            }
        }

        this.visor = this.acumulador;
        this.operando = 0;
    }
}
