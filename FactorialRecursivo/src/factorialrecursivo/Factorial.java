package factorialrecursivo;

import java.util.Scanner;

public class Factorial {

    public static int factorial;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        

        System.out.println("---Factorial de un numero---\n");
        System.out.println("Ingresa un numero:");
        numero = entrada.nextInt();
        int factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es " + factorial);
    }

    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1); 
        }
    }
}
