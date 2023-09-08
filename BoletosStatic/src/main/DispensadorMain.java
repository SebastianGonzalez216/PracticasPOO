package main;

import boletos.Boleto;
import java.util.Scanner;

public class DispensadorMain {

    public static void main(String args[]) {

        String tipoDeFuncion;
        String funcion;
        String hora;
        double precio;
        short opcion = 0;
        
        do{

        System.out.println("-----Generador de boletos-----\n");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el tipo de funcion:");
        tipoDeFuncion = entrada.nextLine();
        System.out.println("Ingresa el titulo de la funcion:");
        funcion = entrada.nextLine();
        System.out.println("Ingresa la hora de la funcion:");
        hora = entrada.nextLine();
        System.out.println("Ingresa el precio del boleto:");
        precio = entrada.nextDouble();

        Boleto boleto1 = new Boleto(tipoDeFuncion, funcion, hora, precio);
        
        boleto1.generarBoleto();
        
        System.out.println("Desea generar otro boleto? 1 =SI, ingrese cualquier otro numero para salir");
        opcion = entrada.nextShort();
        
        }
        while(opcion == 1);
        System.exit(0);
    }

}
