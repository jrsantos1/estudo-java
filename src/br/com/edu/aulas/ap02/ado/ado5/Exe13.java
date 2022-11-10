package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe13 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite os 5 primeiros números");
        int[] numerosUsuario = gerarNumerosUsuario();
        System.out.println(Arrays.toString(numerosUsuario));
    }
    private static int[] gerarNumerosUsuario() {
        int[] arrayUsuario = new int[5];
        for (int i = 0; i < arrayUsuario.length; i++) {
            arrayUsuario[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arrayUsuario));
        int numeroAtual = 0;
        int menorNumero = 0;
        int numero0 = arrayUsuario[0];
        int numero1 = arrayUsuario[1];
        int numero2 = arrayUsuario[2];
        int posicaoMenorNumero = 0;
        int numeroAnterior = 0;
        int posicaoSegundoMenorValor = 0;
        int segundoMenorValor = 0;
        int posicaoTerceiroMenorValor = 0;
        int terceiroMenorValor = 0;

        for (int i = 0; i < arrayUsuario.length; i++) {
            numeroAnterior = numeroAtual;
            numeroAtual = arrayUsuario[i];
            if (numeroAtual < numeroAnterior){
                terceiroMenorValor = segundoMenorValor;
                segundoMenorValor = menorNumero;
                menorNumero = numeroAtual;
                posicaoTerceiroMenorValor = posicaoSegundoMenorValor;
                posicaoSegundoMenorValor = posicaoMenorNumero;
                posicaoMenorNumero = i;
            }
        }
        arrayUsuario[0] = arrayUsuario[posicaoMenorNumero];
        arrayUsuario[1] = arrayUsuario[posicaoSegundoMenorValor];
        arrayUsuario[2] = arrayUsuario[posicaoTerceiroMenorValor];
        arrayUsuario[posicaoMenorNumero] = numero0;
        arrayUsuario[posicaoSegundoMenorValor] = numero1;
        arrayUsuario[posicaoTerceiroMenorValor] = numero2;

        return arrayUsuario;

    }
}
