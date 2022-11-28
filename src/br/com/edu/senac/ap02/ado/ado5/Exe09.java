package br.com.edu.senac.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe09 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o texto desejado: ");
        String texto = sc.next();
        String[] vetorCaracter = gerarVetorCaracter(texto);

        System.out.println(Arrays.toString(vetorCaracter));
    }
    private static String[] gerarVetorCaracter(String texto) {
        String nova = limparString(texto);
        String[] vetorCaractere = new String[nova.length()];
        for (int i = 0; i < vetorCaractere.length; i++) {
            vetorCaractere[i] = String.valueOf(nova.charAt(i));
        }
        return vetorCaractere;
    }
    private static String limparString(String texto) {
        String nova = "";
        for (int i = 0; i < texto.length(); i++) {
            String apoio = String.valueOf(texto.charAt(i));
            if (!apoio.equalsIgnoreCase(" ")){
                nova += apoio;
            }
        }
        return nova;
    }
}
