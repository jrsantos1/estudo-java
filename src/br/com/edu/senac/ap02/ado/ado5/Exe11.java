package br.com.edu.senac.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe11 {
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
        int posicaoMenorNumero = 0;
        int numeroAnterior = 0;

        for (int i = 0; i < arrayUsuario.length; i++) {
            numeroAnterior = numeroAtual;
            numeroAtual = arrayUsuario[i];
            if (numeroAtual < numeroAnterior){
                menorNumero = numeroAtual;
                posicaoMenorNumero = i;
            }
        }
        arrayUsuario[0] = arrayUsuario[posicaoMenorNumero];
        arrayUsuario[posicaoMenorNumero] = numero0;

        return arrayUsuario;

    }
}
