package br.com.edu.topicos.orientacao_objeto.desafios.sorteio;

import java.util.Random;

public class Aleatorio {

    public int gerarNumeroAleatorio(int numeroMaximo){
        int valorGerado = new Random().nextInt(numeroMaximo + 1);
        return valorGerado;

    }
}