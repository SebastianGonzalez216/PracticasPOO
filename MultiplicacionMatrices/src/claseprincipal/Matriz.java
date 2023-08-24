
package claseprincipal;

import operacion.Operacion;


public class Matriz {
    
    public static void main (String args[]){
        
    Operacion operacion = new Operacion();
    
        System.out.println("---Suma de matrices aleatoria---\n");
        operacion.llenarMatrizUno();
        operacion.llenarMatrizDos();
        operacion.multiplicar();
        operacion.imprimirResultado();
    }
    
}
