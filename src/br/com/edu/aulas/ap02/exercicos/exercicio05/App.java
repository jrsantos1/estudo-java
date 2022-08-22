package br.com.edu.aulas.ap02.exercicos.exercicio05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorMensalidade = 0.0;

        // Criando mensalidade dos cursos
        Map<String, Double> mensalidadeCursos = new HashMap<>();
        mensalidadeCursos.put("SI", 550.0);
        mensalidadeCursos.put("ADS", 750.0);
        mensalidadeCursos.put("CS", 1150.0);
        mensalidadeCursos.put("EC", 1300.0);
        mensalidadeCursos.put("ES", 950.0);

        // Seleção do curso do usuario
        System.out.println("Digita a Sigla do seu curso(SI, ADS, CS, EC, ES): ");
        String cursoAluno = sc.next().toUpperCase();
        if (mensalidadeCursos.get(cursoAluno) == null) {
            while (mensalidadeCursos.get(cursoAluno) == null) {
                System.out.print("Digita a Sigla do seu curso correto: ");
                cursoAluno = sc.next().toUpperCase();
            }
        }

        // Criando tipos de desconto
        Map<String, Float> tipoDesconto = new HashMap<>();
        tipoDesconto.put("COMERCIO", 0.2f);
        tipoDesconto.put("ENSINOMEDIO", 0.5f);
        tipoDesconto.put("ISENTO", 0.0f);


        // Seleção do tipo de desconto do usuário
        System.out.print("Digita o tipo de desconto(Comercio, EnsinoMedio ou Isento)");
        String descontoCurso = sc.next().toUpperCase();

        if (tipoDesconto.get(descontoCurso) == null) {
            while (tipoDesconto.get(descontoCurso) == null) {
                System.out.print("Digita o tipo de desconto correto, ou se é isento: ");
                descontoCurso = sc.next().toUpperCase();
                if (descontoCurso.equalsIgnoreCase("ISENTO")){
                    valorMensalidade = 0;
                }else{
                    valorMensalidade = mensalidadeCursos.get(cursoAluno);
                }
            }
        }
        System.out.printf("O valor final da mensalidade é: %.2f%n", valorMensalidade * (1 - tipoDesconto.get(descontoCurso)));

    }

}
