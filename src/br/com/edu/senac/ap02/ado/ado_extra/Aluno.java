package br.com.edu.senac.ap02.ado.ado_extra;

public class Aluno {
    private String nome;
    private double jogos;
    private double gols;
    private double assistencias;
    private double pontuacao;
    public void setNome(String nome){
        this.nome = nome;
    }
    void setGols(double gols){
        this.gols = gols;
    }
    void setAssist(double assitencias){
        this.assistencias = assistencias;
    }
    void setJogos(double jogos){
        this.jogos = jogos;
    }
    void getPontuacao(){
        double participacaoEmGols = ((this.assistencias + this.gols) / this.jogos) ;
        if(participacaoEmGols > 10){
            System.out.print("A pontuação é: " + 10);
        }else{
            System.out.print("A pontuação é: " + participacaoEmGols);
        }
    }
}
class Principal{
    public static void main(String[] args) {
        Aluno jhonatan = new Aluno();
        jhonatan.setNome("Jhonatan");
        jhonatan.setJogos(20);
        jhonatan.setGols(10);
        jhonatan.setAssist(4);
        jhonatan.getPontuacao();
    }
}
