package br.com.edu.topicos.novidades_java_9_a_14.reactive_streams;

import java.time.LocalDate;
import java.util.Locale;

public class NotaFiscal {
    private String nome;
    @SuppressWarnings("unused")
    private Double valor;
    private LocalDate data;

    public NotaFiscal(String nome, Double valor, LocalDate data) {
        this.nome = nome;
        this.valor = valor;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
