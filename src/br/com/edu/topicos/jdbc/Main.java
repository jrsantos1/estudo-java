package br.com.edu.topicos.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Tela de Login \n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        Opcoes opcao = new Opcoes();
        int opcaoEscolhida = opcao.exibir();

        System.out.println("Chegou aqui");



        switch (opcaoEscolhida){
            case 1:
                Jogo jogo = new Jogo();
                jogo.jogar();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.println("A opção escolhida foi 4");
                break;
        }
    }
}
