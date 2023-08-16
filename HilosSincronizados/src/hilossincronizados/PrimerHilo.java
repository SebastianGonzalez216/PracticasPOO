package hilossincronizados;

public class PrimerHilo extends Thread {
    
    @Override
    public void run() {
        
        for (int i = 0; i < 5; i++) {
            int x = i +1;
            System.out.print(x + ".- S");
            
            try {
                PrimerHilo.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase del Hilo1: " + e);
            }
        }
        
    }
    
}
