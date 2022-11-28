package br.com.edu.senac.ap02.ado.ado3;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputUsuario = 0;
        System.out.print("Digite a quantidade de pontos: ");
        try {
            inputUsuario = sc.nextInt();
            formarTriangulo(inputUsuario);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("Ocorreu um erro na execução do programa: " + erro);
        }
    }
    private static void formarTriangulo(int inputUsuario) {

        for (int i = 0; i <= inputUsuario; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
