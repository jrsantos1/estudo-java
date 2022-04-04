package br.com.edu.aulas.swing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    private List<ObservadorChegadaAniversariante> observador = new ArrayList<>();

    public void registraObservador(ObservadorChegadaAniversariante o){
        this.observador.add(o);
    }

     public void monitorar(){
         Scanner sc = new Scanner(System.in);

         String valor = "";

         while (!valor.equalsIgnoreCase("Sair")){
             System.out.println("Aniversariante chegou");
             valor = sc.nextLine();

             if(valor.equalsIgnoreCase("sim")){
                 // criar o evento

                 EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                observador.stream().forEach(o -> o.chegou(evento));

                valor = "sair";

             }else{

             }
         }
     }

}
