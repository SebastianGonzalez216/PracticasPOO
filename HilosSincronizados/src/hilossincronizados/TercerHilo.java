package hilossincronizados;

public class TercerHilo extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.print("B");

            try {
                TercerHilo.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase del Hilo3: " + e);
            }
        }

    }

}
