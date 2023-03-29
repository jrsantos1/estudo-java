package br.com.edu.topicos.orientacao_objeto.desafios.primo;

import java.util.Scanner;

public class ExPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int numeroDigitado = sc.nextInt();

        if (ehPrimo(numeroDigitado)){
            System.out.println("É primo");
        }else{
            System.out.println("Não é primo");
        }

    }

    public static boolean ehPrimo(int numeroDigitado){

        for (int i = numeroDigitado; i > 0; i--) {
            
            if (numeroDigitado % i == 0 ){
                if (numeroDigitado != 1 &&  i != numeroDigitado){
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;

    }
}
    
