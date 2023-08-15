package hilos;

public class ProcesoDos implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println("Este es el proceso dos (" + i + ")");
        }
    }

}
