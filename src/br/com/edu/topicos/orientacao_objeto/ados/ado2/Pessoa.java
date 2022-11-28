package br.com.edu.topicos.orientacao_objeto.ados.ado2;

public class Pessoa {
    String nome;
    Pai pai;
    Mae mae;

    public Pessoa(String nome, Pai pai, Mae mae){
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pai getPai() {
        return pai;
    }

    public void setPai(Pai pai) {
        this.pai = pai;
    }

    public Mae getMae() { return this.mae;
    }

    public void setMae(Mae mae) {
        this.mae = mae;
    }

    public boolean verificaIgualdade(Pessoa pessoa){
        boolean b;
        try {
        b = this.getNome().equalsIgnoreCase(pessoa.getNome()) && this.getMae().getNome() == pessoa.getMae().getNome() ? true : false;
        } catch (Exception e){
            return false;
        }
        return b;
    }

    public boolean verificaIgualdade(Pessoa antecessor, Pessoa pessoa){
        boolean b;
        try {
             b = antecessor == pessoa;
            if (b){
                return true;
            }else {
                return false;
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verificaSeEhIrmao(Pessoa pessoa){
        boolean b;
        try {
            b = this.getMae() == pessoa.getMae();
            if (b){
                return true;
            }else {
                return false;
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verificaSeEhAntecessor(Pessoa pessoa){
        try {
            if (verificaIgualdade(this.pai, pessoa) || verificaIgualdade(this.mae, pessoa)){
                return true;
            } else if (verificaIgualdade(this.pai.pai, pessoa) || verificaIgualdade(this.mae.pai, pessoa)) {
                return true;
            }
            else if (verificaIgualdade(this.pai.mae, pessoa) || verificaIgualdade(this.mae.mae, pessoa)) {
                return true;
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }
}
class Pai extends Pessoa{

    public Pai(String nome, Pai pai, Mae mae) {
        super(nome, pai, mae);
    }
}

class Mae extends Pessoa{

    public Mae(String nome, Pai pai, Mae mae) {
        super(nome, pai, mae);
    }
}