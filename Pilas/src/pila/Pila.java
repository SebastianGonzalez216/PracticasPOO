package pila;

import java.util.Stack;

public class Pila {
    //primeros que entran ultimos que salen

    public static void main(String[] args) {
        
        Stack<String> pila1 = new Stack<String>();
        
        System.out.println("Insertando tres elementos en la pila... manzana, mango y platano");
        
        pila1.push("manzana");
        pila1.push("mango");
        pila1.push("platano");
        
        System.out.println("Numero de elementos en la pila: " + pila1.size());
        
        System.out.println("\nElemento extraido de la de la pila: " + pila1.pop());
        System.out.println("Numero de elementos en la pila: " + pila1.size());
        
        System.out.println("\nConsulta del primer elemento de la pila sin extraerlo: " + pila1.peek());
        System.out.println("Numero de elementos en la pila: " + pila1.size());
        
        System.out.println("\nExtraer un elemento de la pila mientras no este vacía: ");
        while (!pila1.isEmpty()) {
            System.out.print(pila1.pop() + " X ");
        }
        System.out.println();

        Stack<Integer> pila2 = new Stack<Integer>();
        
        pila2.push(70);
        pila2.push(120);
        pila2.push(6);
        System.out.println("\nBorramos toda la pila:");
        pila2.clear();
        System.out.println("Cantidad de elementos en la pila de enteros: " + pila2.size());
    }
}
