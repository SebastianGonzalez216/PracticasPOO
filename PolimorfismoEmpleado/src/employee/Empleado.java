
package employee;

public abstract class Empleado {
    
    protected double salario= 0;
    protected short horasTrabajadas = 0;
 
    public void imprimirDatos(String nombreDelEmpleado, String apellidoPaterno, String apellidoMaterno, String sexo, String puesto){
        System.out.println("----EMPLEADO----\n");
        System.out.println("Nombre: " + nombreDelEmpleado + "\nApellido Paterno: " + apellidoPaterno + "\nApellido Materno: " + apellidoMaterno + "\nSexo: " + sexo + "\nPuesto: " + puesto);    
    }
    
    public void solicitarHoras(short horasTrabajadas){
    this.horasTrabajadas = horasTrabajadas;   
    }
  
    public abstract void calcularSalario();
    
    public void imprimirSalario(){
        System.out.println("\n*** El salario corresponiente a este trabajador es: $" + salario + " ***");
    }
}
