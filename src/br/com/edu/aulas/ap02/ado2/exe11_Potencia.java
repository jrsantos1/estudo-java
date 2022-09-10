package br.com.edu.aulas.ap02.ado2;

import java.util.Scanner;

public class exe11_Potencia {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int resultado = 0;
        int resultadoRecursao = 0;


        System.out.println("Digite o número base");
        int base = sc.nextInt();

        System.out.println("Digite o número expoente");
        int expoente = sc.nextInt();


        try {
            resultado = funcao(base, expoente);
            resultadoRecursao = funcaoRecursao(base, expoente);

        }catch (Exception e){
           String erro =  e.getMessage();
            System.out.println(erro);
        }

        System.out.println("O resultado de repetição é: " + resultado);
        System.out.println("O resultado de repetição com recursão é: " + resultadoRecursao);
    }
    private static int funcao(int base, int expoente) {
        int retorno = base;

        for (int i = 1; i < expoente; i++) {
            retorno = retorno * base;
        }
        return retorno;

    }
    private static int funcaoRecursao(int base, int expoente) {
        if (expoente == 0){
            return 1;
        }
        return  base * funcaoRecursao(base, expoente - 1);
    }
}
