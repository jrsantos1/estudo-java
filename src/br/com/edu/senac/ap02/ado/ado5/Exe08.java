package br.com.edu.senac.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Exe08{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int[] primeiroVetor = gerarVetor();
        System.out.println(Arrays.toString(primeiroVetor));
        System.out.println("Usuário, digite os valores do vetor");
        int[] segundoVetor = gerarSegundoVetor();
        System.out.println(Arrays.toString(segundoVetor));
        gerarVetorIntersecao(primeiroVetor, segundoVetor);
    }
    public static void gerarVetorIntersecao(int[] primeiroVetor, int[] segundoVetor){

        int[] aux = new int[primeiroVetor.length + segundoVetor.length];
        int k = 0;
        for (int i = 0; i < primeiroVetor.length; i++){
            for (int j = 0; j < segundoVetor.length; j++){
                if (primeiroVetor[i] == segundoVetor[j]){
                    aux[k++] = primeiroVetor[i];
                }
            }
        }
        int[] c = new int[k];
        System.out.println("Vetor com intersecção");
        for(int i = 0; i < c.length; i++){
            c[i] = aux[i];
            System.out.print(c[i] + " ");
        }
    }
    public static int[] gerarSegundoVetor(){
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }
    public static int[] gerarVetor(){
        int[] vetor = new int[10];
        for(int i = 0; i < vetor.length; i++){
            Random rdn = new Random();
            int a = rdn.nextInt(99);
            vetor[i] = a;
            //System.out.println(vetor[i]);
        }
        return vetor;
    }
}