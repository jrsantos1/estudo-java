package br.com.edu.senac.ap01.ados;

import java.util.Scanner;

public class Exe07 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite um número para verificar se é divisível por 5, 10 ou 2");

        int verificaSeEDivisivel = sc.nextInt();

        if (verificaSeEDivisivel % 5 == 0) {
            System.out.println("É divisível por 5");
        } else if (verificaSeEDivisivel % 2 == 0) {
            System.out.println("É divisível por 2");
        } else if (verificaSeEDivisivel % 10 == 0) {
            System.out.println("É divisível por 10");
        } else {
            System.out.println("É divisível por nenhum");
        }

    }


    }

