package br.com.edu.topicos.jdbc;

public class Questoes {
    private int id;
    private String questao;
    private String primeiraAlternativa;
    private String segundaAlternativa;
    private String terceiraAlternativa;
    private String quartaAlternativa;
    private String alternativaCorreta;

    public Questoes(int id, String questao, String primeiraAlternativa, String segundaAlternativa, String terceiraAlternativa, String quartaAlternativa, String alternativaCorreta) {
        this.id = id;
        this.questao = questao;
        this.primeiraAlternativa = primeiraAlternativa;
        this.segundaAlternativa = segundaAlternativa;
        this.terceiraAlternativa = terceiraAlternativa;
        this.quartaAlternativa = quartaAlternativa;
        this.alternativaCorreta = alternativaCorreta;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String getPrimeiraAlternativa() {
        return primeiraAlternativa;
    }

    public void setPrimeiraAlternativa(String primeiraAlternativa) {
        this.primeiraAlternativa = primeiraAlternativa;
    }

    public String getSegundaAlternativa() {
        return segundaAlternativa;
    }

    public void setSegundaAlternativa(String segundaAlternativa) {
        this.segundaAlternativa = segundaAlternativa;
    }

    public String getTerceiraAlternativa() {
        return terceiraAlternativa;
    }

    public void setTerceiraAlternativa(String terceiraAlternativa) {
        this.terceiraAlternativa = terceiraAlternativa;
    }

    public String getQuartaAlternativa() {
        return quartaAlternativa;
    }

    public void setQuartaAlternativa(String quartaAlternativa) {
        this.quartaAlternativa = quartaAlternativa;
    }

    public String getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public void setAlternativaCorreta(String alternativaCorreta) {
        this.alternativaCorreta = alternativaCorreta;
    }
}
