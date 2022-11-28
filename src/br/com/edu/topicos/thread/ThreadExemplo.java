package br.com.edu.topicos.thread;

public class ThreadExemplo extends Thread{
    public static void main(String[] args) {
        ThreadExemplo thread = new ThreadExemplo();
        thread.start();
        System.out.println("Aqui está rodando um fora da thread");
        System.out.println("Aqui está rodando um fora da thread");
    }
    public void run(){
        System.out.println("Aqui está rodando uma thread");
    }
}
