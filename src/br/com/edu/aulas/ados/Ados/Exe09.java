package br.com.edu.aulas.ados.Ados;

import java.util.Scanner;

public class Exe09 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informar o salário bruto: ");
        double salarioBRuto = sc.nextDouble();

        System.out.println("Informar valor da prestação: ");
        double valorDaPrestacao = sc.nextDouble();

        if(valorDaPrestacao > (salarioBRuto * 0.3))
            System.out.println("O emprestimo não pode ser concedido");
        else{
            System.out.println("O emprestimo pode ser concedido");
        }
    }


    }

