package br.com.edu.topicos.entrutura_de_dados.estatica.vetor;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Lista<Aluno> alunos = new Lista<>();
        boolean valida = true;

        System.out.println("***** Lista de Alunos ");
        while(valida){

            try {

            System.out.println("Gostaria de adicionar algum aluno a lista? \n 1. Sim \n 2. Não\n");
            int userOption = sc.nextInt();


            if (userOption == 1){

                System.out.print("Digite o nome do aluno: ");
                String nome = sc.next();

                System.out.print("Digite a idade do aluno: ");
                int age = sc.nextInt();

                System.out.print("Digite a matrícula do aluno: ");
                String id = sc.next();

                alunos.adiciona(new Aluno(nome, age, id));

            }else {
                valida = false;
                System.out.println("\n \n Lista de alunos: ");
                System.out.println(alunos);


            }

            }catch (Exception e){
                e.printStackTrace();
            }

        }


    }
}
