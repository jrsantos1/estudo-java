package br.com.edu.senac.ap02.ado.ado3;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputUsuario = "";
        System.out.print("Digite o texto para modificar: ");
        try {
            inputUsuario = sc.nextLine();
            formarTriangulo(inputUsuario);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("Ocorreu um erro na execução do programa: " + erro);
        }
    }
    private static void formarTriangulo(String inputUsuario) {

        for (int i = 0; i < inputUsuario.length(); i++) {
            System.out.print(inputUsuario.charAt(i) + "-");
        }

    }
}
