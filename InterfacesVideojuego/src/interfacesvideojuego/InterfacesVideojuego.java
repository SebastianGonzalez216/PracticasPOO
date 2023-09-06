
package interfacesvideojuego;
import personajes.Cazador;
import personajes.Guerrero;
import personajes.Mago;


public class InterfacesVideojuego {

    public static int valorDeAtaque;



    public static void main(String[] args) {
        
        Mago merlin = new Mago("Merlin");
        Guerrero farkas = new Guerrero("Farkas");
        Cazador altair = new Cazador("Altair");
        
        
        merlin.congelar();
        System.out.println("Puntos de vida " + merlin.getHp());
        
        farkas.estocada();
        System.out.println("Puntos de vida " + farkas.getHp());

        altair.dispararFlecha();
        System.out.println("Puntos de vida " + altair.getHp());
        
        
        
        


    }
    
}
