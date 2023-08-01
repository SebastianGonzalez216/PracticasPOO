package simulacionlogin;

import java.util.Scanner;

public class SimulacionLogin {

    public static void main(String[] args) {

        short opcion = 0, opcionDos = 0;
        String correo = "", password = "";

        Usuario usuario = new Usuario();
        Scanner entrada = new Scanner(System.in);

        System.out.println("-----Bienvenido a la pantalla de inicio de sesion-----\n");
        do {
            System.out.println("Que desea hacer?\n");
            System.out.println("1.-Registrar usuario\n2.-Iniciar sesion\n3.-Salir");
            opcion = entrada.nextShort();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el correo electronico del nuevo usuario:");
                    correo = entrada.next();
                    System.out.println("Ingrese su respectiva contraseña:");
                    password = entrada.next();

                    usuario.registrarUsuario(correo, password);
                    break;
                case 2:
                    System.out.println("Ingrese un correo electronico:");
                    correo = entrada.next();
                    System.out.println("Ingrese su contraseña de acceso:");
                    password = entrada.next();

                    usuario.validarUsuario(correo, password);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;

            }
            System.out.println("Desea realizar otra accion? ingrese un '1' para SI");
            opcionDos = entrada.nextShort();

        } while (opcionDos == 1);
        System.exit(0);
    }

}
