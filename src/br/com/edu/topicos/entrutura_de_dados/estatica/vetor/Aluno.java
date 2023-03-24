package br.com.edu.topicos.entrutura_de_dados.estatica.vetor;

public class Aluno {

    private String nomeCompleto;
    private int idade;
    private String matricula;

    public Aluno(String nomeCompleto, int idade, String matricula) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return this.getNomeCompleto();
    }

}
