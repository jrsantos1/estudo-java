package br.com.edu.topicos.generics;

public class Testes {

    public static void main(String[] args) {
        CaixaInt caixaInt = new CaixaInt();
        caixaInt.guardar(1);
        System.out.println(caixaInt.setObj());
    }
}
