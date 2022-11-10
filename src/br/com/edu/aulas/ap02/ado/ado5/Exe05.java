package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exe05 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Informe o filtro: ");
        int valorUsuario = sc.nextInt();
        run(valorUsuario);


    }
    private static void run(int valorUsuario) {
        int[] array = new int[10];
        int[] aux = new int[10];
        int cont = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(99);
            array[i] = a;
            if (a > valorUsuario){
                aux[cont++] = a;
            }
            System.out.print(a + " ");
        }
        System.out.println("");

        int[] arrayReduzido = new int[cont];

        for (int i = 0; i < arrayReduzido.length; i++) {
            arrayReduzido[i] = aux[i];
        }

        System.out.println("O valores maiores que " + valorUsuario + " são: ");
        System.out.println(Arrays.toString(arrayReduzido));

    }
}
