package br.com.edu.senac.ap02.ado.ado4;
import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para verificar se é primo: ");

        try {
            int numero = sc.nextInt();
            verificarSeEPrimo(numero);
        }catch (Exception e){
            System.out.println("Ocorreu o erro: " + e.getMessage() + " durante a execução, tente novamente");
            Exe09.main(args);
        }
    }
    private static void verificarSeEPrimo(int numero) {

        int resultado = 0;
        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                resultado++;
            }
        }

        if (resultado == 2){
            System.out.println("O número é primo");
        }else {
            System.out.println("O número não é primo");
        }
    }
}
