package br.com.edu.aulas.ap02.ado2;

import java.util.Scanner;

public class exe07_RecursaoFatorial {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o número para receber seu fatorial");
        int num = sc.nextInt();
        int resultado = somatorio(num);
        System.out.println("O fatorial é: " + resultado);
    }
    private static int somatorio(int num) {
        if (num < 1) {
            return 1;
        }
        return num * somatorio(num - 1);
    }
}
