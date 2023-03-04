package br.com.edu.topicos.entrutura_de_dados.dinamica.listaEncadeada;

public class Animal {
    private String especie;
    private String nome;
    private int idade;

    public Animal(String especie, String nome, int idade) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
