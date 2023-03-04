package br.com.edu.topicos.novidades_java_9_a_14.reactive_streams;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NotaFiscal> notasFiscais = List.of(
                new NotaFiscal("Jhonatan", 5000.00, LocalDate.now()),
                new NotaFiscal("Joaquin", 3000.00, LocalDate.now()),
                new NotaFiscal("Pedro", 5880.00, LocalDate.now())

        );

        NotaFiscalWSClient processaNota = new NotaFiscalWSClient();


        notasFiscais.forEach(nf -> {
            processaNota.enviar(nf);
            System.out.println("Parabéns pela compra efetuada!");
        });


    }
}
