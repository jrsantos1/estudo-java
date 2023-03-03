package br.com.edu.topicos.entrutura_de_dados.estatica;

public class Main {
    public static void main(String[] args) {

        Aluno jhonatan = new Aluno("jhonatan", 24, "000001");
        Aluno pedro = new Aluno("pedro", 22, "000002");
        Aluno murilo = new Aluno("murilo", 23, "000003");
        Aluno matheus = new Aluno("matheus", 23, "000004");
        Aluno julio = new Aluno("julio", 45, "000005");

        Lista<Aluno> alunos = new Lista<>();


        // adiciona na posição 0
        alunos.adiciona(jhonatan);

        // adiciona na posição 1
        alunos.adiciona(pedro);

        // adiciona na posição 2
        alunos.adiciona(murilo);

        // adiciona na posição 3
        alunos.adiciona(matheus);

       // remove aluno da posicao 0
        alunos.remover(0);

        // adiciona aluno na posicao 2
        alunos.adiciona(2, julio);

        // verificar se posicao esta ocupada
        alunos.posicaoOcupada(4);

        // verifica se aluno está presente
        alunos.contem(jhonatan);

        // fim


    }
}
