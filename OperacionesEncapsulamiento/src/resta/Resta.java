package resta;

public class Resta {

    private long numeroUno = 0, numeroDos = 0, resultado = 0;

    public Resta(long numeroUno, long numeroDos) {

        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public void Restar() {

        resultado = numeroUno - numeroDos;
        System.out.println("El resultado de la resta es: " + resultado);

    }
}
