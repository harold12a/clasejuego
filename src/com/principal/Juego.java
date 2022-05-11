package com.principal;

public class Juego {
    private static int numeroVidas;
    private  int vidasActual;
    private static int vidasRestantes;

     Juego(int numeroVidas){

        this.numeroVidas = numeroVidas;
        this.vidasActual = vidasActual;
        this.vidasRestantes = vidasRestantes;
    }

    public static int numeroVidas() {
        return numeroVidas;
    }

    public static int vidasRestantes() {
        return vidasRestantes-1;
    }

    public static String VidasActual() {
        return " vidas restantes"+ numeroVidas;
    }


    public void getrecord() {
    }
}
