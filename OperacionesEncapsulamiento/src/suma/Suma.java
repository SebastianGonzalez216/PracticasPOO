package suma;

public class Suma {

    private long numeroUno = 0, numeroDos = 0, resultado = 0;

    public Suma(long numeroUno, long numeroDos) {

        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public void Sumar() {

        resultado = numeroUno + numeroDos;
        System.out.println("El resultado de la suma es: " + resultado);

    }
}
