package br.com.edu.aulas.ap02.ado2;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamho da linha");
        int quantidadeLinhas = sc.nextInt();

        try {
            getLinha(quantidadeLinhas);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("ERRO");
            //System.out.println(e.getMessage());
            System.out.println(erro);
        }
    }
    private static void getLinha(int quantidadeLinhas) {
        if(quantidadeLinhas < 0){
            throw new ArithmeticException();
        }
        for (int i = quantidadeLinhas; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int g = quantidadeLinhas; g >= i; g--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
