package br.com.edu.aulas.ap02.ado.ado3;

import java.util.Dictionary;
import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputUsuario = "";
        System.out.print("Digite a senha: ");
        try {
            inputUsuario = sc.next();
            run(inputUsuario);
        }catch (Exception e){
            String erro = e.getMessage();
            System.out.println("Ocorreu um erro na execução do programa: " + erro);
        }
    }
    private static void run(String inputUsuario) {
        int qtdEspacial = 0;
        int qtdDigitos = 0;
        int qtdSenha = inputUsuario.length();
        String senha = "";

        for (int i = 0; i < inputUsuario.length(); i++) {
            if(!Character.isDigit(inputUsuario.charAt(i)) && !Character.isLetter(inputUsuario.charAt(i))){
                qtdEspacial++;
            }
            if(Character.isDigit(inputUsuario.charAt(i))){
                qtdDigitos++;
            }
            senha += String.valueOf(inputUsuario.charAt(i));
        }
        if (qtdEspacial < 2 || qtdDigitos < 2 || qtdSenha < 8){
            System.out.println("Senha fraca");
        }else {
            System.out.println("Senha Forte");
        }


    }
}
