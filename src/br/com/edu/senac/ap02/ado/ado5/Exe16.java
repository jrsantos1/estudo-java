package br.com.edu.senac.ap02.ado.ado5;

import java.util.Scanner;

public class Exe16 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o tamanho da frequencia");
        int tamanho = sc.nextInt();
        int[] vetor = gerarVetorFi(tamanho);
        exibir(vetor);
    }
    private static void exibir(int[] vetor) {
        for (int i = vetor.length - 1; i >= 0 ; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
    private static int[] gerarVetorFi(int tamanho) {
        int[] vetor = new int[tamanho];
        int atual = 1;
        int anterior = 0;
        int aux = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                vetor[i] = atual;
            }else {
                aux = atual;
                atual += anterior;
                anterior = aux;
                vetor[i] = atual;
            }
        }
        return vetor;
    }
}
