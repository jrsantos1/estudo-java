package br.com.edu.aulas.ap02.ado.ado5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exe06 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Informe o filtro: ");
        int valorUsuario = sc.nextInt();
        run(valorUsuario);
    }
    private static void run(int valorUsuario) {
        int[] array = new int[10];
        int[] novoArray = new int[11];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(99);
            array[i] = a;
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < novoArray.length; i++) {
            if (i < 10){
                novoArray[i] = array[i];
            }else{
                novoArray[i] = valorUsuario;
            }
        }
        System.out.println(Arrays.toString(novoArray));
    }
}
