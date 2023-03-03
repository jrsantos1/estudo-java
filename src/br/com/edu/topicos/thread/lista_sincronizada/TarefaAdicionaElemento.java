package br.com.edu.topicos.thread.lista_sincronizada;

public class TarefaAdicionaElemento implements Runnable {

    private Lista lista;
    private int numeroDoThread;

    public TarefaAdicionaElemento(Lista lista, int indice) {
        this.lista = lista;
        this.numeroDoThread = indice;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            lista.adicionaElementos("Thread: " + numeroDoThread +  " - " + i);
        }
    }

}
