
package boletos;

public class Boleto {
    
    public static int numeroBoleto;
    public String tipoDeFuncion;   
    public String funcion;
    public String hora;
    public double precio;
    
    public Boleto(String tipoDeFuncion, String funcion, String hora ,double precio){
        
        this.tipoDeFuncion = tipoDeFuncion;
        this.funcion = funcion;
        this.hora = hora;
        this.precio = precio;    
    }
    
    public void generarBoleto(){
        numeroBoleto++; 
        System.out.println("Boleto numero " + numeroBoleto + " generado con los siguientes datos:\n");
        System.out.println("ID: " + numeroBoleto);
        System.out.println("Tipo de funcion: " + tipoDeFuncion);
        System.out.println("Funcion: " + funcion);
        System.out.println("Hora: " + hora);
        System.out.println("Precio: $" + precio + "\n");
    }
}
