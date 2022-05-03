package br.com.edu.aulas.ados.Ados;

import java.util.Scanner;

public class Exe08 {

    static Scanner sc = new Scanner(System.in);

    static int inicio;
    static int fim;

    public static void main(String[] args) {
        System.out.print("Entre com o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Entre com o segundo número: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            inicio = num2;
            fim = num1;
        }else if(!(num1 > num2)){
            inicio = num1;
            fim = num2;
        }

        for (int i = inicio; inicio <= fim; inicio++){
            String resultado = inicio % 2 == 0? "É par": "É impar";

            System.out.println(inicio + " é: " + resultado);;
        }

    }
    }

