package br.com.edu.senac.poo.aula1.algoritmosDeOrdenacao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuscaBinaria {

    public static void main(String[] args) {

        int[] listaValores = {6,3,4,2,5,1};

        for (int i = 0; i < listaValores.length -1; i++){
            for (int j = i; j <= listaValores.length -1; j++){
                if(listaValores[i] == listaValores[j]){continue;}
                if (listaValores[i] > listaValores[j]){
                    int valorTroca = listaValores[i];
                    listaValores[i] = listaValores[j];
                    listaValores[j] = valorTroca;
                }
            }
        }

        for (int i: listaValores){

            System.out.print(" " + i + " ");
        }
        System.out.println();

        HashMap<String, Integer> posicao = buscarDeFormaBinaria(listaValores, 2);

        for (String chave: posicao.keySet()){
            System.out.println(chave + ": " + posicao.get(chave));
        }
    }
    static HashMap<String, Integer> buscarDeFormaBinaria(int[] lista, int valor){

        boolean ehPar = lista.length % 2 != 0? false: true;
        int indiceCentral = 0;
        int posicaoCorreta = 0; //
        int passosNecessarios = 0;

        if (ehPar){
            indiceCentral = lista.length / 2;
        }else {
            // TODO
            indiceCentral =  lista.length / 2;
        }

        boolean valida = true;
        while (valida){
            passosNecessarios++;
            if(valor == lista[indiceCentral]){
                valida = false;
                posicaoCorreta = indiceCentral;
            } else if (valor > lista[indiceCentral]) {
                indiceCentral = (indiceCentral + lista.length) / 2;
            }else {
                indiceCentral = (indiceCentral / 2)+1;
            }
        }

        HashMap<String, Integer> result = new HashMap<>();

        result.put("posicao", posicaoCorreta);
        result.put("passos", passosNecessarios);

        return result;
    }
}
