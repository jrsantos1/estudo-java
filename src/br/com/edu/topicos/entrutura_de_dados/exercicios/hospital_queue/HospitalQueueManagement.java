package br.com.edu.topicos.entrutura_de_dados.exercicios.hospital_queue;

import br.com.edu.topicos.orientacao_objeto.matematica.Mat;

public class HospitalQueueManagement {
    private String[] queue;
    private int last;
    private int next;


    public HospitalQueueManagement(){
        this.queue = new String[5];
        this.next = -1;
        this.last = 0;
    }

    public void verificaTamanhoFila(){
        if ((this.queue.length - this.last) < 2){
            String[] queueAux = new String[this.queue.length * 2];
            for (int i = 0; i <= last; i++) {
                queueAux[i] = queue[i];
            }
            this.queue = queueAux;
        }
    }

    public String getPassword(boolean preferencial){
        verificaTamanhoFila();
        String senha = Senha.gerarSenha(3, preferencial);
        if (preferencial){
            for (int i = 0; i <= this.last; i++) {
                if (i < this.last){
                if(this.queue[i].contains("P")){
                    continue;
                }
                else{
                    String temp = senha;
                    int posicao = i;
                    //this.queue[i] = senha;
                    for (int j = this.last; j > i; j--){
                        this.queue[j] = this.queue[j-1];
                    }
                    this.queue[i] = senha;
                    this.last++;
                    return senha;
                }
                }
                else {
                    this.queue[i] = senha;
                    this.last++;
                    return senha;
                }
            }
            return senha;
        }

        this.queue[last] = senha;
        this.last += 1;
        
        return senha;
    }

    public void next(){
        if(isEmpty()){
            System.out.println("\nA lista está vazia");
        }
        else{
        if(this.queue[next + 1] == null){
            System.out.println("\nNão há próximo na fila");
        }else{
        this.next += 1;
        System.out.println("O próximo na fila é: " + queue[this.next]);
        //drawBoard();
        }}
    }

    public boolean isEmpty(){
        if (this.queue[0] == null){
            return true;
        }
        return false;
    }

    public void drawBoard(){
        String strUltimasSenhas = "";
        boolean validar = true;
        int interacao = next;
        while (validar){
            if (interacao - 1 >= 0){
                strUltimasSenhas += queue[interacao - 1] + ", ";
            }else {
                validar = false;
            }
            interacao -= 1;
        }

        System.out.println("|--------------------|");
        System.out.println("|--- " + "Próximo" + "-- + " + this.queue[next] + "---|");
        System.out.println("|--------------------|");
        System.out.println("|--------------------|");
        System.out.println("|--------------------|");
        System.out.println("|--------------------|");

    }

}
