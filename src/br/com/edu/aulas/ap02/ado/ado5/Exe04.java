package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exe04 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Informe o valor desejado: ");
        int inputUsuario = sc.nextInt();
        int valor = run(inputUsuario);

        if (valor == -1){
            System.out.println(".O valor não está contigo no array random");
        }else{
            System.out.println(".O valor está na posição: " + valor);
        }

    }

    private static int run(int inputUsuario) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(99);
            array[i] = a;
            System.out.print(a + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] == inputUsuario){
                return i;
            }
        }
        return -1;

    }
}
