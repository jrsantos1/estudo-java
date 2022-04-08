package br.com.edu.aulas.jdbc;
import java.util.Scanner;
public class Opcoes {

    public int exibir() {
        //int numero = 2;
        System.out.println("\n");
        System.out.println("1. Jogar");
        System.out.println("2. Criar novo usuário");
        System.out.println("3. Atualizar Usuario");
        System.out.println("4. Apagar usuário");
        System.out.println("5. Acessar Ranking");
        System.out.println("\n");
        System.out.print("Digite a opção desejada: ");

        // digita a opção desejada

        Scanner sc = new Scanner(System.in);

        Boolean condicao = true;

        int valorDigitado = 0;

        // testa se o valor digitado esta correto
        boolean ehValido = true;

        while (ehValido) {

            valorDigitado = sc.nextInt();

            ehValido = verificaSeValido(valorDigitado);

        }
        return valorDigitado;
    }

    public static boolean verificaSeValido (int valorDigitado){
        if(valorDigitado>5 || valorDigitado<1){
            System.out.println("o valor digitado está incorreto");
            return true;
        }else{
            return false;
        }
    }
}
