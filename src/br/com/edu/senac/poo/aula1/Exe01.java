package br.com.edu.senac.poo.aula1;

import java.util.Scanner;

public class Exe01 {

    public static void main(String[] args) {

        int periodo = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto será investido por mês?");
        float valorInvestidoMes = sc.nextFloat();


        System.out.println("Qual será o valor da taxa?");
        float valorTaxa = sc.nextFloat() / 100;

        float vlFinal = calculaInvestimento(valorInvestidoMes,valorInvestidoMes, valorTaxa, periodo);

        System.out.println("O valor final é:  " + vlFinal);
        boolean valida = true;

        while (valida){

            System.out.println("Deseja investir por mais um ano :) ? \n 1. Para sim. \n 2. Para não.");
            int opcaoUsuario = sc.nextInt();

            if (opcaoUsuario == 1){

                System.out.println("Qual o valor investido por mês?");
                float vlMes = sc.nextFloat();
                vlFinal = calculaInvestimento(vlMes, vlFinal, valorTaxa, periodo);
                System.out.println("o valor gerado é: " + vlFinal);
            }else{
                valida = false;
            }
        }
    }
    public static float calculaInvestimento(float valorInvestidoMes,float valorInicial, float valorTaxa, int periodo){
        float vlAtual = valorInicial;
        for (int i = 0; i < periodo; i++){
            if (i == 11){
                continue;
            }
            vlAtual += valorInvestidoMes + (vlAtual * valorTaxa);
        }

        return vlAtual;
    }
}
