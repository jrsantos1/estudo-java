package br.com.edu.aulas.ap02.ado.ado3;

import java.util.Scanner;

public class Exe03 {
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
        int cont = 1;
        for (int i = inputUsuario; i > 0 ; i--) {

            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < cont; k++) {
                System.out.print(cont);
                System.out.print(" ");
            }
            cont++;
            System.out.println("");
        }
    }
}
