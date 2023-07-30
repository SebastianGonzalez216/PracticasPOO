
package gettersetter;

import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main (String args[]){
        
        String tipo ="", color ="";
        int peso = 0, numeroPuertas = 0;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("----Registro de coches-----\n");
        System.out.println("De que tipo es el coche?");
        tipo = entrada.nextLine();
        System.out.println("De que color es el coche?");
        color = entrada.nextLine();
        System.out.println("Cuantos kilos pesa?");
        peso = entrada.nextInt();
        System.out.println("Cuantas puertas tiene?");
        numeroPuertas = entrada.nextInt();
        
        Coche coche = new Coche(tipo,color,peso,numeroPuertas);
        
        //pasando este valor por el metodo set, el coche siempre sera determinado como pesado
        coche.setPeso(3001);
        //El valor se puede consultar con el metodo get
        System.out.println("*** Los kilos fueron modificados a " + coche.getPeso()+" ***\n");
        
        coche.determinarVehiculoBasePeso();
    }
    
}
