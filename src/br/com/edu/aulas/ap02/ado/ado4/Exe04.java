package br.com.edu.aulas.ap02.ado.ado4;

import java.util.Scanner;
public class Exe04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o texto que deseja cortar: ");
            String texto = sc.nextLine();

            System.out.print("Digite o número inicial: ");
            int numInicial = sc.nextInt();

            System.out.print("Digite o número final: ");
            int numFinal = sc.nextInt();

            cortarTexto(texto, numInicial, numFinal);

        }catch (Exception e){
            System.out.println("Seu o código deu o erro, tente novamente");
            String[] teste = {};

            Exe04.main(teste);
        }
    }
    private static void cortarTexto(String texto, int numInicial, int numFinal) {

        boolean validar = verificarNumero(texto.length(), numInicial ,numFinal);

        if(validar){
            for (int i = numInicial; i <= numFinal; i++) {
                System.out.print(texto.charAt(i));
            }
        }else {
            throw new IllegalArgumentException("O intervalo de caracteres não pode ser menor que o texto");
        }
    }
    private static boolean verificarNumero(int length, int numInicial, int numFinal) {
        if (length < numFinal - numInicial){
            return false;
        }else{
            return true;
        }
    }

}
