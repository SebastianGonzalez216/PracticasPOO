package inventario.objetos;

public class HierbaMedicinal extends Objeto {

    private int curacion;

    public HierbaMedicinal() {
    }

    public HierbaMedicinal(int idObjeto, String descripcion) {
        super(idObjeto, descripcion);
        this.curacion = 100;
    }

    private int curar() {
        System.out.println("\nSalud del jugador restaurada");
        return curacion;
    }

    @Override
    public void usarObjeto() {
        curar();
    }

}

