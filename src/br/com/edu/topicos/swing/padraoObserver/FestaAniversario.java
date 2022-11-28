package br.com.edu.topicos.swing.padraoObserver;

public class FestaAniversario {
    public static void main(String[] args) {
        //Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        //porteiro.registraObservador(namorada);

        porteiro.registraObservador((o) -> System.out.println("Feliz aniversário Caraiu!" + "ocorreu em " + o.getMomento()));

        porteiro.monitorar();
    }
}
