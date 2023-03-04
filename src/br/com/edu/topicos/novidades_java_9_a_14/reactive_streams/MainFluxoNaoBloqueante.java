package br.com.edu.topicos.novidades_java_9_a_14.reactive_streams;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

public class MainFluxoNaoBloqueante {
    public static void main(String[] args) {

        ExecutorService newThreadFixedPool = Executors.newFixedThreadPool(2);

        NotaFiscal primeiraNF = new NotaFiscal("Pedrao", 20.00, LocalDate.now());

        // produtor
        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>(newThreadFixedPool, 1);

        List<NotaFiscal> notasFiscais = List.of(
                new NotaFiscal("Jhonatan", 5000.00, LocalDate.now()),
                new NotaFiscal("Joaquin", 3000.00, LocalDate.now()),
                new NotaFiscal("Pedro", 5880.00, LocalDate.now())

        );

        // selecionar método que irá 'consumir' as notas fiscais
        NotaFiscalWSClient nfsws = new NotaFiscalWSClient();
        publisher.consume(nfsws::enviar);
        publisher.consume(data -> {

            System.out.println("Executando thread: " + Thread.currentThread().getName());
        });

        notasFiscais.forEach(nf -> {
            publisher.submit(nf);
        });



        System.out.println("Você irá receber a nota fiscal no seu e-mail");
        Scanner sc = new Scanner(System.in);
        sc.next();
        sc.close();
        publisher.close();
    }
}
