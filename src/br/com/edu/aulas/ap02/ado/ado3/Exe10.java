package br.com.edu.aulas.ap02.ado.ado3;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputUsuario = 0;
        System.out.print("Digite a quantidade de linhas: ");
        try {
            inputUsuario = sc.nextInt();
            fibonac(inputUsuario);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("Ocorreu um erro na execução do programa: " + erro);
        }
    }
    private static void fibonac(int inputUsuario) {
        int num1 = 1;
        int num2 = 1;
        int resultado = 0;

        for (int i = 0; i < inputUsuario - 2; i++) {
            resultado = num1 + num2;
            num1 = num2;
            num2 = resultado;
        }
        System.out.println("O número de fibonacci na posição " + inputUsuario + " é: " + resultado);
    }
}
