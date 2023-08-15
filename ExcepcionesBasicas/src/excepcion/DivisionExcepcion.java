package excepcion;

import java.util.Scanner;

public class DivisionExcepcion {

    public static void main(String[] args) {

        try {

            double primerNumero, segundoNumero, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.println("-----Bienvenido al programa para dividir dos numeros-----\n");
            System.out.println("Ingresa el primer valor:");
            primerNumero = entrada.nextDouble();
            System.out.println("Ingresa el segundo valor:");
            segundoNumero = entrada.nextDouble();
            resultado = primerNumero / segundoNumero;
            System.out.println("\n--El resultado de la division es: " + resultado + "--");
        } catch (Exception e) {
            System.out.println("Error: " + e);

        } finally {
            System.out.println("\n***Operacion finalizada***");
        }
    }

}
