package br.com.edu.topicos.api_datas.desafios.contador;
import java.util.Scanner;
public class Contador {

    private double initial;
    private int finall;
    Scanner sc = new Scanner(System.in);
    Contador(){
        this.initial = System.currentTimeMillis();
    }

    public void run(){
        String option = "";
        while (!option.equalsIgnoreCase("sim")){
            System.out.println("Do you want leave?: ");
            option = (String) sc.nextLine();
        }
        int end = (int) Math.round((System.currentTimeMillis() - initial)/1000);
        System.out.println(end);
    }
}
