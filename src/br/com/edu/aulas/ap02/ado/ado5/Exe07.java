package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exe07 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Informe os números: ");
        int[] vetorUsuario = vetorUsuario(sc);
        int[] vetorAleatorio = run();
        int[] novoVetor = gerarNovoVetor(vetorAleatorio, vetorUsuario);

        System.out.println(Arrays.toString(vetorUsuario));
        System.out.println(Arrays.toString(vetorAleatorio));
        System.out.println(Arrays.toString(novoVetor));

    }
    private static int[] gerarNovoVetor(int[] vetorAleatorio, int[] vetorUsuario) {
        int[] novoVetor = new int[vetorAleatorio.length + vetorUsuario.length];
        for (int i = 0; i < novoVetor.length; i++) {
            if(i < 10){
                novoVetor[i] = vetorAleatorio[i];
               // System.out.print(i + " ");
            }else {
                novoVetor[i] = vetorUsuario[i-vetorAleatorio.length];
            }
        }
        System.out.println("");
        return novoVetor;
    }
    private static int[] vetorUsuario(Scanner sc) {
        int[] vetorUsuario = new int[5];
        for (int i = 0; i < vetorUsuario.length;i++) {
            vetorUsuario[i] = sc.nextInt();
        }
        return vetorUsuario;
    }
    private static int[] run() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int a = random.nextInt(99);
            array[i] = a;
        }
       return array;
    }
}
