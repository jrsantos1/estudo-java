package br.com.edu.aulas.oo.relacoes.desafio;

public class Main {
    public static void main(String[] args) {

        // cria usuario
        Cliente cliente1 = new Cliente();
        // cria compra
        Compra compra1 = new Compra(cliente1);
        // produto
        Produto produto1 = new Produto("chocolate", 1.23);
        Produto produto2 = new Produto("Amendoim Granulado", 3.4);
        // item
        Item item1 = new Item(3, produto1);
        Item item2 = new Item(3, produto2);
        // adicionano item a compra
        compra1.adicionarItem(item1);
        compra1.adicionarItem(item2);

        cliente1.adicionarCompra(compra1);
        System.out.println("o valor final da compra foi de: " + compra1.retornarValorTotal());


    }
}
