package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe20 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o tamanho do vetor desejado");
        int tamanhoVetor = sc.nextInt();
        System.out.println("Digite os valores do vetor: ");
        int[] vetorUsuario = gerarVetorUsuario(tamanhoVetor);
        int[] vetorFinal = gerarUltimoVetor(vetorUsuario);
    }
    private static int[] gerarUltimoVetor(int[] vetorUsuario) {
        int numeroAtual = 0;
        int numeroAnterior = 0;
        int[] vetorAux = new int[vetorUsuario.length];
        int contador = 0;
        int posicaoInicial = 0;
        int posicaoFinal = 0;

        for (int i = 0; i < vetorUsuario.length; i++) {
            int contadorAtual = 0;
            for (int j = i; j < vetorUsuario.length; j++) {
                if (j == i) {
                    numeroAtual = vetorUsuario[j];
                    continue;
                }
                numeroAnterior = numeroAtual;
                numeroAtual = vetorUsuario[j];

                if (j + 1 == vetorUsuario.length && numeroAnterior + 1 == numeroAtual){
                    contadorAtual++;
                    if (contadorAtual > contador){
                        posicaoInicial = i;
                        posicaoFinal = j + 1;
                        contador = contadorAtual;
                    }
                    break;
                }
                if (numeroAnterior + 1 == numeroAtual){
                    contadorAtual++;
                    if (contadorAtual > contador){
                        posicaoInicial = i;
                        posicaoFinal = j;
                        contador = contadorAtual;
                    }
                }
                else{
                    break;
                }
            }
        }
        int[] vetorFinal = new int[posicaoFinal - posicaoInicial];
        int posicao = 0;

        for (int i = posicaoInicial; i <= posicaoFinal - 1; i++) {
            vetorFinal[posicao++] = vetorUsuario[i];
        }
        System.out.println(Arrays.toString(vetorFinal));
        return vetorFinal;
    }
    private static int[] gerarVetorUsuario(int tamanhoVetor) {
        int[] novoVetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            novoVetor[i] = sc.nextInt();
        }
        return novoVetor;
    }
}
