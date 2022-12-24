package br.com.edu.help_murilo.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean rodar = true;
        Scanner sc = new Scanner(System.in);
        Enfileirar enfileirar = new Enfileirar();

        while(rodar){
            menu();
            int opcaoAluno = sc.nextInt();

            switch (opcaoAluno){
                case 1:
                    System.out.print("Aluno: ");
                    String aluno = sc.next();

                    System.out.print("Altura: ");
                    String altura = sc.next();

                    Aluno novoAluno = new Aluno();
                    novoAluno.setNome(aluno);
                    novoAluno.setAltura(Double.parseDouble(altura));

                    enfileirar.enfileirar(novoAluno);
                    break;
                case 2:
                    enfileirar.mostrarLista();
                    break;
                case 0:
                    rodar = false;
                    break;
                default:
                    System.out.println("Inválido");
            }
        }
    }
    public static void menu(){
        System.out.println("1. Novo aluno chegou");
        System.out.println("2. Ver Fila");
        System.out.println("0. Sair");
    }
}
