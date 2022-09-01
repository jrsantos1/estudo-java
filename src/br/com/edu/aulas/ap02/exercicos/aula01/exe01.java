package br.com.edu.aulas.ap02.exercicos.aula01;

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da linha");
        int tamanhoDaLinha = sc.nextInt();

        try {
            getLinha(tamanhoDaLinha);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("ERRO");
            System.out.println(erro);
        }
    }
    private static void getLinha(int num) {

//        if(num < 0){
//            throw new ArithmeticException();
//        }
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }

    }
}
