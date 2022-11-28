package br.com.edu.senac.ap02.ado.ado4;
import java.util.Scanner;
public class Exe10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para converter para binário: ");

        try {
            String numero = sc.next();
            converterInteiro(numero);
        }catch (Exception e){
            System.out.println("Ocorreu o erro: " + e.getMessage() + " durante a execução, tente novamente");
            Exe10.main(args);
        }
    }
    private static void converterInteiro(String texto) {

        for (int i = 0; i < texto.length(); i++) {
            int converterNumero = (int) texto.charAt(i);
            String binario = Integer.toBinaryString(converterNumero);
            System.out.print(binario + " ");
        }
    }
}
