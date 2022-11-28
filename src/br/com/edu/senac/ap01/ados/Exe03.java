package br.com.edu.senac.ap01.ados.Ados;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exe03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        System.out.print("Entre com o valor da variavel 01: ");
        num1 = sc.nextInt() + 5;
        System.out.print("Entre com o valor da variavel 02: ");
        num2 = sc.nextInt() + 5;
        System.out.print("Entre com o valor da variavel 03: ");
        num3 = sc.nextInt() + 5;
        System.out.print("Entre com o valor da variavel 04: ");
        num4 = sc.nextInt() +5;

        List<Integer> list = Arrays.asList(num1,num2,num3,num4);

        list.stream().forEach(n -> System.out.println("O valor final somado com 5 é: " + n));

    }
}
