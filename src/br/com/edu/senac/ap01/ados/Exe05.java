package br.com.edu.senac.ap01.ados;

import java.util.Scanner;

public class Exe05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entre com o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.print("Entre com o segundo valor: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " é maior do que " + num2);
        }else if(!(num1 > num2)){
            System.out.println(num2 + " é maior do que " + num1);
        }else{
            System.out.println("Os números são iguais");
        }

        }

    }

