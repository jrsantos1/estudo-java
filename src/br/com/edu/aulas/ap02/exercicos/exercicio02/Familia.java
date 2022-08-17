package br.com.edu.aulas.ap02.exercicos.exercicio02;

public class Familia {
    private String apelidoFamilia;
    private Integrante integrante;
    private static float orcamento;
    private static int qtdIntegrantes;


    public Familia(String apelidoFamilia){
        this.apelidoFamilia = apelidoFamilia;
    }

    public Integrante getIntegrante() {
        return this.integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
        orcamento += integrante.getOrcamento();
        qtdIntegrantes += 1;
    }

    public String getApelidoFamilia(){
        return this.apelidoFamilia;
    }

    public float getOrcamento() {
        return orcamento;
    }

    public float getQtdIntegrantes() {
        return qtdIntegrantes;
    }

}
