package br.com.edu.topicos.recursividade.exercicios;

public class ExibirOrdemCrescente {
    public static void main(String[] args) {
        int resultado = run(1, 20);
        System.out.println("O resultado é: " + resultado);
    }

    public static int run(int start, int end ){

        if (start == end){
            System.out.println(end);
            return end;
        }

        System.out.println(start);

        return start + run(start+1, end);

    }

}
