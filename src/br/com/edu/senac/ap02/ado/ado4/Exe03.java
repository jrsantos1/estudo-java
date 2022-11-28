package br.com.edu.senac.ap02.ado.ado4;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a frase para criptografar: ");
        String frase = "";
        int chave = 0;

        try {
            frase = sc.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Digite a chave para criptografar: ");
        try {
            chave = sc.nextInt();
            criptografar(frase, chave);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void criptografar(String frase, int chave) {

        String textoConverter = "";

        for (int i = 0; i < frase.length(); i++) {
            int letraCifrada = (int) frase.charAt(i) + chave;

            if(letraCifrada > 122){
                int diferenca = letraCifrada - 122;
                letraCifrada = 97 + diferenca - 1;
            }
            //System.out.println(letraCifrada);
            textoConverter += (char) letraCifrada;
        }
        System.out.println(textoConverter);

    }
}
