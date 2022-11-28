package br.com.edu.senac.ap01.ados.Ados;

import java.util.Scanner;

public class Exe04 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entre com um número diferente de 256: ");

        boolean teste = sc.nextInt() > 256? true: false;

        if (teste){
            System.out.println("O valor digitado é maior que 256");
        }else if(!teste){
            System.out.println("O valor é menor do que 256");
        }

    }
}
