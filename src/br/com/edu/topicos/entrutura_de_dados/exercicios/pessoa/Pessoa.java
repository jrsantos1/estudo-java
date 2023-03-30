package br.com.edu.topicos.entrutura_de_dados.exercicios.pessoa;

public class Pessoa {

    private String nome; 
    private Pessoa mae;

    public Pessoa(String nome) {
        this.nome = nome;
        this.mae = null;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pessoa getMae() {
        return mae;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    } 

    public String getTataravo(){
        Pessoa pessoaAux = this;
        for (int i = 0; i<4; i++){
            if (pessoaAux.getMae() == null){
                return "Você não tem tataravó";
            }
            pessoaAux = pessoaAux.getMae();
        }
        return pessoaAux.nome;
    }

    public void printNames(){
        Pessoa pessoaAux = this;
        while(pessoaAux != null){
            System.out.println(pessoaAux.nome);
            pessoaAux = pessoaAux.getMae();
        }
    }
    
}
