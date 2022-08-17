package br.com.edu.aulas.ap02.exercicos.exercicio02;

public class Integrante {
    private String nome;
    private float orcamento;

    public Integrante(String nome, float orcamento){
        this.nome = nome;
        this.orcamento = orcamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
}
