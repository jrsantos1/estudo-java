package br.com.edu.topicos.orientacao_objeto.desafios.sorteio;

import java.util.Random;
import java.util.Scanner;

public class ExSorteio {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        Aleatorio aleatorio = new Aleatorio();
        int numeroGerado = aleatorio.gerarNumeroAleatorio(1000);

        int inicio = (int) System.currentTimeMillis();

        boolean valida = true;
        int contador = 0;
        while(valida){
            contador++;
            System.out.println("Digite um número entre 1 e 1000");
            int numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroGerado){
                System.out.println("Você acertou na " + contador + " tentativa");
                int fim = (int) System.currentTimeMillis();
                int tempoEmSegundo = (fim - inicio) / 1000;
                System.out.println("Você demorou " + tempoEmSegundo + " segundos!");
                valida = false;
            }else{
                System.out.println("errou, tente novamente \n dica...");
                if (numeroGerado > numeroUsuario){
                    System.out.println("O número é maior do que o digitado");
                    continue;
                }else{
                    System.out.println("O número digitado é menor do que o digitado");
                }

            }

        }



    }
}