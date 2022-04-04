package br.com.edu.aulas.swing.projetoCalculadora.modelo;

import com.sun.jdi.request.MonitorContendedEnteredRequest;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
    private static final Memoria instancia = new Memoria(); // criada a instancia como static para que seja acessada diretamente pela classe && utulizada o final para que não seja criado um metodo do tipo set

    private String textoAtual = "";

    private final List<MomeriaObervador> observador = new ArrayList<MomeriaObervador>();

    private Memoria() {} // deixando o construtor como private para termos somente uma instancia desta classe

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public static Memoria getInstance(){
        return instancia;
    }

    public void adicionarObervador(MomeriaObervador observer){
        observador.add(observer);
    }

    public void processarComando(String valor){
        textoAtual += valor;
        observador.forEach(o -> o.valorAlterado(textoAtual));
    }
}
