package br.com.edu.aulas.ap02.ado.ado2;

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamho da linha");
        int quantidadeLinhas = sc.nextInt();

        try {
            getLinha(quantidadeLinhas);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("ERRO");
            System.out.println(erro);
        }
    }
    private static void getLinha(int quantidadeLinhas) {

        if(quantidadeLinhas < 0){
            throw new ArithmeticException();
        }
        for (int i = 0; i < quantidadeLinhas; i++) {
            for (int y = 0; y <= i; y++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
