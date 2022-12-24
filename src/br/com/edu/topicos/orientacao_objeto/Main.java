package br.com.edu.topicos.orientacao_objeto;

public class Main{
    public static void main(String[] args) {
        // Objeto
        Animal animal = new Animal("Junior", 1.4, 2.6,14);
        
        // invocando métodos 
        animal.andar();
        animal.comer();
        animal.falar();

        // utilizando método set para alterar o estado do objeto

        animal.setNome("Falcão");
        animal.setIdade(15);
        animal.setPeso(19);
        animal.setAltura(0.6);

        // utilizando método get para pegar os dados

        animal.getNome();
        animal.getAltura();
        animal.getPeso();
        animal.getIdade();
    }
}
