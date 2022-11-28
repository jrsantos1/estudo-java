package br.com.edu.topicos.orientacao_objeto.ados.ado2;

public class Main {
    public static void main(String[] args) {

        Pessoa jhonatan = new Pessoa("Jhonatan", null, null);
        Mae cleide = new Mae("Cleide", null, null);
        Mae cleusa = new Mae("Cleusa", null, null);
        Pai antonio = new Pai("Antonio", null, null);
        Pessoa daiana = new Pessoa("Daiana", null, null);
        Pessoa jhonatan2 = new Pessoa("Jhonatan", null, null);

        jhonatan.setMae(cleide);
        jhonatan.setPai(antonio);
        daiana.setMae(cleide);
        jhonatan2.setMae(cleusa);

        boolean resultado = jhonatan.verificaIgualdade(jhonatan2);
        boolean antecessor = jhonatan.verificaSeEhAntecessor(cleide);
        boolean antecessora = jhonatan.verificaSeEhAntecessor(cleusa);

        boolean ehIrmao = jhonatan.verificaSeEhIrmao(daiana);

        System.out.println("É irmão: " + ehIrmao);


        System.out.println(" é antecessor: " + antecessor);
        System.out.println(" é antecessor: " + antecessora);
        System.out.println(resultado);


    }
}
