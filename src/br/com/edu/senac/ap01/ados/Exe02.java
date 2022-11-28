package br.com.edu.senac.ap01.ados.Ados;

import java.util.Scanner;

public class Exe02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entre com o valor de contador: ");

        int contador = sc.nextInt();
        contador += 10;

        System.out.println("O valor de contador somado a 10 é " + contador);
    }
}
