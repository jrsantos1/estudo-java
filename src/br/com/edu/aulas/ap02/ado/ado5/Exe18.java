package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe18 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite os números do vetor");
        int[] array1 = gerarVetorUsuario();
        System.out.println(Arrays.toString(array1));
        int[] vetorReduzido = getarVetorReduzido(array1);
        System.out.println(Arrays.toString(vetorReduzido));
    }
    private static int[] getarVetorReduzido(int[] array1) {
        int n = 0;
        boolean verifica = true;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array1[i] == array1[j] && i != j && array1[i] != 0)
                {
                    array1[j] = 0;
                    n++;
                }
            }
        }
        int[] vetorReduzido = new int[array1.length - n];
        int contadoraAux = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != 0){
                vetorReduzido[contadoraAux++] = array1[i];
            }
        }
        return vetorReduzido;
    }
    private static int[] gerarVetorUsuario() {
        int[] vetorUsuario = new int[5];
        for (int i = 0; i < vetorUsuario.length; i++) {
            vetorUsuario[i] = sc.nextInt();
        }
        return vetorUsuario;
    }
}
