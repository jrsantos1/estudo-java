package br.com.edu.topicos.orientacao_objeto.ados.ado3;

public class Pessoa {
    String nome;
    Pai pai;
    Mae mae;

    public Pessoa(String nome, Pai pai, Mae mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome(){
        return this.nome;
    }

    public Pai getPai(){
        return this.pai;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPai(Pai pai) {
        this.pai = pai;
    }

    public Mae getMae() {
        return mae;
    }

    public void setMae(Mae mae) {
        this.mae = mae;
    }


    public boolean verificaIgualdade(Pessoa pessoa){
        boolean b = false;
        try{
            b = this.getNome().equalsIgnoreCase(pessoa.getNome()) && this.mae.getNome().equalsIgnoreCase(pessoa.getMae().getNome()) ? true: false;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return b;
    }

    public boolean verificaIgualdade(Pessoa antecessor, Pessoa pessoa){
        boolean b;
        try {
            b = antecessor == pessoa;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return b;
    }

    public boolean verificaSeEhIrmao(Pessoa pessoa){
        boolean b;
        try {
            b = this.getMae() == pessoa.getMae() ? true: false;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return b;
    }

    public boolean verifiqueSeEhAntecessor(Pessoa pessoa){
        boolean b;
        try {
            if (verificaIgualdade(this.getMae(), pessoa) || verificaIgualdade(this.getPai(), pessoa)){
                return true;
            }else if (verificaIgualdade(this.getMae().getMae(), pessoa) || verificaIgualdade(this.getMae().getPai())){
                return true;
            }else if (verificaIgualdade(this.getPai().getMae(), pessoa) || verificaIgualdade(this.getPai().getPai())){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}

class Pai extends Pessoa{
    public Pai(String nome, Pai pai, Mae mae){
        super(nome, pai, mae);
    }
}

class Mae extends Pessoa{
    public Mae(String nome, Pai pai, Mae mae) {
        super(nome, pai, mae);
    }
}