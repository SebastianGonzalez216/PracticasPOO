package inventario.objetos;

public abstract class Objeto {

    private int idObjeto;
    private String descripcion;

    public Objeto() {

    }

    public Objeto(int idObjeto, String descripcion) {
        this.idObjeto = idObjeto;
        this.descripcion = descripcion;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract void usarObjeto();

    @Override
    public String toString() {
        return "Objeto{" + "idObjeto=" + idObjeto + ", descripcion=" + descripcion + '}';
    }   

}
