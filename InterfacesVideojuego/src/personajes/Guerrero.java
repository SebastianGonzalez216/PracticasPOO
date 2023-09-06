package personajes;

import interfacesvideojuego.InterfacesVideojuego;

public class Guerrero extends Personaje implements interfaces.Espada, interfaces.Mandoble, interfaces.Martillo {

    public Guerrero(String nombre) {
        hp = 100;
        ataque = 15;
        this.nombre = nombre;
    }

    @Override
    public void estocada() {
        System.out.println(nombre + " Ha utilizado estocada");
        InterfacesVideojuego.valorDeAtaque = 20;

    }

    @Override
    public void corteHorizontal() {
        System.out.println(nombre + " Ha utilizado corte horizontal");
        InterfacesVideojuego.valorDeAtaque = 25;

    }

    @Override
    public void golpear() {
        System.out.println(nombre + " Ha utilizado golpe de martillo");
        InterfacesVideojuego.valorDeAtaque = 30;

    }

}
