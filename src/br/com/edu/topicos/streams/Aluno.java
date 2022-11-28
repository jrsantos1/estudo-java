package br.com.edu.topicos.streams;

import java.util.Objects;

public class Aluno {
    String nome;
    Double nota;
     

    public Aluno(String nome, Double nota){
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(nota, aluno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}
