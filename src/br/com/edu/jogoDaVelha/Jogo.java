package br.com.edu.jogoDaVelha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogo {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            mostrarMenu();
        }catch (InputMismatchException e){
            throw new RuntimeException("Valor digitado é inválido");
        }
        }

    private static int mostrarMenu() {

        System.out.print("Digite um texto: ");
        int valor = sc.nextInt();
        return valor;
    }

}
