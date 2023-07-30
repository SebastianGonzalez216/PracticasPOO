package division;

public class Division {

    private long numeroUno = 0, numeroDos = 0, resultado = 0;

    public Division(long numeroUno, long numeroDos) {

        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public void Dividir() {

        resultado = numeroUno / numeroDos;
        System.out.println("El resultado de la resta es: " + resultado);

    }
}
