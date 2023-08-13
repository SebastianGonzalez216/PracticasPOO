package operaciones;

import java.util.Scanner;

public class Retiro extends Operacion {

    private double cantidad, montoTotal;
    Scanner entrada = new Scanner(System.in);

    @Override
    public void realizarOperacion() {
        System.out.println("Cuanto deseas retirar?");
        cantidad = entrada.nextDouble();
        montoTotal = saldo - cantidad;
        if (montoTotal < 0) {
            throw new UnsupportedOperationException("Fondos insuficientes, su saldo actual es de $" + getSaldo());
        } else {
            setSaldo(montoTotal);
            System.out.println("Retiro realizado con exito, su saldo actual es de $" + getSaldo());
            System.out.println("\n");
        }
    }

}
