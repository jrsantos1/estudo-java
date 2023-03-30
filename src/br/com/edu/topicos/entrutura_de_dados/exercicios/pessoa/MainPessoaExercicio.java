package br.com.edu.topicos.entrutura_de_dados.exercicios.pessoa;

public class MainPessoaExercicio {

    public static void main(String[] args) {
        Pessoa jhoatan = new Pessoa("Jhonatan");
        Pessoa cleide = new Pessoa("Cleide");
        Pessoa maria = new Pessoa("Maria");
        Pessoa lica = new Pessoa("Lica");
        Pessoa francisca = new Pessoa("Francisca");

        jhoatan.setMae(cleide);
        cleide.setMae(maria);
        maria.setMae(lica);
        lica.setMae(francisca);

        String tataravo = jhoatan.getTataravo();
        System.out.println("O nome da tararavó é: "+ tataravo);

        System.out.println("\nLista de nomes: \n");
        jhoatan.printNames();

    }
}
