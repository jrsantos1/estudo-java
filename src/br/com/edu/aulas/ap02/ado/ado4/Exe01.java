package br.com.edu.aulas.ap02.ado.ado4;

import java.text.Normalizer;
import java.util.Scanner;

public class Exe01 {
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

        int tamanho = frase.length();
        String fraseResultado = "";

        for (int i = 0; i < tamanho; i++) {

            String conversao = "";

            if (String.valueOf(frase.charAt(i)).equalsIgnoreCase("ç")){
                 conversao = String.valueOf(frase.charAt(i));
            }else {
                 conversao = removerAcentos(String.valueOf(frase.charAt(i)));
            }



            if (conversao.equalsIgnoreCase("A") ||
                    conversao.equalsIgnoreCase("E") ||
                    conversao.equalsIgnoreCase("O") ||
                    conversao.equalsIgnoreCase("U")
            ){
                fraseResultado += "i";
            }else {
                fraseResultado += conversao;
            }
        }
        System.out.println("O texto convertido é: " + fraseResultado);
    }
    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }


}
