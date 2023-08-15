package hilos;

public class ProcesoUno extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println("Este es el proceso uno (" + i + ")");
        }

    }

}
