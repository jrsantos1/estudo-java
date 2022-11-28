package br.com.edu.senac.ap02.ado.ado3;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputUsuario = 0;
        System.out.print("Digite a quantidade de linhas: ");
        try {
            inputUsuario = sc.nextInt();
            formarTriangulo(inputUsuario);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("Ocorreu um erro na execução do programa: " + erro);
        }
    }
    private static void formarTriangulo(int inputUsuario) {
        int j;
        int cont = 0;
        for (int i = 0; i < inputUsuario; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(++cont);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
