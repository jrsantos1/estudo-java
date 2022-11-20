package br.com.edu.aulas.contadorDeSegundos;
import java.util.Scanner;
public class Contador {

    private double initial;
    private int finall;
    Scanner sc = new Scanner(System.in);
    Contador(){
        this.initial = System.currentTimeMillis();
    }

    public void run(){
        String opcao = "";
        while (!opcao.equalsIgnoreCase("sim")){
            System.out.println("Deseja sair: ");
            opcao = (String) sc.nextLine();
        }
        finall = (int) Math.round((System.currentTimeMillis() - initial)/1000);
        System.out.println(finall);
    }
}
