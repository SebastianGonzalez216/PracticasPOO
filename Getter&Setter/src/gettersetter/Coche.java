package gettersetter;

public class Coche {

    private String tipo = "", color = "";
    private int peso = 0, numeroPuertas = 0;

    public Coche(String tipo, String color, int peso, int numeroPuertas) {
        this.tipo = tipo;
        this.color = color;
        this.peso = peso;
        this.numeroPuertas = numeroPuertas;

    }

    public void imprimirDatosCoche() {
        System.out.println("Tipo: " + tipo + "\nColor: " + color + "\nPeso: " + peso + "\nNumero de puertas: " + numeroPuertas);
    }

    public void determinarVehiculoBasePeso() {
        imprimirDatosCoche();

        if (peso > 3000) {
            System.out.println("\nEste coche es del tipo pesado");
        } else {
            System.out.println("Este coche es del tipo liviano");
        }
    }

//Metodos Setter y getter
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
