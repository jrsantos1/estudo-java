package br.com.edu.aulas.ap02.exercicos.exercicio01_semaforo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String opcaoDoUsuario = "";

        Semaforo semaforo = new Semaforo();
        Scanner sc = new Scanner(System.in);

        while(!opcaoDoUsuario.equalsIgnoreCase("Verde")) {

            System.out.println("Qual a cor do semáforo");
            opcaoDoUsuario = sc.next();
            semaforo.setStatusSemaforo(opcaoDoUsuario);
            semaforo.getAcao();
        }
        
        }

    }

