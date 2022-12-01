package br.com.edu.topicos.orientacao_objeto.desafios.jogador;

public class Jogador {

    private String nome;
    private float gols;
    private float jogos;
    private float assistencias;
    private float media;

    public Jogador(String nome, float jogos, float gols, float assistencias){
        this.assistencias = assistencias;
        this.nome = nome;
        this.gols = gols;
        this.jogos = jogos;
        this.media = this.jogos / (this.gols + this.assistencias);
    }

    public float mediaGols(){
        return this.jogos / this.gols;
    }

    public float mediaAss(){
        float media = this.jogos / this.assistencias;
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getGols() {
        return gols;
    }

    public void setGols(float gols) {
        this.gols = gols;
    }

    public float getJogos() {
        return jogos;
    }

    public void setJogos(float jogos) {
        this.jogos = jogos;
    }

    public float getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(float assistencias) {
        this.assistencias = assistencias;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}

class Main {
    public static void main(String[] args){
        Jogador jogador = new Jogador("Jhonatan", 15, 15, 10);

        float assistencia = jogador.getAssistencias();

        System.out.println(jogador.getMedia());
        System.out.println(jogador.mediaAss());
        System.out.println(jogador.mediaGols());

    }
}

