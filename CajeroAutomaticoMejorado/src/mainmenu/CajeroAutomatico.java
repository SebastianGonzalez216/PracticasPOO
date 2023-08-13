package mainmenu;

import java.util.Scanner;
import operaciones.Consulta;
import operaciones.Deposito;
import operaciones.Operacion;
import operaciones.Retiro;

public class CajeroAutomatico {
    


    public static void main(String args[]) {

        short opcion;
        double saldo = 500.0;
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Porfavor seleccione una opción:\n");
            System.out.println("1.-Consulta de saldo\n2.-Retiro de efectivo\n3.-Deposito de efectivo\n4.-Salir");
            opcion = entrada.nextShort();

            switch (opcion) {
                case 1:
                    Operacion consulta = new Consulta();
                    consulta.setSaldo(saldo);
                    consulta.realizarOperacion();
                    saldo = consulta.getSaldo();
                    break;
                case 2:
                    Operacion retiro = new Retiro();
                    retiro.setSaldo(saldo);
                    retiro.realizarOperacion();
                    saldo = retiro.getSaldo();
                    break;
                case 3:                   
                    Operacion deposito = new Deposito();
                    deposito.setSaldo(saldo);
                    deposito.realizarOperacion();
                    saldo = deposito.getSaldo();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion seleccionada invalida, vuelva a intentarlo");
                    break;
            }
        } while (opcion != 4);
    }

}
