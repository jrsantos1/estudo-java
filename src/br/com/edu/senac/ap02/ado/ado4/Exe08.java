package br.com.edu.senac.ap02.ado.ado4;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o texto para busca: ");
            String texto = sc.nextLine();

            System.out.print("Digite o texto que deseja comparar: ");
            String textoComparacao = sc.next();

            procurarTexto(texto, textoComparacao);

        }catch (IllegalArgumentException e){
            System.out.println("Os textos tem tamanhos diferentes, tente novamente");
            String[] teste = {};
            Exe08.main(teste);
        }
        catch (Exception e){
            System.out.println("Seu o código não deu o erro, tente novamente");
            String[] teste = {};
            Exe08.main(teste);
        }

    }
    private static void procurarTexto(String texto, String textoComparacao) {

            if(!validarTamanho(texto, textoComparacao)){
                throw new IllegalArgumentException("Os textos não são iguais");
            }

            int tamanho = (texto.length() > textoComparacao.length()) ? texto.length() : textoComparacao.length();

            boolean validacao = true;

            for (int i = 0; i < tamanho; i++) {

                int charTexto = (int) texto.charAt(i);
                int charTextoComparacao = (int) textoComparacao.charAt(i);

                if (charTexto != charTextoComparacao){
                    //System.out.println("Os textos não conferem");
                    validacao = false;
                    break;
                }
            }
            if (validacao){
                System.out.println("Os textos são iguais");
            }else{
                System.out.println("Os textos são diferentes");
            }
    }
    private static boolean validarTamanho(String texto, String textoComparacao) {
        if (texto.length() != textoComparacao.length()){
            return false;
        }else{
         return true;
        }
    }
}
