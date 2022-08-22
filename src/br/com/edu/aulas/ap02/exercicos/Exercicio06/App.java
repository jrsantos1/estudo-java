package br.com.edu.aulas.ap02.exercicos.Exercicio06;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        float valorDaCompra = sc.nextFloat();

        System.out.println("Digite o número de parcelas: ");
        int numeroDeParcelas = sc.nextInt();

        if(validaValor(numeroDeParcelas) && validaValor(numeroDeParcelas)){
            System.out.println("Valor final a pagar: " + valorDaCompra + ". Quantidade de parcelas: " + numeroDeParcelas + ". Valor mensalidade: " + (valorDaCompra / numeroDeParcelas));
        }
    }
    private static boolean validaValor(float valorDaCompra) {
        if (valorDaCompra < 1){
            return false;
        }
        return true;
    }
}
