package operaciones;

import java.util.Scanner;

public class Deposito extends Operacion {

    private double cantidad, montoTotal;
    Scanner entrada = new Scanner(System.in);

    @Override
    public void realizarOperacion() {
        System.out.println("Cuanto deseas depositar?");
        cantidad = entrada.nextDouble();
        montoTotal = saldo + cantidad;
        if (montoTotal > 50000) {
            throw new UnsupportedOperationException("Limite de la cuenta excedido, esta cuenta solo puede almacenar un maximo de $50000.");
        } else {
            setSaldo(montoTotal);
            System.out.println("Deposito realizado con exito, su saldo actual es de $" + getSaldo());
            System.out.println("\n");

        }
    }

}
