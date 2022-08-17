package br.com.edu.alura.apiDatas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Testes {
    public static void main(String[] args){

        // data de agora

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        // data futura

        LocalDate copaDeCinteQuatro = LocalDate.of(2024, Month.DECEMBER, 3);

        int anos = copaDeCinteQuatro.getYear() - hoje.getYear();

        Period periodo = Period.between(hoje, copaDeCinteQuatro);

        System.out.println(periodo);

        DateTimeFormatter valorFormatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAtual = hoje.format(valorFormatado);
        System.out.println(dataAtual);
        LocalDateTime ldt = LocalDateTime.now();
        //
        System.out.println("fim");
        System.out.println(ldt);

        System.out.println("Zoned");

        ZonedDateTime agora = ZonedDateTime.now();
        System.out.println(agora);

    }

}
