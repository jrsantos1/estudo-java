package br.com.edu.senac.ap02.ado.ado2;

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

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }

    }
}
