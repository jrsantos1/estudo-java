package br.com.edu.senac.ap02.exercicos.aula02;

import java.util.Scanner;

public class Losango {
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

        for (int i = 1; i > quantidadeLinhas ; i++) {

            for (int j = quantidadeLinhas; j < i; j--) {
                int metade = i / 2;
                System.out.println("A metade é " + metade);
                if (metade == j){
                    System.out.println("*");
                }else{
                    System.out.println("   ");
                }
            }
        }
}}
