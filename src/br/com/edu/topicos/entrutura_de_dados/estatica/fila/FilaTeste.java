package br.com.edu.topicos.entrutura_de_dados.estatica.fila;

public class FilaTeste {
    public static void main(String[] args) {

        FilaEstatica<String> filaEstatica = new FilaEstatica<>();

        filaEstatica.enqueue("Matheuzao da Massa");
        filaEstatica.enqueue("Murilao da Massa");

        // pegar primeiro valor

        System.out.println(filaEstatica.peak());



        // desenfileirar
        filaEstatica.dequeue();
        filaEstatica.dequeue();

        //System.out.println(filaEstatica.peak());

        // verificar se está vazio

        System.out.println(filaEstatica.isEmpty());

        // verificar tamanho da lista
        System.out.println(filaEstatica.lenght());


        // printar elementos da fila estática

        System.out.println(filaEstatica);

        filaEstatica.enqueue("Jhonatan Ribeiro");
        System.out.println(filaEstatica.peak());



    }
}
