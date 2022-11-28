package br.com.edu.processos_seletivos.testePagBank;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
