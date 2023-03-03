package br.com.edu.topicos.entrutura_de_dados.dinamica.fila;

public class Main {
    public static void main(String[] args) {
        Fila<String> filaBanco = new Fila<>();

        // adicionando pessoas a fila
        filaBanco.enqueue("Jhonatan");
        filaBanco.enqueue("Vanessa");
        filaBanco.enqueue("Jefferson");
        filaBanco.enqueue("JacksonFives");

        // removendo pessoas da fila

        filaBanco.dequeue();
        filaBanco.dequeue();

        // exibindo primeiro da fila
        String primeiroElemento = filaBanco.first();
        System.out.println(primeiroElemento);

        // verificando se a fila está vazia

        System.out.println(filaBanco.isEmpty());


        // exibindo elementos da fila

        System.out.println(filaBanco);


    }
}
