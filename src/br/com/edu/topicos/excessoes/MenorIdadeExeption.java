package br.com.edu.topicos.excessoes;

public class MenorIdadeExeption extends RuntimeException {
    private String nomeDoAtributo;

    public MenorIdadeExeption(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }
    @Override
    public String getMessage() {
        return String.format("%s", nomeDoAtributo);
    }
}
