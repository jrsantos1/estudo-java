package br.com.edu.topicos.entrutura_de_dados.dinamica.listaLigada;

public class ListaLigada<T> {

    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public void adiciona(T elemento) {}
    public void adiciona(int posicao, T elemento) {}
    public T pega(int posicao) {return null;}
    public void remove(int posicao){}
    public int tamanho() {return 0;}
    public boolean contem(T o) {return false;}

    // implementações específica para lista ligada

    public void adicionaNoComeco(T elemento) {
        Celula nova = new Celula(this.primeira, elemento);

        if (this.totalDeElementos == 0){
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;

    }
    public void adicionaNoFim(T elemento) {}
    public void removeDoComeco() {}
    public void removeDoFim() {}

}
