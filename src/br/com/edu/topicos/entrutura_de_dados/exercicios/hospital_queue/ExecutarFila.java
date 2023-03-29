package br.com.edu.topicos.entrutura_de_dados.exercicios.hospital_queue;

import br.com.edu.topicos.generics.Caixa;

import java.util.Scanner;

public class ExecutarFila {
    public static void main(String[] args) {

        HospitalQueueManagement hospitalQueueManagement = new HospitalQueueManagement();
        boolean continuar = true;
        int opcaoUsuarioPreferencial =0;
        Scanner sc = new Scanner(System.in);

            while (continuar){
                int opcaoUsuario = Menu.run(sc);

                if (opcaoUsuario == 1){
                    System.out.println("É preferêncial. \n1. Sim.\n2. Não.");
                        opcaoUsuarioPreferencial = sc.nextInt();
                        boolean preferencial = opcaoUsuarioPreferencial == 1? true: false;
                        String senhaGerada = hospitalQueueManagement.getPassword(preferencial);
                        System.out.println("Senha gerada: " + senhaGerada);
                } else if (opcaoUsuario == 2) {
                    hospitalQueueManagement.next();
                }else if (opcaoUsuario == 3) {
                    hospitalQueueManagement.drawBoard();
                } else if (opcaoUsuario == 0) {
                    continuar = false;
                    break;
                
            }
        }


    }

}
