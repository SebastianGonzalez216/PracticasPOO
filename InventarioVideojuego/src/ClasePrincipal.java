
import inventario.Inventario;
import inventario.objetos.HierbaMedicinal;
import inventario.objetos.LLave;
import inventario.objetos.Objeto;
import inventario.objetos.PaloMadera;

public class ClasePrincipal {

    public static void main(String[] args) {

        Inventario inventarioJugador = new Inventario(1);

        HierbaMedicinal objeto1 = new HierbaMedicinal(1, "hierba verde, cura al jugador por completo");
        LLave objeto2 = new LLave(100, "llave vieja para abrir una puerta");
        PaloMadera objeto3 = new PaloMadera(2, "Palo de manera no muy resistente");
        PaloMadera objeto4 = new PaloMadera(3, "Palo de manera no muy resistente (dañado)");


        inventarioJugador.añadirObjeto(objeto1);
        inventarioJugador.añadirObjeto(objeto2);
        inventarioJugador.añadirObjeto(objeto3);
        inventarioJugador.añadirObjeto(objeto4);


        System.out.println("\nMostrando inventario del jugador " + inventarioJugador.getIdInventario() + ":\n");

        inventarioJugador.mostrarInventario();

        //===================================================

        inventarioJugador.eliminarObjeto(3);
        
        
        System.out.println("\nMostrando inventario del jugador " + inventarioJugador.getIdInventario() + ":\n");

        inventarioJugador.mostrarInventario();

        inventarioJugador.eliminarObjeto(7);

        //=================================================
        
        objeto2.usarObjeto();
        objeto2.usarObjeto(5);
        objeto2.usarObjeto(100);
        
        //=========================================
        
        objeto1.usarObjeto();
        objeto3.usarObjeto();
        
        inventarioJugador.mostrarDescripcionObjeto(1);
        

    }

}
