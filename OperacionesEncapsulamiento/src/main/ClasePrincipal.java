package main;

import java.util.Scanner;
import suma.Suma;
import resta.Resta;
import multiplicacion.Multiplicacion;
import division.Division;

public class ClasePrincipal {

    public static void main(String args[]) {

        short opcion = 0;
        long numeroUno = 0, numeroDos = 0, resultado = 0;
        char caracter = 'x';

        Scanner entrada = new Scanner(System.in);

        System.out.println("=====BIENVENIDO AL MENU DE OPERACIONES=====");

        do {

            System.out.println("Que operacion desea realizar?");
            System.out.println("1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n\nIngrese cualquier otro numero para salir");
            opcion = entrada.nextShort();

            switch (opcion) {
                case 1:
                    System.out.println("---Ha seleccionado suma---\n");
                    System.out.println("Ingrese el primer numero:");
                    numeroUno = entrada.nextLong();
                    System.out.println("Ingrese el segundo numero:");
                    numeroDos = entrada.nextLong();
                    Suma suma = new Suma(numeroUno, numeroDos);
                    suma.Sumar();
                    break;
                case 2:
                    System.out.println("---Ha seleccionado resta---\n");
                    System.out.println("Ingrese el primer numero:");
                    numeroUno = entrada.nextLong();
                    System.out.println("Ingrese el segundo numero:");
                    numeroDos = entrada.nextLong();
                    Resta resta = new Resta(numeroUno, numeroDos);
                    resta.Restar();
                    break;
                case 3:
                    System.out.println("---Ha seleccionado multiplicacion---\n");
                    System.out.println("Ingrese el primer numero:");
                    numeroUno = entrada.nextLong();
                    System.out.println("Ingrese el segundo numero:");
                    numeroDos = entrada.nextLong();
                    Multiplicacion multiplicacion = new Multiplicacion(numeroUno, numeroDos);
                    multiplicacion.Multiplicar();
                    break;
                case 4:
                    System.out.println("---Ha seleccionado division---\n");
                    System.out.println("Ingrese el primer numero:");
                    numeroUno = entrada.nextLong();
                    System.out.println("Ingrese el segundo numero:");
                    numeroDos = entrada.nextLong();
                    Division division = new Division(numeroUno, numeroDos);
                    division.Dividir();
                    break;
                default:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
            }
            System.out.println("\nDesea realizar otra operacion? presione la tecla 's'");
            caracter = entrada.next().charAt(0);

        } while (caracter == 's');
        System.exit(0);
    }

}
