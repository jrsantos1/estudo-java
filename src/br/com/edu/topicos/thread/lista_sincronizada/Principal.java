package br.com.edu.topicos.thread.lista_sincronizada;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        Lista lista = new Lista();

        for (int i = 0; i < 10; i++){
            Thread thread = new Thread(new TarefaAdicionaElemento(lista, i));
            thread.start();
        }

        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(i + " - " + lista.pegaElemento(i));
        }

    }
}
