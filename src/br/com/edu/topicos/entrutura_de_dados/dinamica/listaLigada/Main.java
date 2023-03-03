package br.com.edu.topicos.entrutura_de_dados.dinamica.listaLigada;

import br.com.edu.topicos.entrutura_de_dados.estatica.Lista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ListaLigada<String> listaLigada = new ListaLigada<>();

        ArrayList<String> log_erros = new ArrayList<>();

        System.out.println("Teste adiciona por posição");
        try {
            listaLigada.adicionaNoFim("Jhonatan");
        }catch (Exception e){
            log_erros.add("Erro adicionar no fim");
        }

    }
}
