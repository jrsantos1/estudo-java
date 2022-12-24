package br.com.edu.help_murilo.ex3;

import java.util.Collections;
import java.util.LinkedList;

public class Enfileirar {
    LinkedList<Aluno> alunos = new LinkedList<>();

    public void enfileirar(Aluno aluno){

        String nome = aluno.getNome();
        String altura = String.valueOf(aluno.getAltura());
        String join = nome + " - " + altura;
        alunos.add(aluno);
    }

    public void mostrarLista(){
        OrdenarAluno orderByTall = new OrdenarAluno();
        Collections.sort(alunos, orderByTall);
        for(Aluno aluno: alunos){
            System.out.println(aluno.getAltura() + " - " + aluno.getNome());
        }
    }
}
