package com.principal;

public class Main {

    public static void main(String[] args) {
	Juego juego = new Juego(5);

        System.out.println(Juego.numeroVidas());
        Juego.vidasRestantes();
        Juego.VidasActual();
     JuegoVida juegoVida = new JuegoVida(5);
     JuegoVida.vidasRestantes();
     Juego.vidasRestantes();
     Juego2Parte juego2Parte = new Juego2Parte(5);
     juego2Parte.quitarVida();
        System.out.println(juego2Parte.getNumeroVidas());
        Juego2Parte.reiniciarjuego();
        System.out.println(juego2Parte.vidasRestantres());
        juego.getrecord();
        juego2Parte.getRecord();



    }


}
