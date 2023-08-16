package hilossincronizados;

public class CuartoHilo extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.print("A");

            try {
                CuartoHilo.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase del Hilo4: " + e);
            }
        }

    }

}
