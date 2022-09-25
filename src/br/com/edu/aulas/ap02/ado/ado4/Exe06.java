package br.com.edu.aulas.ap02.ado.ado4;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o texto para busca: ");
            String textoBusca = sc.nextLine();

            System.out.print("Digite o texto que deseja encontrar a posição: ");
            String textProcurado = sc.next();

            System.out.print("Digite o número inicial: ");
            int posicaoInicial = sc.nextInt();

            procurarTexto(textoBusca, textProcurado, posicaoInicial);

        }catch (Exception e){
            System.out.println("Seu o código deu o erro, tente novamente");
            String[] teste = {};
            Exe06.main(teste);
        }
    }
    private static void procurarTexto(String textoBusca, String textoProcurado, int posicaoInicial) {

            String montarTextoBusca = "";
            int posicaoInicialBusca = 0;

            for (int i = posicaoInicial; i < textoBusca.length(); i++) {
                String textoString = String.valueOf(textoBusca.charAt(i));

                for (int j = 0; j < textoProcurado.length(); j++) {
                    String textoProcuradoString = String.valueOf(textoProcurado.charAt(j));

                    if (textoProcuradoString.equalsIgnoreCase(textoString)) {
                        montarTextoBusca +=  textoProcuradoString;
                        if(posicaoInicialBusca == 0){
                            posicaoInicialBusca = i;
                        }
                        break;
                    }
                }
            }
            System.out.println("resultado montar texto busca: " + montarTextoBusca);
            if (montarTextoBusca.equalsIgnoreCase(textoProcurado)){
            System.out.println("A posição de "+ textoProcurado +" em "+ textoBusca + " inicia em: " + posicaoInicialBusca);
            }else{
                System.out.println("A posição de "+ textoProcurado +" em "+ textoBusca + " não existe");
            }

    }
}
