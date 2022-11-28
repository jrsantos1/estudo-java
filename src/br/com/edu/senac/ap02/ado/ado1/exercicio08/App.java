package br.com.edu.senac.ap02.ado.ado1.exercicio08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira cor: ");
        String primeiraCor = sc.next().toUpperCase();

        System.out.print("Digite a segunda cor: ");
        String segundaCor = sc.next().toUpperCase();

        if(ehPrimaria(primeiraCor) && ehPrimaria(segundaCor)){
            String corRetorno = combinacaoCore(primeiraCor, segundaCor);
            System.out.println(corRetorno);
        }else {
            System.out.println("Só são aceitas cores primárias");
        }
    }
    private static String combinacaoCore(String primeiraCor, String segundaCor) {
        Map<String, String> combinacaoCores = new HashMap<>();
        combinacaoCores.put("VERMELHO AMARELO", "LARANJA");
        combinacaoCores.put("AZUL VERMELHO", "VIOLETA");
        combinacaoCores.put("AMARELO AZUL", "VERDE");

        if (combinacaoCores.get(primeiraCor + " " + segundaCor) == null){
           return combinacaoCores.get(segundaCor + " " + primeiraCor);
        }else{
            return combinacaoCores.get(primeiraCor + " " + segundaCor);
        }
    }
    private static Boolean ehPrimaria(String primeiraCor) {
        Map<String, Integer> tiposCores = new HashMap<>();
        tiposCores.put("VERMELHO", 1);
        tiposCores.put("AMARELO", 1);
        tiposCores.put("AZUL", 1);
        tiposCores.put("LARANJA", 2);
        tiposCores.put("VIOLETA", 2);
        tiposCores.put("VERDE", 2);

        if(tiposCores.get(primeiraCor) == 1){
            return true;
        }else{
            return false;
        }

    }
}
