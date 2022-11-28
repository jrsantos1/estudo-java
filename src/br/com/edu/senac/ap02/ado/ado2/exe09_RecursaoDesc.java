package br.com.edu.senac.ap02.ado.ado2;

import java.util.Scanner;

public class exe09_RecursaoDesc {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o número para realizar a somatório");
        int num = sc.nextInt();
        int resultado = somatorio(num);
        //System.out.println("O resultado deu: " + resultado);
    }
    private static int somatorio(int num) {

        if (num <= 0) {
            return 0;
        }
        System.out.println(num);
        return num - somatorio(num - 1);
    }
}
