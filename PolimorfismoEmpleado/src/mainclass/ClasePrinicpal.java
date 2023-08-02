package mainclass;

import employee.DesarrolladorTrainee;
import employee.DesarrolladorJR;
import employee.DesarrolladorSR;
import employee.Empleado;

import java.util.Scanner;

public class ClasePrinicpal {

    public static void main(String[] args) {

        short opcion = 0, horasTrabajadas = 0;
        String nombreDelEmpleado = "", apellidoPaterno = "", apellidoMaterno = "", sexo = "", puesto = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("-----Bienvenido al sistema para calcular salarios de los empleados-----\n");
        System.out.println("Ingrese los siguientes datos del empleado:\n");
        System.out.println("Nombre:");
        nombreDelEmpleado = entrada.next();
        System.out.println("Apellido Paterno:");
        apellidoPaterno = entrada.next();
        System.out.println("Apellido Materno:");
        apellidoMaterno = entrada.next();
        System.out.println("Sexo:");
        sexo = entrada.next();
        System.out.println("Cuantas horas trabajo el empleado este mes?");
        horasTrabajadas = entrada.nextShort();

        do {

            System.out.println("A que puesto pertenece el trabajador?\n1.-Desarrollador Trainee\n2.-Desarrollador JR\n3.-Desarrollador SR");
            opcion = entrada.nextShort();

            switch (opcion) {
                case 1:
                    puesto = "Desarrollador Trainee";

                    Empleado desarrolladortrainee = new DesarrolladorTrainee();
                    desarrolladortrainee.imprimirDatos(nombreDelEmpleado, apellidoPaterno, apellidoMaterno, sexo, puesto);
                    desarrolladortrainee.solicitarHoras(horasTrabajadas);
                    desarrolladortrainee.calcularSalario();
                    desarrolladortrainee.imprimirSalario();
                    break;
                case 2:
                    puesto = "Desarrollador JR";

                    Empleado desarrolladorjr = new DesarrolladorJR();
                    desarrolladorjr.imprimirDatos(nombreDelEmpleado, apellidoPaterno, apellidoMaterno, sexo, puesto);
                    desarrolladorjr.solicitarHoras(horasTrabajadas);
                    desarrolladorjr.calcularSalario();
                    desarrolladorjr.imprimirSalario();
                    break;
                case 3:
                    puesto = "Desarrollador SR";

                    Empleado desarrolladorsr = new DesarrolladorSR();
                    desarrolladorsr.imprimirDatos(nombreDelEmpleado, apellidoPaterno, apellidoMaterno, sexo, puesto);
                    desarrolladorsr.solicitarHoras(horasTrabajadas);
                    desarrolladorsr.calcularSalario();
                    desarrolladorsr.imprimirSalario();
                    break;
                default:
                    System.out.println("Por favor, ingrese una opcion valida");
                    break;
            }
            System.out.println(opcion);
        } while (opcion < 0 || opcion > 3);

        System.exit(0);
    }
}
