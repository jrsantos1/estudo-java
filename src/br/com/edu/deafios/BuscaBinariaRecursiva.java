package br.com.edu.deafios;

import java.util.ArrayList;
import java.util.List;

public class BuscaBinariaRecursiva {
    public static void main(String[] args) {

        Integer[] listaOrdenada = {1,3,5,8,10,11,13,15,16,19};
        int result = buscarElemento(listaOrdenada, 13, 0, listaOrdenada.length - 1, 1);
        System.out.println("O elemento está na posição: " + result);
        buscarBinariaIterativo(listaOrdenada, 13);
    }
    private static int buscarElemento(Integer[] listaOrdenada, int elementoBuscado, int indiceInicio, int indiceFim, int qtdVoltas) {
        if(indiceInicio > indiceFim){
            return -1; // caso base, elemento não encontrado
        }

        int meio = (indiceInicio + indiceFim) / 2;

        System.out.println("Volta número: " + qtdVoltas);

        if(listaOrdenada[meio] == elementoBuscado){
            return meio;
        }else if(listaOrdenada[meio] > elementoBuscado){
            return buscarElemento(listaOrdenada, elementoBuscado, indiceInicio, meio - 1, ++qtdVoltas);
        }else {
            return buscarElemento(listaOrdenada, elementoBuscado, meio + 1, indiceFim, ++qtdVoltas);
        }
    }
    private static void buscarBinariaIterativo(Integer[] listaOrdenada, int valorAProcurar){
        int tamanhoArray = listaOrdenada.length;
        int qtdTentativas = 0;
        boolean valida = true;
        int posicao = tamanhoArray / 2;
        float valorAcresimo = 0;
        while(valida){
            qtdTentativas++;
            if (listaOrdenada[posicao] == valorAProcurar){
                valida = false;
            }else{
                posicao = listaOrdenada[posicao] > valorAProcurar? (posicao / 2):((tamanhoArray - posicao) / 2) + posicao;
            }
        }
        System.out.println("A quantidade de tentativas para encontrar o valor " + valorAProcurar + " foi: " + qtdTentativas );
    }
}
