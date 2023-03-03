package br.com.edu;

public class Testes {
    public static void main(String[] args) {

        int num1 = 12;
        System.out.println(num1%10);
    }
}
//public class BuscaBinariaRecursiva {
//
//    public static int buscaBinaria(int[] arr, int x, int inicio, int fim) {
//        if (inicio > fim) {
//            return -1; // caso base, elemento não encontrado
//        }
//
//        int meio = (inicio + fim) / 2;
//
//        if (arr[meio] == x) {
//            return meio; // caso base, elemento encontrado
//        } else if (arr[meio] > x) {
//            // busca na metade esquerda do array
//            return buscaBinaria(arr, x, inicio, meio - 1);
//        } else {
//            // busca na metade direita do array
//            return buscaBinaria(arr, x, meio + 1, fim);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
//    }
//}