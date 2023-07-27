package cuentabancariapoo;

import java.util.Scanner;

//Clase principal
public class ClasePrincipal {

    //Metodo main
    public static void main(String[] args) {

        //Declaracion de variables
        Short opc = 0;
        double saldo = 0.0, cantidad = 0.0;

        //Instancia de la clase CuentaBancaria
        Scanner entrada = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(saldo);

        //Ciclo while para volver al menu principal, mientras opcions ea diferente de cinco
        while (opc != 5) {

            System.out.println("\n=====BIENVENIDO A SU CUENTA======\n\n---Que operacion desea realizar?---");
            System.out.println("1.-Depositar\n2.-Retirar\n3.-Consultar saldo\n4.-Consultar datos de la cuenta\n5.-Salir");
            //dato de entrada para opcion
            opc = entrada.nextShort();

            //Creacion del menu con switch
            switch (opc) {

                case 1:
                    System.out.println("Ingrese la cantidad a depositar:");
                    cantidad = entrada.nextDouble();
                    //pase del parametro cantidad al metodo "Depositar"
                    cuenta.Depositar(cantidad);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar:");
                    cantidad = entrada.nextDouble();
                    //pase del parametro cantidad al metodo "Depositar"
                    cuenta.Retirar(cantidad);
                    break;
                case 3:
                    System.out.println("El saldo de su cuenta es:");
                    //LLamada al metodo "Consultar saldo"
                    cuenta.ConsultarSaldo();
                    break;
                case 4:
                    //LLamada a las variables del constructor de la clase CuentaBancaria
                    System.out.println("***Datos de la cuenta***");
                    System.out.println("Titular de la cuenta: " + cuenta.titular);
                    System.out.println("Numero de la cuenta: " + cuenta.numero);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion seleccionada invalida");
                    break;
            }
        }
        //Cierre de la ejecucion
        System.exit(0);

    }

}
