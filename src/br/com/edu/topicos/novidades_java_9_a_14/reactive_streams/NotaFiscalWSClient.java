package br.com.edu.topicos.novidades_java_9_a_14.reactive_streams;

import br.com.edu.topicos.thread.ThreadExemplo;

public class NotaFiscalWSClient {
    public void enviar(NotaFiscal notaFiscal){
        try {
            System.out.println("Emitindo nota fiscal");
            Thread.sleep(5000);
            System.out.format("Nota fiscal emitida %nEm nome de %s %nNa data de %s %n", notaFiscal.getNome(), notaFiscal.getData());
            System.out.println("thead utlizada: " + Thread.currentThread().getName());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
