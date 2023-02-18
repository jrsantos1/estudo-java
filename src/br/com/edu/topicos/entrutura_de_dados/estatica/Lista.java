package br.com.edu.topicos.entrutura_de_dados.estatica;

public class Lista<T> {
    private T[] objeto = (T[]) new Object[100];
    private int totalDeAluno = 0;

    public void adiciona(T object){
        this.objeto[this.totalDeAluno] = object;
        this.totalDeAluno++;
    }

    public void adiciona(int posicao, T object) {
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("posição inválida!");
        }

        for (int i = this.totalDeAluno; i > posicao; i--) {
            this.objeto[i + 1] = this.objeto[i];
        }

        this.objeto[posicao] = object;

    }
    public T buscar(int posicao){
        if(posicaoOcupada(posicao) == false){
            throw new IllegalArgumentException("Posição inválida");
        }
        return objeto[posicao];
    }

    public void remover(int posicao){
        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; posicao < this.totalDeAluno -1; posicao++){
            this.objeto[i] = this.objeto[i + 1];
        }

        this.totalDeAluno--;
    }

    public boolean contem(T object){
        for (int i = 0; i < this.objeto.length; i++){
            if (objeto[i] == object){
                return true;
            }
        }
        return false;
    }
    public int tamanho(){
        return this.totalDeAluno;
    }
    public boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeAluno;
    }
    public boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= this.totalDeAluno;
    }

    public String toString(){
        if (this.totalDeAluno == 0)
            return "[]";

        StringBuilder alunos = new StringBuilder();
        alunos.append("[");

        for (int i = 0; i < this.totalDeAluno - 1; i++){
            alunos.append(this.objeto[i]);
            alunos.append(", ");
        }

        alunos.append(this.objeto[this.totalDeAluno - 1]);
        alunos.append("]");

        return alunos.toString();
    }
}
