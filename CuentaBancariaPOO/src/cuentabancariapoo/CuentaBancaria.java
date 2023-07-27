package cuentabancariapoo;

//Clase "CuentaBancaria"
public class CuentaBancaria {

    //Creacion de constantes y variables
    String numero = "00831970228558017807";
    String titular = "Pedrito";
    Double saldo = 0.0;

    //Constructor de la clase, saldo inicial de la cuenta
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    
    //Metodo depositar que recibe el parametro cantidad
    public void Depositar(double cantidad) {

        saldo = saldo + cantidad;
        
        //Si saldo es mayor a 25000 tras la operacion
        if (saldo > 25000) {
            System.out.println("Limite de la cuenta excedido, operacion rechazada");
            saldo = saldo - cantidad;
        }
    }

    //Metodo retirar que recibe el parametro cantidad
    public void Retirar(double cantidad) {
        saldo = saldo - cantidad;
        
        //Si saldo es menor a 0 tras la operacion
        if (saldo < 0) {
            System.out.println("Saldo insuficiente, consulte su saldo disponible");
            saldo = saldo + cantidad;
        }
    }
    
    //Metodo para imprimir el saldo 
    public void ConsultarSaldo() {
        System.out.println("$" + saldo);
    }

}
