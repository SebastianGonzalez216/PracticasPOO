
package raizcuadrada;

import java.util.Scanner;
import java.text.DecimalFormat;


public class RaizCuadrada {
    
    public static void main(String args[]){
        
        double numero = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa un numero para obtener su raiz cuadrada");
        numero = entrada.nextDouble();
        double raiz = Math.sqrt(numero);
        
        DecimalFormat decimal = new DecimalFormat("#.00");

        System.out.println("La raiz cuadrada de " + numero + " es " + decimal.format(raiz));
    }
    
}
