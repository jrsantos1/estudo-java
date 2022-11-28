package br.com.edu.senac.ap02.ado.ado3;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputUsuario = "";
        System.out.print("Digite o texto para modificar: ");
        try {
            inputUsuario = sc.next();
            formarTriangulo(inputUsuario);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("Ocorreu um erro na execução do programa: " + erro);
        }
    }
    private static void formarTriangulo(String inputUsuario) {

        String textoInicial = "";
        for (int i = inputUsuario.length() - 1; i >= 0; i--) {
            System.out.print(inputUsuario.charAt(i));
            textoInicial += String.valueOf(inputUsuario.charAt(i));
        }

        System.out.println("");

        if(textoInicial.equalsIgnoreCase(inputUsuario)){
            System.out.println("é um palíndromo");
        }else {
            System.out.println("Não é um palíndromo");
        }
    }
}
