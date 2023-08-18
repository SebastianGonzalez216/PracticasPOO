package dadoaleatorio;

import java.util.Random;

public class DadoAleatorio extends Thread {

    public static void main(String[] args) throws InterruptedException {

        int aleatorio = 0;
        Random random = new Random();
        aleatorio = random.nextInt(1, 7);

        System.out.println("----Lanzamiento de dado----\n");
        System.out.println("Lanzando...");
        DadoAleatorio.sleep(2000);

        switch (aleatorio) {
            case 1:
                System.out.println("Haz obtenido un uno");
                System.out.println("_ _ _ _ _");
                System.out.println("|       |");
                System.out.println("|   O   |");
                System.out.println("|       |");
                System.out.println("_ _ _ _ _");
                break;
            case 2:
                System.out.println("Haz obtenido un dos");
                System.out.println("_ _ _ _ _");
                System.out.println("|O      |");
                System.out.println("|       |");
                System.out.println("|      O|");
                System.out.println("_ _ _ _ _");
                break;
            case 3:
                System.out.println("Haz obtenido un tres");
                System.out.println("_ _ _ _ _");
                System.out.println("|O      |");
                System.out.println("|   O   |");
                System.out.println("|      O|");
                System.out.println("_ _ _ _ _");
                break;
            case 4:
                System.out.println("Haz obtenido un cuatro");
                System.out.println("_ _ _ _ _");
                System.out.println("|O     O|");
                System.out.println("|       |");
                System.out.println("|O     O|");
                System.out.println("_ _ _ _ _");
                break;
            case 5:
                System.out.println("Haz obtenido un cinco");
                System.out.println("_ _ _ _ _");
                System.out.println("|O     O|");
                System.out.println("|   O   |");
                System.out.println("|O     O|");
                System.out.println("_ _ _ _ _");
                break;
            case 6:
                System.out.println("Haz obtenido un seis");
                System.out.println("_ _ _ _ _");
                System.out.println("|O     O|");
                System.out.println("|O     O|");
                System.out.println("|O     O|");
                System.out.println("_ _ _ _ _");
                break;

        }
        System.exit(0);

    }

}
