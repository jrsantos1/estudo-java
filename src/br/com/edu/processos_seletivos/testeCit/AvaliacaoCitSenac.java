package br.com.edu.processos_seletivos.testeCit;

import java.util.Comparator;
import java.util.Vector;

public class AvaliacaoCitSenac {
    public static void main(String[] args) {

        // Declara vetor com capacidade inicial de 15 posições

        Vector<Integer> vector = new Vector<>(15);

        // Percorre o vetor adicionando número aleatórios entre 0 e 9

        for (int i = 0; i < 15; i++){
            int numeroGerado = (int) (Math.random() * 10);
            vector.add(numeroGerado);
        }

        // exibe vetor
        System.out.println(vector);

        // Declara vetor para adicionar elementos sem repetição
        Vector<Integer> vetorSemRepeticao = new Vector<>(0);
        // percorre array de duas dimensões 09x15
        for(int x =0; x < 10; x++){
            int verificador = 0;
            for (int y = 0; y < vector.size(); y++){
                if(x == vector.get(y)){
                    // o valor atual de x seja igual ao valor presente no array, é somado 1 à variavel verificador
                    verificador++;
                }
            }
            if (verificador == 1){
                // caso o valor seja igual a 01, ele é adicionado ao vetor de elementos sem repetição, caso maior, nenhuma ação é executada
                vetorSemRepeticao.add(x);
            }
        }
        // imprimi o tamanho do vetor no console
        System.out.println("Quantidade de números sem repetição é: " + vetorSemRepeticao.size());

        // criação de uma interface comparator para ordenar o vetor

        Comparator<Integer> comparador =  (n,v) -> {
            int result = n > v? 1: n < v? -1: 0;
            return result; };

        // utilizando metodo sorte que recebe o comparator para ordenar o vetor de forma crescente

        vetorSemRepeticao.sort(comparador);

        // imprimindo valores sem repetição no console

        for(int lista: vetorSemRepeticao){
            System.out.println(lista);
        }
    }
}
