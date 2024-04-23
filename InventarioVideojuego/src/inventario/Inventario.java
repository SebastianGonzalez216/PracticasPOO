package inventario;

import inventario.objetos.Objeto;
import java.util.ArrayList;

public class Inventario {

    private int idInventario;
    private ArrayList<Objeto> inventarioJugador;

    public Inventario() {

    }

    public Inventario(int idInventario) {
        this.idInventario = idInventario;
        this.inventarioJugador = new ArrayList<>();
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public ArrayList<Objeto> mostrarInventario() {
        for (Objeto objeto : inventarioJugador) {
            System.out.println(objeto);
        }
        return inventarioJugador;
    }

    public void añadirObjeto(Objeto objeto) {
        System.out.println("\nObjeto añadido al inventario");
        inventarioJugador.add(objeto);
    }

    public void eliminarObjeto(int idObjeto) {
        boolean objetoEncontrado = false;
        for (Objeto objeto : inventarioJugador) {

            if (objeto.getIdObjeto() == idObjeto) {
                inventarioJugador.remove(objeto);
                System.out.println("\nEl objeto ha sido descartado del inventario");
                objetoEncontrado = true;
                break;
            }
        }

        if (objetoEncontrado == false) {
            System.out.println("\nEl objeto no existe");
        }

    }

    public void mostrarDescripcionObjeto(int idObjeto) {
        boolean objetoEncontrado = false;
        for (Objeto objeto : inventarioJugador) {

            if (objeto.getIdObjeto() == idObjeto) {
                System.out.println("\nDescripcion:\n\n" + objeto.getDescripcion());              
                objetoEncontrado = true;
            }
        }

        if (objetoEncontrado == false) {
            System.out.println("\nEl objeto no existe");
        }

    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", inventarioJugador=" + inventarioJugador + '}';
    }
    
    
}
