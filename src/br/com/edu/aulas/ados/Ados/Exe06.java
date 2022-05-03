package br.com.edu.aulas.ados.Ados;

import java.util.Scanner;

public class Exe06 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entre com um valor: ");
        int num1 = sc.nextInt();

        if(num1 <= 90 && num1 >= 20 ){
            System.out.println("O valor digitado está compreendido entre 20 e 90");
        }else{
            System.out.println("O valor digitado não está compreendido entre 20 e 90");
        }

        }

    }

