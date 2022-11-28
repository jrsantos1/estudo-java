package br.com.edu.topicos.fundamentos;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        while(contador < 5){
            //System.out.println("Ainda é menor que 5 ");
            System.out.print("Digite 'sair' para parar o looping ");
            String entradaUsuario = sc.nextLine();
            if(entradaUsuario.equalsIgnoreCase("sair")){
                break;
            }
            System.out.println(contador);
            contador++;

        }
    }
}
