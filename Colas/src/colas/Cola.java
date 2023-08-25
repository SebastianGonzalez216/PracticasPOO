
package colas;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    // Primeros que entran, primeros que salen

    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<String>();

        System.out.println("Insertando tres elementos en la cola: manzana, mango y platano");

        cola.offer("manzana");
        cola.offer("mango");
        cola.offer("platano");

        System.out.println("Numero de elementos en la cola: " + cola.size());

        System.out.println("\nElemento extraido de la cola: " + cola.poll());
        System.out.println("Numero de elementos en la cola: " + cola.size());

        System.out.println("\nConsulta del primer elemento de la cola sin extraerlo: " + cola.peek());
        System.out.println("Numero de elementos en la cola: " + cola.size());

        System.out.println("\nExtraer elementos de la cola mientras no esté vacía: ");
        while (!cola.isEmpty()) {
            System.out.print(cola.poll() + " X ");
        }
        System.out.println();

        Queue<Integer> colaEnteros = new LinkedList<Integer>();

        colaEnteros.offer(70);
        colaEnteros.offer(120);
        colaEnteros.offer(6);
        System.out.println("\nBorramos toda la cola:");
        colaEnteros.clear();
        System.out.println("Cantidad de elementos en la cola de enteros: " + colaEnteros.size());
    }
}