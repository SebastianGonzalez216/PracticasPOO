
package employee;

public class DesarrolladorJR extends Empleado{
    
    @Override
    public void calcularSalario() {
        salario = 380 * horasTrabajadas;
    }
    
}
