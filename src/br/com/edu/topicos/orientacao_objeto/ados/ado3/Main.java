package br.com.edu.topicos.orientacao_objeto.ados.ado3;

public class Main {
    public static void main(String[] args) {

        // dados de teste

        Pessoa pessoaIgual = new Pessoa("Jhonatan", null, null); // eu


        // Familia

        Pessoa pessoa1 = new Pessoa("Jhonatan", null, null); // eu
        Mae mae1 = new Mae("Cleide", null, null); // mae
        Pai pai1 = new Pai("Antonio", null, null); // pai
        Pessoa pessoaIrma = new Pessoa("Daiana", null, null); // irma

        pessoa1.setMae(mae1);
        pessoa1.setPai(pai1);
        pessoaIrma.setMae(mae1);
        pessoaIrma.setPai(pai1);
        pessoaIgual.setMae(mae1);

        // verifica se é irmao

        boolean ehIrmao = pessoa1.verificaSeEhIrmao(pessoaIrma);
        boolean ehAntecessor = pessoa1.verifiqueSeEhAntecessor(mae1);
        boolean ehIgual = pessoa1.verificaIgualdade(pessoaIgual);

        System.out.println("O retorno deve ser true: " + ehIrmao);
        System.out.println("O retorno deve ser true: " + ehAntecessor);
        System.out.println("O retorno deve ser tru: " + ehIgual);


        // Familia 2

        Pessoa pessoa2 = new Pessoa("Pedro", null, null); // eu
        Mae mae2 = new Mae("Cleusa", null, null); // mae
        Pai pai2 = new Pai("Jefferson", null, null); // pai
        Pessoa pessoaIrma2 = new Pessoa("Joaquina", null, null); // irma

        pessoa2.setMae(mae2);
        pessoa2.setPai(pai2);


        // testes

        boolean ehIrmao2 = pessoa1.verificaSeEhIrmao(pessoa2);
        boolean ehAntecessor2 = pessoa1.verifiqueSeEhAntecessor(mae2);
        boolean ehIgual2 = pessoa1.verificaIgualdade(pessoa2);

        System.out.println("O retorno deve ser false: " + ehIrmao2);
        System.out.println("O retorno deve ser false: " + ehAntecessor2);
        System.out.println("O retorno deve ser false: " + ehIgual2);





    }
}
