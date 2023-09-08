
package singleton;


public class Singleton {

    private static Singleton instanciaUnica;

    private Singleton() {
        
    }

    public static Singleton getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    public void mostrarMensaje() {
        System.out.println("Esta es una implementacion simple de singleton");
    }
}








