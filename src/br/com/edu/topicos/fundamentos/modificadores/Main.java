package br.com.edu.topicos.fundamentos.modificadores;

public class Main {
    public static void main(String[] args) {
       FinalClass cs = new FinalClass();
        int pegaValor = cs.valor;
        System.out.println(pegaValor);

       // AtributoPrivado ap = new AtributoPrivado();
        //System.out.println(ap.nome);
        
        //FinalClass fc = new FinalClass(); // non pode
    }
}
