package br.com.edu.aulas.generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.aguardar(2.3);
        //gera erro
        Integer coisa = (Integer) caixaA.abrir();

    }


}
