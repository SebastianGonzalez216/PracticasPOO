
package personajes;


public abstract class Personaje {
    
    protected int hp;
    protected int ataque;
    protected String nombre;

    public Personaje() {    
    }
  
    public void curarse(){
    hp = 100;
    }
    
    public void recibirDaño(int daño){
    hp=-daño;
    }
    
    public int getHp(){
    return hp;
    }
    
    
       
}
