package br.com.edu.aulas.fundamentos.Matrizes;

public class Matriz {
    public static void exercicioMatriz1() {

        int[][] numeros = {{1,2,3,4,5}, {6,7,8,9,10}};
        for(int i = 0; i < numeros.length; i++){
            for(int x = 0; x < numeros[i].length; x++){
                System.out.println(numeros[i][x]);
            }
        }

    }
}
