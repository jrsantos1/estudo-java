package br.com.edu.topicos.lambdas;

public class Implementacao {

    public static void main(String[] args) {

        String nome = "Jhonatan";
        LambdaExemplo le = (c -> c + " é meu nome");

    }
}

interface LambdaExemplo{
    String run(String str);
}
