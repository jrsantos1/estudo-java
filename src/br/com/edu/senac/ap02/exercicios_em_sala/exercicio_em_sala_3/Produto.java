package br.com.edu.senac.ap02.exercicios_em_sala.exercicio_em_sala_3;

class Produto{
    
    private String nome;
    private double preco;
    private double qtd;
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setQtd(double qtd){
        this.qtd = qtd;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public double getQtd(){
        return this.qtd;
    }

}
