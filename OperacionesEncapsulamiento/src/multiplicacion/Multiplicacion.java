package multiplicacion;

public class Multiplicacion {

    private long numeroUno = 0, numeroDos = 0, resultado = 0;

    public Multiplicacion(long numeroUno, long numeroDos) {

        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public void Multiplicar() {

        resultado = numeroUno * numeroDos;
        System.out.println("El resultado de la resta es: " + resultado);

    }
}
