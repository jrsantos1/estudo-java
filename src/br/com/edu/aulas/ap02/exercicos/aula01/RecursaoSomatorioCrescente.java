package br.com.edu.aulas.ap02.exercicos.aula01;

import java.util.Scanner;

public class RecursaoSomatorioCrescente {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o número para realizar a somatório");
        int num = sc.nextInt();
        int resultado = somatorio(num);
        System.out.println("O resultado deu: " + resultado);
    }
    private static int somatorio(int num) {
        if (num > 10) {
            return 0;
        }
        return num + somatorio(num + 1);


    }


}
