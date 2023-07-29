package estudiantespoo;

public class Estudiante {

    private int i = 0;
    private String matricula = "";
    private String nombre = "";
    private short edad = 0;
    private double calificaciones[] = new double[5];
    public double calificacionFinal;

    public Estudiante(int i, String matricula, String nombre, short edad) {
        this.i = i;
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;

    }

    public void imprimirDatosAlumno() {
        System.out.println("Matricula: " + matricula + "\nNombre: " + nombre + "\nEdad: " + edad);

    }

    public void calcularCalificaciones(double calificaciones[]) {

        for (int i = 0; i < calificaciones.length; i++) {
            calificacionFinal = calificacionFinal + calificaciones[i];
        }
        
        calificacionFinal = calificacionFinal/5;

    }

    public void imprimirCalificacionFinal() {
        System.out.println("Calificacion final: " + calificacionFinal);

    }

}
