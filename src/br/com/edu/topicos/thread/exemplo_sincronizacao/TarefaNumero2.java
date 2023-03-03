package br.com.edu.topicos.thread.exemplo_sincronizacao;

public class TarefaNumero2 implements Runnable {

    private Banheiro banheiro;
    public TarefaNumero2(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run(){
        this.banheiro.fazNumero2();
    }

}
