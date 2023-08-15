
package hilos;


public class ClasePrincipal {
    
    public static void main(String args[]){
        
        ProcesoUno hilo1 = new ProcesoUno();
        Thread hilo2 = new Thread(new ProcesoDos());
        
        hilo1.start();
        hilo2.start();
    }
    
}
