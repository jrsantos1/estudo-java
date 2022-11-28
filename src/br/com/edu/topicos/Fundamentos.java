package br.com.edu.topicos;

public class Fundamentos {
    public static void main(String[] args) { // metodo que executa o programa

        // comentário

        // como declarar constante
        final double PI = 3.14;

        // inferencia de tipo - não selecionar o tipo em sua inicialização

        var idade = 13; // int
        var saldoEmConta = 500.0; // Real
        var nome = ""; // String
        var EMaiorDeDezoito = true; // boolean

        // wappers - são os objetos em java para cada tipo primitivo exemplos:

        Integer num1 = 1;
        Character char1 = 'A';
        Boolean bo1 = true;

        // conversao de tipos, implicito e explicito

        // explicito
        int num3 = 1;
        float num4 = (float) num3;
        float num5 = num3;

    }
}
