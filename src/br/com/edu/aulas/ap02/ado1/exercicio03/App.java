package br.com.edu.aulas.ap02.ado1.exercicio03;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> diaSemana = new HashMap<>();
        diaSemana.put(0, "Domingo");
        diaSemana.put(1, "Segunda-Feira");
        diaSemana.put(2, "Terça-Feira");
        diaSemana.put(3, "Quarta-Feira");
        diaSemana.put(4, "Quinta-Feira");
        diaSemana.put(5, "Sexta-Feira");
        diaSemana.put(6, "Sábado");
        DayOfWeek data = LocalDateTime.now().getDayOfWeek();
        int diaSemanaNumero = data.getValue();

        System.out.print("Digite o dia semana que deseja buscar: ");
        int entradaUsuario = sc.nextInt();

        if (entradaUsuario < 0 || entradaUsuario > 6){
            System.out.println("O valor digitado não corresponde a um dia da semana");
        }else{
            System.out.println("O dia da semana digitado é: " + diaSemana.get(entradaUsuario));
            System.out.println("Hoje é: " + diaSemana.get(diaSemanaNumero));
        }
    }

}
