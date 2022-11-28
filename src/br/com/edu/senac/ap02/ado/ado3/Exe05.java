package br.com.edu.senac.ap02.ado.ado3;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputUsuarioTexto = "";
        String inputUsuarioLetra = "";
        System.out.print("Digite o texto para verificar: ");
        try {
            inputUsuarioTexto = sc.next();
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("Ocorreu um erro na execução do programa: " + erro);
        }

        System.out.print("Digite o letra para verificar quantidade de vezes que aparece no texto: ");
        try {
            inputUsuarioLetra = sc.next();
            formarTriangulo(inputUsuarioTexto, inputUsuarioLetra);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("Ocorreu um erro na execução do programa: " + erro);
        }

    }
    private static void formarTriangulo(String inputUsuarioTexto,String inputUsuarioLetra) {

        int cont = 0;
        for (int i = 0; i < inputUsuarioTexto.length(); i++) {
            String texto = String.valueOf(inputUsuarioTexto.charAt(i));
            if(texto.equalsIgnoreCase(inputUsuarioLetra)){
                cont += 1;
            }
        }
        System.out.println("A letra digitada aparece " + cont + " vez(es)");

    }
}
