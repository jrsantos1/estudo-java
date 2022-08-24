package br.com.edu.aulas.ap02.ado1.exercicio01_semaforo;

public class Semaforo {
    private String statusSemaforo;

    public Semaforo(){
        this.statusSemaforo = "Vermelho";
    }

    public void setStatusSemaforo(String statusSemaforo) {
        this.statusSemaforo = statusSemaforo;
    }
    public void getAcao(){
        if (statusSemaforo.equalsIgnoreCase("vermelho")) {
            System.out.println("Espere");
        }else if (statusSemaforo.equalsIgnoreCase("Verde")){
            System.out.println("Atravesse");
        }else{
            throw new RuntimeException("Semaforo inoperante");
        }
    }
}
