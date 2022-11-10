package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite os valores do vetor");
        int[] vetorGerado = gerarVetorUsuario();
    }

    private static int[] gerarVetorUsuario() {
        int[] vetorASerGerado = new int[5];
        for (int i = 0; i < vetorASerGerado.length; i++) {
            vetorASerGerado[i] = sc.nextInt();
        }
        for (int i = 0; i < vetorASerGerado.length; i++) {
            int aux = 0;
            for (int j = 0; j < vetorASerGerado.length; j++) {
                if(vetorASerGerado[i] < vetorASerGerado[j]){
                    aux = vetorASerGerado[j];
                    vetorASerGerado[j] = vetorASerGerado[i];
                    vetorASerGerado[i] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vetorASerGerado));
        return vetorASerGerado;
    }
}
