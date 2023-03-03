package br.com.edu.topicos.ordenacao;

public class MergeSort {
    public static int[] mergeSort(int[] arr){
        if (arr == null || arr.length < 1)
            return null;

        int[] temp = new int[arr.length];
        mergeSortHelper(arr, temp, 0, arr.length - 1);
        return arr;
    }
    public static void mergeSortHelper(int[] arr, int[] temp, int left, int right){
        if (left >= right)
            return;
        int mid = left + (right - left) / 2;
        mergeSortHelper(arr, temp, left, mid);
        mergeSortHelper(arr, temp, mid + 1, right);
        merge(arr, temp, left, mid, right);
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right){
        for (int i = left; i <= right ; i++) {
            temp[i] = arr[i];
        }
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right){
            if (temp[i] <= temp[j]){
                arr[k++] = temp[i++];
            }else{
                arr[k++] = temp[j++];
            }
        }
        while (i <= mid){
            arr[k++] = temp[i++];
        }
    }
}
