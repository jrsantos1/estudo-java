package br.com.edu.senac.ap02.ado.ado5;

import java.util.Random;
import java.util.Scanner;

public class Exe10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite os 5 primeiros números");
        int[] numerosUsuario = gerarNumerosUsuario();
        int[] numerosAleatorios = gerarNumerosAleatorios();
        int[] novoArray = gerarNovoArray(numerosUsuario, numerosAleatorios);
        int maiorNumero = verifiarMaiorNumero(novoArray);

        imprimirResultado(novoArray, maiorNumero);
    }
    private static void imprimirResultado(int[] novoArray, int maiorNumero) {
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + novoArray[i]);
        }
        System.out.println(": O maior número é: " + maiorNumero);
    }
    private static int[] gerarNovoArray(int[] numerosUsuario, int[] numerosAleatorios) {
        int[] novoArray = new int[10];

        for (int i = 0; i < 10; i++) {
            if (i < 5){
                novoArray[i] = numerosUsuario[i];
            }else{
                novoArray[i] = numerosAleatorios[i - 5];
            }
        }
        return novoArray;
    }
    private static int verifiarMaiorNumero(int[] numerosUsuario) {

        int novoMaiorNumero = 0;
        int segundoMaiorNumero = 0;

        for (int i = 0; i < numerosUsuario.length ; i++) {
            if (numerosUsuario[i] >= novoMaiorNumero){
                segundoMaiorNumero = novoMaiorNumero;
                novoMaiorNumero = numerosUsuario[i];
            }
        }
        return novoMaiorNumero * segundoMaiorNumero;
    }
    private static int[] gerarNumerosAleatorios() {
        Random random = new Random();
        int[] numerosAleatorios = new int[5];
        for (int i = 0; i < 5; i++) {
            numerosAleatorios[i] = random.nextInt(11);
        }
        return numerosAleatorios;
    }
    private static int[] gerarNumerosUsuario() {
        int[] numerosUsuario = new int[5];

        for (int i = 0; i < 5; i++) {
            numerosUsuario[i] = sc.nextInt(); // entrada usuário
        }
        return numerosUsuario;
    }
}
