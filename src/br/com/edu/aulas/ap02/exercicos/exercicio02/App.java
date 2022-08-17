package br.com.edu.aulas.ap02.exercicos.exercicio02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcaoUsuario = "";
        Integrante novoIntegrante;

        System.out.print("Digite o nome/apelido da Familia");
        String nomeFamilia = sc.next();
        Familia novaFamilia = new Familia(nomeFamilia);

        while(!opcaoUsuario.equalsIgnoreCase("não")){

            System.out.print("Digite sim para adicionar um novo integrante a familia, ou não, para sair ");
            opcaoUsuario = sc.next();

          if(opcaoUsuario.equalsIgnoreCase("sim")){
                System.out.print("Digite o nome do integrante: ");
                String nomeIntegrante = sc.next();
                System.out.print("Digite o orçamento do integrante: ");
                float orcamentoIntegrante = sc.nextFloat();
                novoIntegrante = new Integrante(nomeIntegrante, orcamentoIntegrante);
                novaFamilia.setIntegrante(novoIntegrante);

            }
        }
//        Integrante integrante = new Integrante("Jhonatan", 2000);
//        Integrante integrante2 = new Integrante("Luis", 2500);
//        Integrante integrante3 = new Integrante("Marcola", 5000);
//        Familia ribeiro = new Familia("Ribeiro");
//        ribeiro.setIntegrante(integrante);
//        ribeiro.setIntegrante(integrante2);
//        ribeiro.setIntegrante(integrante3);

        System.out.println("Família: " + novaFamilia.getApelidoFamilia() + ". Quantidade de integrantes: " + novaFamilia.getQtdIntegrantes() + ". Orçamento total: " + novaFamilia.getOrcamento());
    }

}
