package br.com.edu.senac.poo.aula1;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


        boolean valida = true;
        while (valida){
        System.out.println("Digite um número entre 0 e 10");
        float opcaoUsuario = sc.nextFloat();


        if (opcaoUsuario > 10 || opcaoUsuario < 0.0){
            System.out.println("Valor inválido");
        }else {
            System.out.println("Opção correta. Fim.");
            valida = false;
        }
        }


    }
}
