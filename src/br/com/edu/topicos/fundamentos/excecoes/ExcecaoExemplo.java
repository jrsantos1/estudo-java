package br.com.edu.topicos.fundamentos.excecoes;

import java.util.Scanner;

public class ExcecaoExemplo {

   static int numeroDeTentativas = 0;

    public static void run() {
        int[] numeros = new int[3];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do index que seja acessar");
        int entradaUsuario = sc.nextInt();

        if (entradaUsuario != 3)
            throw new ArithmeticException("Acesso negado");

        try {
            System.out.println(numeros[entradaUsuario]);
        }catch (Exception e){
            System.out.println(e.getMessage());
            run();
        }finally {
            numeroDeTentativas++;
        }
        {
            System.out.println("O número de tentativas é de: " + numeroDeTentativas);
        }
    }
}
