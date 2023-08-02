
package employee;

public class DesarrolladorSR extends Empleado {
    
    @Override
    public void calcularSalario() {
        salario = 700 * horasTrabajadas;
    }
    
}
