package br.com.edu.topicos.entrutura_de_dados.exercicios.hospital_queue;
import java.util.Scanner;

public class Menu {

    //private static ArrayList<Integer> opcoesMenu = (ArrayList<Integer>) Arrays.asList(0,1,2,3);

    public static int run(Scanner sc){
        System.out.println("\n1. Retirar nova senha. \n2. Próximo. \n3. Exibir Quadro. \n0. Sair.");

        int opcaoUsuarioMenu = 0;
            System.out.print("\nDigite a opção desejada: ");
            opcaoUsuarioMenu = sc.nextInt();

            if ((opcaoUsuarioMenu != 0 && opcaoUsuarioMenu != 1 && opcaoUsuarioMenu != 2 && opcaoUsuarioMenu != 3)) {
                throw new IllegalArgumentException("Valor inválido");
            }
        return opcaoUsuarioMenu;
    }
}
