package br.com.edu.aulas.ap02.ado.ado4;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o texto que deseja cortar: ");
            String texto = sc.nextLine();

            System.out.print("Digite o caractere que deseja encontrar: ");
            String textProcurado = sc.next();

            System.out.print("Digite o número final: ");
            int posicaoInicial = sc.nextInt();

            procurarTexto(texto, textProcurado, posicaoInicial);

        }catch (Exception e){
            System.out.println("Seu o código deu o erro, tente novamente");
            String[] teste = {};

            Exe05.main(teste);
        }
    }
    private static void procurarTexto(String texto, String textoProcurado, int posicaoInicial) {

            for (int i = posicaoInicial; i <= texto.length(); i++) {
                String texto_string = String.valueOf(texto.charAt(i));
                if(texto_string.equalsIgnoreCase(textoProcurado)){
                    System.out.println(String.format("A posição de " + textoProcurado +" em "+ texto +" procurando a partir da posição "+ texto +" é: " + i));
                    break;
                }
            }
    }


}
