package hilossincronizados;

public class ClasePrincipal {

    public static void main(String args[]) {

        PrimerHilo hilo1 = new PrimerHilo();
        SegundoHilo hilo2 = new SegundoHilo();
        TercerHilo hilo3 = new TercerHilo();
        CuartoHilo hilo4 = new CuartoHilo();
        QuintoHilo hilo5 = new QuintoHilo();

        hilo1.start();

        try {
            hilo1.sleep(20);
        } catch (InterruptedException e) {
            System.out.println("Error en el primer hilo: " + e);
        }

        hilo2.start();

        try {
            hilo2.sleep(20);
        } catch (InterruptedException e) {
            System.out.println("Error en el segundo hilo: " + e);
        }

        hilo3.start();

        try {
            hilo3.sleep(20);
        } catch (InterruptedException e) {
            System.out.println("Error en el tercer hilo: " + e);
        }

        hilo4.start();

        try {
            hilo4.sleep(20);
        } catch (InterruptedException e) {
            System.out.println("Error en el cuarto hilo: " + e);
        }

        hilo5.start();

        try {
            hilo5.sleep(20);
        } catch (InterruptedException e) {
            System.out.println("Error en el quinto hilo: " + e);
        }

    }
}
