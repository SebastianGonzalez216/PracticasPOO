package inventario.objetos;

public class LLave extends Objeto {

    private boolean llaveUsada;

    public LLave() {

    }

    public LLave(int idObjeto, String descripcion) {
        super(idObjeto, descripcion);
        llaveUsada = false;
    }

    public void usarObjeto(int idPuerta) {
        if (this.getIdObjeto() == idPuerta) {
            System.out.println("\nUtilizando llave para abrir puerta");
        } else {
            System.out.println("\nLa cerradura no coincide");

        }
    }

    @Override
    public void usarObjeto() {
        System.out.println("\nEste objeto solo puede utilizarse con puertas");
    }

}
