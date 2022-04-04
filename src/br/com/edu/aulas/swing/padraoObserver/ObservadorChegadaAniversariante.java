package br.com.edu.aulas.swing.padraoObserver;

import br.com.edu.aulas.swing.padraoObserver.EventoChegadaAniversariante;

@FunctionalInterface

public interface ObservadorChegadaAniversariante {

    public void chegou(EventoChegadaAniversariante evento);

}
