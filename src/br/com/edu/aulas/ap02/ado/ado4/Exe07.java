package br.com.edu.aulas.ap02.ado.ado4;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o texto para busca: ");
            String textoBusca = sc.nextLine();

            System.out.print("Digite o texto que deseja encontrar a posição: ");
            String textProcurado = sc.next();


            procurarTexto(textoBusca, textProcurado);

        }catch (Exception e){
            System.out.println("Seu o código deu o erro, tente novamente");
            String[] teste = {};
            Exe07.main(teste);
        }
    }
    private static void procurarTexto(String textoBusca, String textoProcurado) {

            String montarTextoBusca = "";

            for (int i = 0; i < textoBusca.length(); i++) {
                String textoString = String.valueOf(textoBusca.charAt(i));

                for (int j = 0; j < textoProcurado.length(); j++) {
                    String textoProcuradoString = String.valueOf(textoProcurado.charAt(j));

                    if (textoProcuradoString.equalsIgnoreCase(textoString)) {
                        montarTextoBusca += textoProcuradoString;
                        break;
                    }
                }
            }
           // System.out.println("resultado montar texto busca: " + montarTextoBusca + " . E texto procurado é: " + textoProcurado);
            if (montarTextoBusca.equalsIgnoreCase(textoProcurado)){
                System.out.println("o texto  "+ textoProcurado +" existe em "+ textoBusca);
            }else{
                System.out.println("o texto "+ textoProcurado + " não existe em "+ textoBusca);
            }
    }
}
