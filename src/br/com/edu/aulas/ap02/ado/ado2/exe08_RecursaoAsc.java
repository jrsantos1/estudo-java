package br.com.edu.aulas.ap02.ado.ado2;

import java.util.Scanner;

public class exe08_RecursaoAsc {

    //static int cont = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o número incial");
        int num = sc.nextInt();

        System.out.println("Digite o número final");
        int numFinal = sc.nextInt();

        int resultado = decresc(num, numFinal);

        System.out.println("A soma de 1 até " + numFinal + " é: " + resultado);
    }
    private static int decresc(int num, int numFinal) {
        if (num >= numFinal){
            System.out.println(numFinal);
            return 1;
        }
        System.out.println(num);
        num++;
        return num + decresc(num, numFinal);
    }
}
