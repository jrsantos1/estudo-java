package br.com.edu.topicos.entrutura_de_dados.exercicios.hospital_queue;

import br.com.edu.topicos.orientacao_objeto.matematica.Mat;

public class HospitalQueueManagement {
    private String[] queue;
    private int last;
    private int next;


    public HospitalQueueManagement(){
        this.queue = new String[5];
        this.next = 0;
        this.last = 0;
    }

    public void verificaTamanhoFila(){
        if (this.last == queue.length){
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
            for (int i = 0; i < this.last; i++) {
                if(this.queue[i].contains("P")){
                    continue;
                }
                else{
                    this.queue[i] = senha;
                    for (int j = last; j < i; j++){
                        this.queue[j+1] = this.queue[j];
                    }
                    break;
                }
            }
        }else{
            this.queue[last] = senha;
            this.last += 1;
        }
        return senha;
    }


    public void chamarProximoDaFila(){
        this.next += 1;
        drawBoard();
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
