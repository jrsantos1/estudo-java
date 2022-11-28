package br.com.edu.senac.ap01.ados.Ados;

import java.util.Scanner;

public class Exe10 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o numero 01: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o numero 02: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o numero 03: ");
        int num3 = sc.nextInt();
        System.out.println("Digite o numero 04: ");
        int num4 = sc.nextInt();
        System.out.println("Digite o numero 05: ");
        int num5 = sc.nextInt();

        int[] numeros = {num1,num2,num3,num4,num5};

        int contador = 0;
        int acumulador = 0;
        while (contador < numeros.length){

            acumulador += numeros[contador];

            contador++;
        }
        System.out.println("O resultado final é: " + acumulador);

    }
    }

