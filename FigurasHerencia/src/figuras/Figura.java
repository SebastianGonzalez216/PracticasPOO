package figuras;

import java.util.Scanner;

public class Figura {

    protected String nombre = "";
    protected double base = 0, altura = 0, radio = 0, resultado = 0;

    Scanner entrada = new Scanner(System.in);

    public Figura() {

    }

    public void solicitarDatosFiguraRegular() {
        System.out.println("Ingresa el valor de la base:");
        base = entrada.nextDouble();
        System.out.println("Ingresa el valor de la altura");
        altura = entrada.nextDouble();
    }
    
        public void solicitarDatosFiguraIrregular() {
        System.out.println("Ingresa el valor del radio:");
        radio = entrada.nextDouble();
    }

    public void imprimirResultado() {
        System.out.println("El resultado es: " + resultado);

    }

}
