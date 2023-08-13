package operaciones;

public class Consulta extends Operacion {

    @Override
    public void realizarOperacion() {
        System.out.println("Su saldo actual es de $" + getSaldo());
        System.out.println("\n");
    }

}
