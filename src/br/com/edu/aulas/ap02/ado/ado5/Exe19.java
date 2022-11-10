package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exe19 {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o valor desejado: ");
        int valorUsuario = sc.nextInt();
        int[] randVetorRandom = gerarVetor();
        String resultado = gerarResultado(valorUsuario, randVetorRandom);
        System.out.println(resultado);
    }
    private static String gerarResultado(int valorUsuario, int[] randVetorRandom) {
        for (int i = 0; i < randVetorRandom.length; i++) {
            for (int j = 0; j < randVetorRandom.length; j++) {
                for (int h = 0; h < randVetorRandom.length; h++) {
                    if (randVetorRandom[i] + randVetorRandom[h] + randVetorRandom[j] == valorUsuario && i != j & h != i && h != j){
                        int[] vetorFinal = {randVetorRandom[i],randVetorRandom[h],randVetorRandom[j]};
                        return "Os itens que resultaram na soma são:  " + vetorFinal[0] + " " + vetorFinal[1] + " " + vetorFinal[2];
                    }
                }
            }
        }
        return "Não foram encontrados itens para a soma";
    }
    private static int[] gerarVetor() {
        int[] vetor = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            int novoValor = random.nextInt(11);
            vetor[i] = novoValor;
        }
        System.out.println(Arrays.toString(vetor));
        return vetor;
    }
}
