package br.com.edu.topicos.recursividade.exercicios;

import java.util.Scanner;

public class Expoente {
    public static void main(String[] args) {
        boolean certo = false ;

        while (!certo) {
            try {
                Scanner sc = new Scanner (System.in);

                System.out.println("Digite um valor ");
                float b  = sc.nextFloat();

                System.out.println("Digite o Expoente");
                float e = sc.nextFloat();

                Potencia (b,e);
                System.out.print(b + " elevado a " + e + " é " + Potencia  (b, e));

                sc.close();
                certo = true ;
            } catch (Exception e){

                System.out.println(e.getMessage());

            }
        }

    }

    public static float Potencia (float b, float  e) {
        if (e == 0 ) {
            return 1 ;

        } else if (e < 0 ) {
            return Potencia (b  , e + 1) / b ;
        }
        return Potencia (b , e - 1 ) * b ;
    }
}
