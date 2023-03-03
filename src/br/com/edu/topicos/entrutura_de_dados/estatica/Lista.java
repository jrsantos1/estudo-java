package br.com.edu.topicos.entrutura_de_dados.estatica;

public class Lista<T> {
    private T[] objeto = (T[]) new Object[100];
    private int totalElementos = 0;

    public void adiciona(T object){
        this.objeto[this.totalElementos] = object;
        this.totalElementos++;
    }

    public void adiciona(int posicao, T object) {
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("posição inválida!");
        }

        for (int i = this.totalElementos; i > posicao; i--) {
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

        for (int i = posicao; posicao < this.totalElementos -1; posicao++){
            this.objeto[i] = this.objeto[i + 1];
        }

        this.totalElementos--;
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
        return this.totalElementos;
    }
    public boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalElementos;
    }
    public boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= this.totalElementos;
    }

    public String toString(){
        if (this.totalElementos == 0)
            return "[]";

        StringBuilder alunos = new StringBuilder();
        alunos.append("[");

        for (int i = 0; i < this.totalElementos - 1; i++){
            alunos.append(this.objeto[i]);
            alunos.append(", ");
        }

        alunos.append(this.objeto[this.totalElementos - 1]);
        alunos.append("]");

        return alunos.toString();
    }
}
