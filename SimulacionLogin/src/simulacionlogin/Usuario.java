package simulacionlogin;

import java.util.Scanner;

public class Usuario {

    short opcion = 0;

    String usuarios[][] = new String[3][2];
    Scanner entrada = new Scanner(System.in);

    public void registrarUsuario(String correo, String password) {
        System.out.println("En que espacio desea registrar el usuario? si el espacio esta ocupado sera sustituido\n1.-Primer espacio\n2.-Segundo espacio\n3.-Tercer espacio");
        opcion = entrada.nextShort();

        switch (opcion) {
            case 1:
                usuarios[0][0] = correo;
                usuarios[0][1] = password;
                break;
            case 2:
                usuarios[1][0] = correo;
                usuarios[1][1] = password;
                break;
            case 3:
                usuarios[2][0] = correo;
                usuarios[2][1] = password;
                break;
            default:
                System.out.println("El espacio ingresado invalido, no se ha registrado ningun usuario");
        }
    }

    public void validarUsuario(String correo, String password) {

        short validacion = 0;

        for (int i = 0; i < 3; i++) {

            if (correo.equals(usuarios[i][0]) && password.equals(usuarios[i][1])) {
                System.out.println("Ingreso al sistema correctamente");
                validacion = 1;
            }

        }
        if (validacion == 0) {
            System.out.println("El usuario y/o contraseña ingresados son incorrectos");

        }
    }

}
