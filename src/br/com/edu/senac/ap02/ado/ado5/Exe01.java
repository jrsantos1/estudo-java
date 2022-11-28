package br.com.edu.senac.ap02.ado.ado5;

import java.util.Scanner;

public class Exe01 {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.print("Digite o número inicial: ");
        int numeroInicial = sc.nextInt();

        System.out.print("Digite o numero final: ");
        int numeroFinal = sc.nextInt();

        int[] sequencia = criarSequencia(numeroInicial, numeroFinal);

        exibir(sequencia);
    }
    private static void exibir(int[] sequencia) {

        for (int i = 0; i < sequencia.length; i++) {
            System.out.print(sequencia[i] + ", ");
        }
    }
    private static int[] criarSequencia(int numeroInicial, int numeroFinal) {

        int tamanho = numeroFinal - numeroInicial + 1;
        int indice = 0;

        int[] novoVetor = new int[tamanho];

        for (int i = numeroInicial; i <= numeroFinal; i++) {

            novoVetor[indice] =  i;

            indice++;
        }
        return novoVetor;
    }
}
