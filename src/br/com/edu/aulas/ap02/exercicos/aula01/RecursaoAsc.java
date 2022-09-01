package br.com.edu.aulas.ap02.exercicos.aula01;

import java.util.Scanner;

public class RecursaoAsc {

    //static int cont = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o número incial");
        int num = sc.nextInt();

        System.out.println("Digite o número final");
        int numFinal = sc.nextInt();

        int resultado = decresc(num, numFinal);

        System.out.println("O resultado é: " + resultado);
    }
    private static int decresc(int num, int numFinal) {
        if (num >= numFinal){
            System.out.println(numFinal);
            return numFinal;
        }
        System.out.println(num);
        num++;
        return num + decresc(num, numFinal);
    }
}
