
package inventario.objetos;


public class PaloMadera extends Objeto {
    
    private int dañoGolpe;

    public PaloMadera() {
    }

    public PaloMadera(int idObjeto, String descripcion) {
        super(idObjeto, descripcion);
        this.dañoGolpe = 25;
    }
    
    private int golpear(){
        System.out.println("\nGolpenado");
        return dañoGolpe;
    }

    @Override
    public void usarObjeto() {
        golpear();
    }
    
}
