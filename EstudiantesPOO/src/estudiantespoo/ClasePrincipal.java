package estudiantespoo;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {

        int i = 0;
        String matricula = "";
        String nombre = "";
        short edad = 0;
        double calificaciones[] = new double[5];

        Scanner entrada = new Scanner(System.in);

        System.out.println("=====REGISTRO DE ALUMNOS=====\n");
        System.out.println("Ingresa la matricula del alumno:");
        matricula = entrada.nextLine();
        System.out.println("Ingresa el nombre del alumno:");
        nombre = entrada.nextLine();
        System.out.println("Ingresa su edad:");
        edad = entrada.nextShort();

        Estudiante estudiante = new Estudiante(i, matricula, nombre, edad);

        System.out.println("Ingresa sus calificaciones");

        for (i = 0; i < calificaciones.length; i++) {

            if (i == 0) {
                System.out.println("1.-Español:");
            }
            if (i == 1) {
                System.out.println("2.-Matematicas:");
            }
            if (i == 2) {
                System.out.println("3.-Ciencias Natuarles:");
            }
            if (i == 3) {
                System.out.println("4.-Geografia:");
            }
            if (i == 4) {
                System.out.println("5.-Educacion Fisica:");
            }

            calificaciones[i] = entrada.nextDouble();
            
            if (calificaciones[i] < 0 || calificaciones[i] > 10) {
                System.out.println("La calificacion ingresada es invalida, por favor ingresela nuevamente");
                i--;
            }
        }

        System.out.println("-----Los datos ingresados son------");
        estudiante.imprimirDatosAlumno();
        estudiante.calcularCalificaciones(calificaciones);
        estudiante.imprimirCalificacionFinal();

    }

}
