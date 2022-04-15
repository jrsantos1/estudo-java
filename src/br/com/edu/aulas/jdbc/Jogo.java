package br.com.edu.aulas.jdbc;

import java.sql.SQLException;
import java.util.*;

public class Jogo {
    public void jogar() throws SQLException {
    ConsultarQuestoes cq = new ConsultarQuestoes();
    List<Questoes> listaDequestoes = (ArrayList) cq.consulta();

    Collections.shuffle(listaDequestoes); // embaralhar questões

    int qtdQuestoes = listaDequestoes.size();
    int contador = 0;
    Scanner sc = new Scanner(System.in);
    int pontuacao = 0;

    while(contador < qtdQuestoes){

        String questao = listaDequestoes.get(contador).getQuestao();
        String primeiraAlternativa = listaDequestoes.get(contador).getPrimeiraAlternativa();
        String segundaAlternativa = listaDequestoes.get(contador).getSegundaAlternativa();
        String terceiraAlternativa = listaDequestoes.get(contador).getTerceiraAlternativa();
        String quartaAlternativa = listaDequestoes.get(contador).getQuartaAlternativa();

        System.out.println(contador + 1 + " " + questao);
        System.out.println("A)"+ primeiraAlternativa);
        System.out.println("B)"+ segundaAlternativa);
        System.out.println("C)"+ terceiraAlternativa);
        System.out.println("D)"+ quartaAlternativa);

        String alternativaCorreta = listaDequestoes.get(contador).getAlternativaCorreta();

        System.out.println("A alternativa correta é " + alternativaCorreta);

        System.out.print("Digite a respota: ");



        for(int i = 1; i < 4; i++){
            String resposta = sc.nextLine();

            switch (resposta.toUpperCase()){
                case "A":
                    resposta = primeiraAlternativa;
                    break;
                case "B":
                    resposta = segundaAlternativa;
                    break;
                case "C":
                    resposta = terceiraAlternativa;
                    break;
                case "D":
                    resposta = quartaAlternativa;
                    break;
            }
            if(resposta.equalsIgnoreCase(alternativaCorreta)){
                if(i == 1){
                    pontuacao += 10;
                    i = 4;
                }
                if(i == 2){
                    pontuacao += 8;
                    i = 4;
                }
                if(i == 3){
                    pontuacao += 5;
                    i = 4;
                }
            }else {
                System.out.print("Tente novamente: ");
            }
            System.out.println(pontuacao);
        }

        contador++;
    }
        System.out.println("Sua pontuação final foi de " + pontuacao);

    }
}
