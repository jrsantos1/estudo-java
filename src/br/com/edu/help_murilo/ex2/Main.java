package br.com.edu.help_murilo.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean rodar = true;
        Scanner sc = new Scanner(System.in);
        Totem totem = new Totem();
        while(rodar){
            menu();
            int opcaoAluno = sc.nextInt();
            int numeroPedido = 0;

            switch (opcaoAluno){
                case 1:
                    System.out.print("Número do pedido: ");
                    numeroPedido = sc.nextInt();
                    totem.addPreparando(numeroPedido);
                    break;
                case 2:
                    System.out.print("Número do pedido: ");
                    numeroPedido = sc.nextInt();
                    totem.addPronto(numeroPedido);
                    break;
                case 3:
                    System.out.print("Número do pedido: ");
                    numeroPedido = sc.nextInt();
                    totem.addRetirado(numeroPedido);
                    break;
                case 4:
                    totem.listar();
                    break;
                case 0:
                    rodar = false;
                    break;
                default:
                    System.out.println("Erro");
            }
        }
    }
    public static void menu(){
        System.out.println("1. Preparando");
        System.out.println("2. Pronto");
        System.out.println("3. Retirado");
        System.out.println("4. Listar");
        System.out.println("0. Sair");
    }
}
