package br.com.edu.topicos.ordenacao;

public class Main {
    public static void main(String[] args) {
        int[] mergeSortListTest = {1,4,5,34,5,50,10};

        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.mergeSort(mergeSortListTest);

        for (int n: result) {
            System.out.println(n);
        }

    }
}
