package br.com.edu.aulas.ap02.ado.ado6;

import java.util.Scanner;

public class Exe03 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        escrever("Digite os números do vetor");
        int[] vetor = gerarVetor();
        int[] vetorSemRep = gerarVetorSemRep(vetor);
        exibirVetor(vetorSemRep);
    }
    private static void exibirVetor(int[] vetorSemRep) {
        for (int i = 0; i < vetorSemRep.length; i++) {
            System.out.print(vetorSemRep[i] + " ");
        }// grupo da canoa
    }
    private static int[] gerarVetorSemRep(int[] vetor) {
        int[] novo = new int[0];
        for (int i = 0; i < vetor.length; i++) {
            if(!existe(vetor[i], novo)){
                novo = adicionar(novo, vetor[i]);
            }
        }
        return novo;
    }
    private static int[] adicionar(int[] novo, int i) {
        int vetor[] =  new int[novo.length + 1];
        for (int j = 0; j < novo.length; j++) {
            vetor[j] = novo[j];
        }
        vetor[vetor.length - 1] = i;
        return vetor;
    }
    private static boolean existe(int i, int[] vetor) {
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == i){
                return true;
            }
        }return false;
    }
    private static int[] gerarVetor() {
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }
    private static void escrever(String msg) {
        System.out.println(msg);
    }
}
