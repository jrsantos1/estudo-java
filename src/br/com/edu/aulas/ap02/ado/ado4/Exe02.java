package br.com.edu.aulas.ap02.ado.ado4;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a frase para criptografar: ");

        try {
            String frase = sc.nextLine();
            criptografar(frase);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private static void criptografar(String frase) {

        String de = "ZPEONLIATR";
        String para = "PZOELNAIRT";
        String montarFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            String apoio = String.valueOf(frase.charAt(i));
            int icValida = 0;
            for (int j = 0; j < de.length(); j++) {
                String novoDe = String.valueOf(de.charAt(j));
                if (novoDe.equalsIgnoreCase(apoio)){
                    montarFrase += String.valueOf(para.charAt(i));
                    icValida = 1;
                }
            }
            if (!(icValida == 1)){
                montarFrase += String.valueOf(frase.charAt(i));
            }
        }
        System.out.println("O resultado é: " + montarFrase.toUpperCase());
    }
}
