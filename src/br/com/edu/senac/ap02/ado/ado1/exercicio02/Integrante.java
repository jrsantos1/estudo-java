package br.com.edu.senac.ap02.ado.ado1.exercicio02;

public class Integrante {
    private String nome;
    private float orcamento;
    private float gastosIntegrante;

    public Integrante(String nome, float orcamento, float gastosIntegrante){
        this.nome = nome;
        this.orcamento = orcamento;
        this.gastosIntegrante = gastosIntegrante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getOrcamento() {
        return this.orcamento;
    }
    public float getGastosIntegrante() {
        return this.gastosIntegrante;
    }

    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
}
