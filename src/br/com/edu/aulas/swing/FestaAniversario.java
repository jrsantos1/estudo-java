package br.com.edu.aulas.swing;

public class FestaAniversario {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registraObservador(namorada);
        porteiro.monitorar();
    }
}
