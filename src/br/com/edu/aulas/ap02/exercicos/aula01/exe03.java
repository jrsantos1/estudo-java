package br.com.edu.aulas.ap02.exercicos.aula01;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas");
        int quantidadeDeLinhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas");
        int quantidadeDeColunas = sc.nextInt();

        try {
            getLinha(quantidadeDeLinhas, quantidadeDeColunas);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("ERRO");
            System.out.println(erro);
        }
    }
    private static void getLinha(int linhas, int colunas) {

        if(linhas < 0 || colunas < 0){
            throw new ArithmeticException();
        }

        for (int i = 0; i < linhas; i++) {
            for (int y = 0; y < colunas; y++) {
                System.out.print("* ");
            }
            System.out.println("");
        }




    }
}
