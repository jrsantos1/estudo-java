package br.com.edu.senac.ap02.exercicios_em_sala.exercicio_em_sala_1;

import java.util.Scanner;

public class ExercicioDoCafe {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o numero de alunos: ");
        float numeroDeEstudantes = sc.nextFloat();
        System.out.print("Quanto litros por vez pode preparar: ");
        float litrosPorVez = sc.nextFloat();
        System.out.print("Quanto bebe cada estudante por vez em mililitros: ");
        float quantidadeCadaAlunoBebe = sc.nextFloat();

        run(numeroDeEstudantes, litrosPorVez, quantidadeCadaAlunoBebe);
    }
    private static void run(float numeroDeEstudantes, float litrosPorVez, float quantidadeCadaAlunoBebe) {

        float litrosNecessario = numeroDeEstudantes * quantidadeCadaAlunoBebe / 1000;
        System.out.println(litrosNecessario);

        if (litrosNecessario % litrosPorVez == 0){
            System.out.print("A quantidade necessária é: " + litrosNecessario);
        }else{
            System.out.print("A quantidade necessária é: " + (litrosPorVez * 2));
        }
    }
}
