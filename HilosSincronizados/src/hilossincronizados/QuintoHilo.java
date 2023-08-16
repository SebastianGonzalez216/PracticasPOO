package hilossincronizados;

public class QuintoHilo extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("S");

            try {
                QuintoHilo.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase del Hilo5: " + e);
            }
        }

    }

}
