package operaciones;

public abstract class Operacion {

    protected double saldo = 0;

    public abstract void realizarOperacion();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;

    }

}
