package br.com.edu.aulas.fundamentos.modificadores;

public class AtributoPrivado {
    private String nome = "jhonatan";

    public static void main(String[] args) {
        AtributoPrivado ap = new AtributoPrivado();
        System.out.println(ap.nome);
    }
}
