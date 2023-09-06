
package personajes;

import interfacesvideojuego.InterfacesVideojuego;

public class Mago extends Personaje implements interfaces.MagiaFuego, interfaces.MagiaHielo, interfaces.MagiaTrueno{
    
public Mago (String nombre){
hp = 80;
ataque = 25;
this.nombre = nombre;
}

    @Override
    public void incinerar() {
        System.out.println(nombre + " Ha utilizado incinerar");
        InterfacesVideojuego.valorDeAtaque = 20;
    }

    @Override
    public void congelar() {
        System.out.println(nombre + " Ha utilizado congelar");
        InterfacesVideojuego.valorDeAtaque = 25;

    }

    @Override
    public void electrocutar() {
        System.out.println(nombre + " Ha utilizado electrocutar");
        InterfacesVideojuego.valorDeAtaque = 30;

    }
   
}
