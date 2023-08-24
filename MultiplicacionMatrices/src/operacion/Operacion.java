package operacion;

import java.util.Random;

public class Operacion {

    int numero;
    private int matrizUno[][] = new int[2][3];
    private int matrizDos[][] = new int[3][2];
    private int matrizResultado[][] = new int[2][2];

    Random random = new Random();

    public void llenarMatrizUno() {

        for (int i = 0; i < 2; i++) {
            numero = random.nextInt(1, 9);
            matrizUno[i][0] = numero;

            for (int x = 0; x < 3; x++) {
                numero = random.nextInt(1, 9);
                matrizUno[i][x] = numero;

            }
        }
    }

    public void llenarMatrizDos() {

        for (int i = 0; i < 3; i++) {
            numero = random.nextInt(1, 9);
            matrizDos[i][0] = numero;
            for (int x = 0; x < 2; x++) {
                numero = random.nextInt(1, 9);
                matrizDos[i][x] = numero;

            }
        }
    }

    public void multiplicar() {
        
        matrizResultado[0][0] = (matrizUno[0][0] * matrizDos[0][0]) + (matrizUno[0][1] * matrizDos[1][0]) + (matrizUno[0][2] * matrizDos[2][0]); 
        matrizResultado[1][0] = (matrizUno[1][0] * matrizDos[0][0]) + (matrizUno[1][1] * matrizDos[1][0]) + (matrizUno[1][2] * matrizDos[2][0]);  
        matrizResultado[0][1] = (matrizUno[0][0] * matrizDos[0][1]) + (matrizUno[0][1] * matrizDos[1][1]) + (matrizUno[0][2] * matrizDos[2][1]);
        matrizResultado[1][1] = (matrizUno[1][0] * matrizDos[0][1]) + (matrizUno[1][1] * matrizDos[1][1]) + (matrizUno[1][2] * matrizDos[2][1]);
      
    }

    public void imprimirResultado() {
        System.out.println("[ " + matrizUno[0][0] + " ]" + "[ " + matrizUno[0][1] + " ]" + "[ " + matrizUno[0][2] + " ]" + "     " + "[ " + matrizDos[0][0] + " ]" + "[ " + matrizDos[0][1] + " ]" +  "     " + "[ " + matrizResultado[0][0] + " ]" + "[ " + matrizResultado[0][1] + " ]");
        System.out.println("[ " + matrizUno[1][0] + " ]" + "[ " + matrizUno[1][1] + " ]" + "[ " + matrizUno[1][2] + " ]" + "  x  " + "[ " + matrizDos[1][0] + " ]" + "[ " + matrizDos[1][1] + " ]" +  "  =  " + "[ " + matrizResultado[1][0] + " ]" + "[ " + matrizResultado[1][1] + " ]");
        System.out.println("               " + "     " + "[ " + matrizDos[2][0] + " ]" + "[ " + matrizDos[2][1] + " ]" +  "     " + "                                                                       ");

    }

}
