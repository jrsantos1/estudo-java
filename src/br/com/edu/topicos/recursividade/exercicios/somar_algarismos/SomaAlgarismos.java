package br.com.edu.topicos.recursividade.exercicios.somar_algarismos;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class SomaAlgarismos {
    Scanner sc = new Scanner(System.in);
    public void run(){
        escrever("Entre com o número desejado");
        int num = processarNumero();
        int somaAlg = somaAlgarismos(String.valueOf(num), String.valueOf(num).length());

    }

    private int somaAlgarismos(String num, int size) {
        if (size == 0){
            return 0;
        }
        return Integer.parseInt(String.valueOf(num.charAt(size - 1))) + somaAlgarismos(num, size - 1);

    }
    private int processarNumero() {
        int numero = 0;
       try {
           numero = sc.nextInt();
       }catch (Exception e){
           System.out.println( "Erro inesperado, tente novamente" + e.getMessage());
           run();
       }
       return numero;
    }

    public void escrever(String text){
        System.out.println(text);
    }
}

