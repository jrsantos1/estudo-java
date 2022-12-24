package br.com.edu.topicos.orientacao_objeto;

public class Ave extends Animal{

    public Ave(String nome, double altura, double peso, int idade) {
        super(nome, altura, peso, idade);
    }

    public void voar(){
        System.out.println("Voar");
    }
}