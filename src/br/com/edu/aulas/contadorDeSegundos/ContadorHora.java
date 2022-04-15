package br.com.edu.aulas.contadorDeSegundos;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class ContadorHora {

    private static LocalTime data;

    public static void run(){
        //LocalTime data2 = LocalTime.now();
        //ZonedDateTime zdt = ZonedDateTime.now();
        //Calendar calendar = Calendar.getInstance();
        //System.out.println(data2);
        //System.out.println(zdt);
        //System.out.println(calendar);
        Date dataHoraAtual = new Date();
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        System.out.println(hora);

    }


}
