package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe17 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o tamanho da frequencia:");
        int tamanho = sc.nextInt();
        int[] vetor = gerarVetorFi(tamanho);
        System.out.println(Arrays.toString(vetor));
    }
    private static int[] gerarVetorFi(int tamanho) {
        int[] vetor = new int[tamanho];

        int contador = 2;

        for (int i = 0; i < vetor.length; i++) {
            if (contador == 2){
                vetor[i] = contador;
                contador++;
                continue;
            }
            boolean valida = true;
            while (valida){
                boolean ehPrimo = false;
                for (int j = 2; j < contador; j++) {
                    if (contador % j == 0){
                        ehPrimo = false;
                        break;
                    }else {ehPrimo = true;}
                }
                if (ehPrimo == true){
                    vetor[i] = contador;
                    valida = false;
                }
                contador++;
            }
        }
        return vetor;

    }
}
