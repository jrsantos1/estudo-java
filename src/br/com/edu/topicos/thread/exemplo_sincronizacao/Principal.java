package br.com.edu.topicos.thread.exemplo_sincronizacao;

public class Principal {
    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();

        // passando a tarefa e nome da thread
        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");

        convidado1.start();
        convidado2.start();

    }
}
