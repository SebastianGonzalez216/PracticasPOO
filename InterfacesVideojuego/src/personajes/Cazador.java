package personajes;

import interfacesvideojuego.InterfacesVideojuego;

public class Cazador extends Personaje implements interfaces.Arco, interfaces.Ballesta, interfaces.Daga {

    public Cazador(String nombre) {
        hp = 90;
        ataque = 20;
        this.nombre = nombre;
    }

    @Override
    public void dispararFlecha() {
        System.out.println(nombre + " Ha disparado una flecha");
        InterfacesVideojuego.valorDeAtaque = 20;

    }

    @Override
    public void dispararVirote() {
        System.out.println(nombre + " Ha disparado un irote");
        InterfacesVideojuego.valorDeAtaque = 25;

    }

    @Override
    public void apuñalar() {
        System.out.println(nombre + " Ha utilizado apuñalar");
        InterfacesVideojuego.valorDeAtaque = 30;


    }

}
