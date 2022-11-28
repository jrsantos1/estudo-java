package br.com.edu.senac.ap02.ado.ado6;

import java.util.Scanner;

public class Apagar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        gerarVetorTeste(tamanho);
    }
    private static void gerarVetorTeste(int tamanho) {
        int[] vetor = new int[tamanho];
        int valorAtual = 1;
        int valorAnterior = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = valorAnterior + valorAtual;
            valorAnterior = valorAtual;
            valorAtual = vetor[i];
        }
    }
}
