package br.com.edu.topicos.generics;

import java.util.Objects;

public class GenericsPar<C extends Number, V> {
    private C chave;
    private V valor;

    public GenericsPar(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericsPar)) return false;
        GenericsPar<?, ?> that = (GenericsPar<?, ?>) o;
        return Objects.equals(chave, that.chave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave);
    }

    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }
}
