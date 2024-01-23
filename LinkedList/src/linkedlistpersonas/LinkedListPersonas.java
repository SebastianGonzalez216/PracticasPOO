package linkedlistpersonas;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPersonas {

    public static void main(String[] args) {

        Persona persona1 = new Persona(1, "Agustin", "Masculino", 20);
        Persona persona2 = new Persona(2, "Fernando", "Masculino", 22);
        Persona persona3 = new Persona(3, "Carlos", "Masculino", 36);
        Persona persona4 = new Persona(4, "Maria", "Femenino", 18);
        Persona persona5 = new Persona(5, "Brenda", "Femenino", 33);

        List<Persona> listaDePersonas = new LinkedList<Persona>();

        listaDePersonas.add(persona1);
        listaDePersonas.add(persona2);
        listaDePersonas.add(persona3);
        listaDePersonas.add(persona4);
        
        listaDePersonas.add(0,persona5);

        for (Persona persona : listaDePersonas) {
            System.out.println("PERSONA " + persona.getId() + ": " + persona.getNombre());

        }

    }

}
