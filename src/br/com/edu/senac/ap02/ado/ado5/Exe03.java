package br.com.edu.senac.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe03 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Informe o valor desejado: ");
        int inputUsuario = sc.nextInt();
        int[] tabuada = gerarTabuado(inputUsuario);

        System.out.println("A tabuada do " + inputUsuario + " é: ");
        System.out.println(Arrays.toString(tabuada));

    }

    private static int[] gerarTabuado(int inputUsuario) {
        int[] tabuada = new int[10];

        for (int i = 0; i < 10; i++) {
            tabuada[i] = inputUsuario * (i+1);
        }
        return tabuada;

    }
}
