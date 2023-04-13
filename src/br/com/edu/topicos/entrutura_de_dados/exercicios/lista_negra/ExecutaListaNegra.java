package br.com.edu.topicos.entrutura_de_dados.exercicios.lista_negra;

public class ExecutaListaNegra {
    public static void main(String[] args) {

        // iniciando lista

        ListaNegra<PessoaLista> listaNegra = new ListaNegra<>(50);

        // criando elementos 

        PessoaLista jhonatan = new PessoaLista("Jhonatan", "briga");
        PessoaLista marcos = new PessoaLista("Marcos", "dívida");
        PessoaLista francisco = new PessoaLista("Francisco", "motivo");
        PessoaLista rochelle = new PessoaLista("rochelle", "separação");


        listaNegra.add(rochelle);
        listaNegra.add(jhonatan);
        listaNegra.add(francisco);
        listaNegra.add(marcos);

        // size

        System.out.println(listaNegra.len());

        listaNegra.exists(jhonatan);

        listaNegra.remove(francisco);

        listaNegra.isEmpty();

        System.out.println(listaNegra);
        
    }
}
