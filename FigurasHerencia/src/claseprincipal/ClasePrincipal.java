package claseprincipal;

import figuras.Circulo;
import figuras.Rectangulo;
import figuras.Triangulo;
import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        short opcion = 0;

        System.out.println("-----BIENVENIDO AL MENU DE CALCULO DE AREA DE FIGURAS-----\n");
        System.out.println("De que figura deseas calcular su area?\n");
        System.out.println("1.-Circulo\n2.-Triangulo\n3.-Rectangulo\n\nIngrese cualquier otro numero para salir");
        opcion = entrada.nextShort();

        switch (opcion) {
            case 1:
                System.out.println("--Ha seleccionado area del Circulo--");
                Circulo circulo = new Circulo();
                circulo.solicitarDatosFiguraIrregular();
                circulo.calcularAreaCirculo();
                circulo.imprimirResultado();
                break;
            case 2:
                System.out.println("*Ha seleccionado area del Triangulo");
                Triangulo triangulo = new Triangulo();
                triangulo.solicitarDatosFiguraRegular();
                triangulo.calcularAreaTriangulo();
                triangulo.imprimirResultado();
                break;
            case 3:
                System.out.println("Ha seleccionado area del Rectangulo");
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.solicitarDatosFiguraRegular();
                rectangulo.calcularAreaRectangulo();
                rectangulo.imprimirResultado();
                break;
            default:
                System.out.println("Saliendo...");
                System.exit(0);
                break;
        }

        System.exit(0);

    }

}
