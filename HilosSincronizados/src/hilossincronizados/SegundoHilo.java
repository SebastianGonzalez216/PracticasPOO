package hilossincronizados;

public class SegundoHilo extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.print("E");

            try {
                SegundoHilo.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase del Hilo2: " + e);
            }
        }

    }

}
