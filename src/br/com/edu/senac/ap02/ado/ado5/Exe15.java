package br.com.edu.senac.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe15 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o tamanho do vetor");
        int tamanhoVetor = sc.nextInt();
        int[] vetorUsuario = gerarVetor(tamanhoVetor);
        System.out.println(Arrays.toString(vetorUsuario));
    }
    public static int[] gerarVetor(int tamanhoVetor){
        int[] novoVetor = new int[tamanhoVetor];
        // alimentar vetor
        for (int i = 0; i < novoVetor.length; i++) {
            novoVetor[i] = sc.nextInt();
        }
        // ordenar de forma crescente
        int aux = 0;
        for (int i = 0; i < novoVetor.length; i++) {
            for (int j = 0; j < novoVetor.length; j++) {
                if (novoVetor[j] > novoVetor[i] && i != j) {
                    aux = novoVetor[i];
                    novoVetor[i] = novoVetor[j];
                    novoVetor[j] = aux;
                }
            }
        }
        return novoVetor;
    }
}
