package br.com.edu.topicos.orientacao_objeto.desafios.ar_condicionado;

public class ArCondicionado {
    private int temperatura = 0;
    private int intensidadeDoVento = 0;
    private boolean ligado = false;

    public ArCondicionado(){
        this.temperatura = 0;
        this.intensidadeDoVento = 0;
        this.ligado = false;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getIntensidadeDoVento() {
        return intensidadeDoVento;
    }

    public void setIntensidadeDoVento(int intensidadeDoVento) {
        this.intensidadeDoVento = intensidadeDoVento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}