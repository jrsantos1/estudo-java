package br.com.edu.aulas.ap02.ado1.exercicio02;
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
                System.out.print("Digite o total de gastos do integrante: ");
                float gastosIntegrante = sc.nextFloat();
                novoIntegrante = new Integrante(nomeIntegrante, orcamentoIntegrante, gastosIntegrante);
                novaFamilia.setIntegrante(novoIntegrante);
            }
        }
        System.out.println("Você está: " + novaFamilia.situacaoOcamento());
    }

}
