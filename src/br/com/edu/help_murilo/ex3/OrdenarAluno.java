package br.com.edu.help_murilo.ex3;

import java.util.Comparator;

public class OrdenarAluno implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        if (o1.getAltura() > o2.getAltura()){
            return -1;
        } else if (o1.getAltura() < o2.getAltura()) {
            return 1;
        }else{
            return 0;
        }
    }
}
