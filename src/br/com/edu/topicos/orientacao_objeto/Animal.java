package br.com.edu.topicos.orientacao_objeto;

// Classe 
class Animal{

    // Atributos private

   private String nome;
   private double altura; 
   private double peso;
   private int idade; 

    // Construtor

    public Animal (String nome, double altura, double peso, int idade){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }

    // Métodos / Funções

    // acessando atributos com getters e setters

    public void andar(){
        System.out.println("Caminhando...");
    }
    public String falar(){
        return "Fala padrão";
    }
    public void comer(){
        System.out.println(" alimento nome ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

