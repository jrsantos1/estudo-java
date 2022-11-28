package br.com.edu.senac.ap02.ado.ado1.exercicio07;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em dolar: ");
        double valorEmReais = sc.nextDouble();

        double resultado = converter(valorEmReais);

        System.out.print(" O valor convertido em reais é: " + resultado);
    }
    public static double converter(double valorEmRDolares){
        final double cotaDolarReal = 5.17;
        return  Math.round(valorEmRDolares * cotaDolarReal);
    }

}
