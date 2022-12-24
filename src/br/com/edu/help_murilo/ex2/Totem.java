package br.com.edu.help_murilo.ex2;

import java.util.ArrayList;

public class Totem {
    private ArrayList<Integer> preparando = new ArrayList<>();
    private ArrayList<Integer> pronto = new ArrayList<>();
    private ArrayList<Integer> retirar = new ArrayList<>();

    public void addPreparando(Integer numeroPedido){
        preparando.add(numeroPedido);
    }

    public void addPronto(Integer numeroPedido){
        for (int i = 0; i < preparando.size(); i++) {
            if (preparando.get(i) == numeroPedido){
                preparando.remove(i);
            }
        }

        pronto.add(numeroPedido);
    }

    public void addRetirado(Integer numeroPedido){
        for (int i = 0; i < pronto.size(); i++) {
            if (pronto.get(i) == numeroPedido){
                pronto.remove(i);
            }

            retirar.add(numeroPedido);
        }
    }

    public void listar(){
        System.out.print("Preparando: ");
        for(Integer i : preparando){
            System.out.print(i);
        }
        System.out.println();
        System.out.print("Pronto: ");
        for(Integer i : pronto){
            System.out.print(i);
        }
        System.out.println();
        System.out.print("Retirado: ");
        for(Integer i : retirar){
            System.out.print(i);
        }

        System.out.println();
    }

}
