package br.com.edu.senac.ap02.exercicios_em_sala.exercicio_em_sala_1;

import java.util.Scanner;

public class JogoDaVelha {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String jogadorX = "x";
        String jogadorO = "o";
        run(jogadorX, jogadorO);
    }
    public static void run(String jogadorX, String jogadorY){
        String[][] vetor = criarVetor();
        boolean jogar = true;
        String jogador = jogadorX;
        while(jogar){
            imprimirVetor(vetor);
            jogador = quemJogar(jogador);
            System.out.println("É sua vez: " + jogador);
            vetor = jogada(vetor, jogador);
            if(verificaSeHaVencedor(vetor)){
                System.out.println("O vencedor é: " + jogador);
                jogar = false;
            }
        }
    }
    private static boolean verificaSeHaVencedor(String[][] vetor) {
        if(
        vetor[0][0].equalsIgnoreCase(vetor[0][1]) && vetor[0][1].equalsIgnoreCase(vetor[0][2]) && !vetor[0][2].equalsIgnoreCase(" * ") ||
        vetor[1][0].equalsIgnoreCase(vetor[1][1]) && vetor[1][1].equalsIgnoreCase(vetor[1][2]) && !vetor[1][2].equalsIgnoreCase(" * ") ||
        vetor[2][0].equalsIgnoreCase(vetor[2][1]) && vetor[2][1].equalsIgnoreCase(vetor[2][2]) && !vetor[2][2].equalsIgnoreCase(" * ") ||
        vetor[0][0].equalsIgnoreCase(vetor[1][0]) && vetor[2][0].equalsIgnoreCase(vetor[1][0]) && !vetor[1][0].equalsIgnoreCase(" * ") ||
        vetor[0][1].equalsIgnoreCase(vetor[1][1]) && vetor[2][1].equalsIgnoreCase(vetor[1][1]) && !vetor[1][1].equalsIgnoreCase(" * ") ||
        vetor[0][2].equalsIgnoreCase(vetor[1][2]) && vetor[2][2].equalsIgnoreCase(vetor[1][2]) && !vetor[1][2].equalsIgnoreCase(" * ") ||
        vetor[1][1].equalsIgnoreCase(vetor[0][0]) && vetor[2][2].equalsIgnoreCase(vetor[0][0]) && !vetor[0][0].equalsIgnoreCase(" * ") ||
        vetor[1][1].equalsIgnoreCase(vetor[0][2]) && vetor[2][0].equalsIgnoreCase(vetor[0][2]) && !vetor[0][2].equalsIgnoreCase(" * ")

        ){
            return true;
        }else{
            return false;
        }
    }
    private static String quemJogar(String jogador) {
        if (jogador.equalsIgnoreCase("x")){
            return "o";
        }else {
            return "x";
        }
    }
    private static String[][] jogada(String[][] vetor, String jogador) {
        System.out.println(" Escolha sua jogada em linha e coluna: ");
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < 2; i++) {
            if (i == 0){
                System.out.print("Linha: ");
                linha = sc.nextInt() - 1 ;
            }else {
                System.out.print("Coluna: ");
                coluna = sc.nextInt() - 1;
            }
        }
        vetor[linha][coluna] = " " + jogador + " ";
        return  vetor;
    }
    private static String[][] criarVetor() {
        String[][] vetor = new String[3][3];

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                vetor[i][j] = " * ";
            }
        }
        return vetor;
    }
    private static void imprimirVetor(String[][] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[i][j]);
            }
            System.out.println();
        }
    }
}
