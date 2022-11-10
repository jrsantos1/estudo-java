package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Scanner;

public class Exe02 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite os valores das notas");
        int[] arrayNotas = gerarVetorNotas();
        gerarResposta(arrayNotas);
    }
    private static void gerarResposta(int[] arrayNotas) {
        int soma = 0;
        int menorNota = 0;
        int maiorNota = 0;
        int media = 0;

        int valorAnterior = 0;
        int valorAtual = 0;
        for (int i = 0; i < arrayNotas.length; i++) {
            soma+=arrayNotas[i];
            valorAnterior = valorAtual;
            valorAtual = arrayNotas[i];
            if (valorAtual > valorAnterior){
                maiorNota = valorAtual;
            }else if(valorAtual < valorAnterior){
                menorNota = valorAtual;
            }
        }

        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A média das notas é: " + (soma / 5));
    }

    private static int[] gerarVetorNotas() {
        int[] notas = new int[5];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
        }
        return notas;
    }
}
