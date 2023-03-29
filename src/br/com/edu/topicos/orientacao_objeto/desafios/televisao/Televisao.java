package br.com.edu.topicos.orientacao_objeto.desafios.televisao;

public class Televisao {
   

        private int volume = 0;
        private int canalAtual = 0;

    public Televisao() {
        this.volume = 0;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int i){
        if ((this.volume + i) < 0)
        this.volume = 0;

    this.volume += i;
    }

    public int getCanalAtual(){
        return this.canalAtual;
    }

    public void setCanalAtual(int i){
        if ((this.canalAtual + i) < 0)
            this.canalAtual = 0;

        this.canalAtual += i;
    }
}