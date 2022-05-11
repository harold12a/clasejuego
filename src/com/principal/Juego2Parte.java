package com.principal;

public class Juego2Parte {
    private Integer vidas;
    private Integer numeroVidas;
    private static Integer record=0;
    private static Integer reiniciarPartida;

    public Juego2Parte(Integer vidas) {
        this.vidas = vidas;
        this.numeroVidas = numeroVidas;
    }

    public static void reiniciarjuego() {
    }


    public Integer getVidas() {
        return vidas;
    }

    public void setVidas(Integer vidas) {
        this.vidas = vidas;
    }

    public Integer getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(Integer numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public static Integer getRecord() {
        return record;
    }

    public static void setRecord(Integer record) {
        Juego2Parte.record = record;
    }

    public boolean quitarVida(){
        if(this.vidas>=numeroVidas){
            System.out.println("le quedan vidas de juego");
            for (int i = vidas; i <numeroVidas ; i--);
        }else {
            System.out.println("juego terminado");
        }
        return this.vidas>0;
    }

        public void reiniciarJuego(){
            this.vidas=numeroVidas;
        }
        public void actualizarRecord(){
            if (this.vidas==record){
                System.out.println("alcanzastes el record"+this.vidas);
            }else if(this.vidas>record){
                record = this.vidas;
                System.out.println("has batido el record"+this.vidas);
            }else{
                System.out.println("sigue intentando ");

            }

        }


    public boolean vidasRestantres() {
        return false;
    }
}




