package br.com.edu.topicos.entrutura_de_dados.dinamica.listaEncadeada;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal("cao", "bob", 12 );
        Animal aguia = new Animal("aguia", "camarada", 44);
        Animal porco = new Animal("porco", "castao", 10);
        Animal arara = new Animal("arara", "loro", 50);

        ListaEncadeada<Animal> animais = new ListaEncadeada<>();

        animais.add(cachorro);
        animais.add(arara);

        System.out.println(animais);

    }
}
