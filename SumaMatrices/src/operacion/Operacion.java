package operacion;

import java.util.Random;

public class Operacion {

    int numero;
    private int matrizUno[][] = new int[3][3];
    private int matrizDos[][] = new int[3][3];
    private int matrizResultado[][] = new int[3][3];

    Random random = new Random();

    public void llenarMatrizUno() {

        for (int i = 0; i < 3; i++) {
            numero = random.nextInt(10, 50);
            matrizUno[i][0] = numero;

            for (int x = 0; x < 3; x++) {
                numero = random.nextInt(10, 50);
                matrizUno[i][x] = numero;

            }
        }
    }

    public void llenarMatrizDos() {

        for (int i = 0; i < 3; i++) {
            numero = random.nextInt(10, 50);
            matrizDos[i][0] = numero;
            for (int x = 0; x < 3; x++) {
                numero = random.nextInt(10, 50);
                matrizDos[i][x] = numero;

            }
        }
    }

    public void sumar() {
        matrizResultado[0][0] = matrizUno[0][0] + matrizDos[0][0];
        matrizResultado[0][1] = matrizUno[0][1] + matrizDos[0][1];
        matrizResultado[0][2] = matrizUno[0][2] + matrizDos[0][2];
        
        matrizResultado[1][0] = matrizUno[1][0] + matrizDos[1][0];
        matrizResultado[1][1] = matrizUno[1][1] + matrizDos[1][1];
        matrizResultado[1][2] = matrizUno[1][2] + matrizDos[1][2];
        
        matrizResultado[2][0] = matrizUno[2][0] + matrizDos[2][0];
        matrizResultado[2][1] = matrizUno[2][1] + matrizDos[2][1];
        matrizResultado[2][2] = matrizUno[2][2] + matrizDos[2][2];
    }

    public void imprimirResultado() {
        System.out.println("[ " + matrizUno[0][0] + " ]" + "[ " + matrizUno[0][1] + " ]" + "[ " + matrizUno[0][2] + " ]" + "     " + "[ " + matrizDos[0][0] + " ]" + "[ " + matrizDos[0][1] + " ]" + "[ " + matrizDos[0][2] + " ]" + "     " + "[ " + matrizResultado[0][0] + " ]" + "[ " + matrizResultado[0][1] + " ]" + "[ " + matrizResultado[0][2] + " ]");
        System.out.println("[ " + matrizUno[1][0] + " ]" + "[ " + matrizUno[1][1] + " ]" + "[ " + matrizUno[1][2] + " ]" + "  +  " + "[ " + matrizDos[1][0] + " ]" + "[ " + matrizDos[1][1] + " ]" + "[ " + matrizDos[1][2] + " ]" + "  =  " + "[ " + matrizResultado[1][0] + " ]" + "[ " + matrizResultado[1][1] + " ]" + "[ " + matrizResultado[1][2] + " ]");
        System.out.println("[ " + matrizUno[2][0] + " ]" + "[ " + matrizUno[2][1] + " ]" + "[ " + matrizUno[2][2] + " ]" + "     " + "[ " + matrizDos[2][0] + " ]" + "[ " + matrizDos[2][1] + " ]" + "[ " + matrizDos[2][2] + " ]" + "     " + "[ " + matrizResultado[2][0] + " ]" + "[ " + matrizResultado[2][1] + " ]" + "[ " + matrizResultado[2][2] + " ]");

    }

}
