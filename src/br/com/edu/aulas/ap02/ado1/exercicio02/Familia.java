package br.com.edu.aulas.ap02.ado1.exercicio02;

public class Familia {
    private String apelidoFamilia;
    private Integrante integrante;
    private float orcamento;
    private float gastosIntegrante;
    private int qtdIntegrantes;

    public Familia(String apelidoFamilia){
        this.apelidoFamilia = apelidoFamilia;
    }

    public Integrante getIntegrante() {
        return this.integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
        this.orcamento += integrante.getOrcamento();
        this.gastosIntegrante += integrante.getGastosIntegrante();
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

    public String situacaoOcamento(){
        if(gastosIntegrante > orcamento){
            return "Fora do orçamento";
        }else{
            return "Dentro do orçamento";
        }
    }
}
