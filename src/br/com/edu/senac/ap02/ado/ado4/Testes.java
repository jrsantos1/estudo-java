package br.com.edu.senac.ap02.ado.ado4;

public class Testes {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        char letra1 = 'J';
        char letra2 = 'h';
        char letra3 = 'o';
        char letra4 = 'n';

        stringBuilder.append(letra1);
        stringBuilder.append(letra2);
        stringBuilder.append(letra3);
        stringBuilder.append(letra4);

        String novaString = String.valueOf(stringBuilder);

        System.out.println(stringBuilder.toString());

    }
}
