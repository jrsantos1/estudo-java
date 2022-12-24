package br.com.edu.topicos.orientacao_objeto;

// Crando classe Cachorro

class Cachorro extends Animal {

    public Cachorro(String nome, double altura, double peso, int idade) {
        super(nome, altura, peso, idade);
    }

    // criando método latir

    public void latir(){
        System.out.println("Au Au");
    }

    public String falar(){
        return "Auuu Auuu Auuuuuuuu";
    }

}

// Crando classe Gato 

class Gato extends Animal {

    public Gato(String nome, double altura, double peso, int idade) {
        super(nome, altura, peso, idade);
    }

    // criando método miar
    
    public void miar(){
        System.out.println("Miau");
    }

    public String falar(){
        String fala = "Iiiiu ainhin";
        return fala;   
    }
}

// Criando classe Ave
class Falcao extends Animal{

    public Falcao(String nome, double altura, double peso, int idade) {
        super(nome, altura, peso, idade);
    }

    public void voar(){
        System.out.println("Voar");
    }
}

class Main1{
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Fanny", 1.2, 3.2, 13);
        Gato gato = new Gato("Jackson", 0.15, 3, 6);
        Falcao falcao = new Falcao("Fred", 0.5, 2, 5);

        // método não sobrescrito
        System.out.println("Falcão: " + falcao.falar());

        // método sobrescrito
        System.out.println("Gato: " + gato.falar());
        System.out.println("Cachorro: " + cachorro.falar());

    }
}