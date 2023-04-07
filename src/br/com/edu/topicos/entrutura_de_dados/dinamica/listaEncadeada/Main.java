package br.com.edu.topicos.entrutura_de_dados.dinamica.listaEncadeada;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal("cao", "bob", 12 );
        Animal aguia = new Animal("aguia", "camarada", 44);
        Animal porco = new Animal("porco", "castao", 10);
        Animal arara = new Animal("arara", "loro", 50);

        ListaEncadeada<Animal> animais = new ListaEncadeada<>();

        animais.add(aguia);
        animais.add(arara);
        animais.add(porco);
        animais.add(cachorro);

        System.out.println(animais);

    }
}
