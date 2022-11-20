package br.com.edu.oo;


// Classe 

class Animal {
    // Atributos 
    double tamanho;
    double peso;
    int idade; 

    // Métodos / Funções
    void andar(){}
    void falar(){}
    void comer(){}

}

class Main{
    public static void main(String[] args) {
        // Objeto 
        Animal animal = new Animal();
        
        // Alterando estado do atributos do objeto
        animal.idade = 12;
        animal.peso = 12;
        animal.tamanho = 0.45;

        // invocando os métodos do objeto
        animal.andar();
        animal.comer();
        animal.falar();

    }
}