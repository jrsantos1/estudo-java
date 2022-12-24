package br.com.edu.senac.poo.aula1;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


        boolean valida = true;
        while (valida){
        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("Digite seu nome");
        String senha = sc.next();


        if (nome.toUpperCase().equals(senha.toUpperCase())){
            System.out.println("O nome não pode ser igual a senha.");
        }else {
            System.out.println("Opção correta. Fim.");
            valida = false;
        }
        }


    }
}
