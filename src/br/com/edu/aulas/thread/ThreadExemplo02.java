package br.com.edu.aulas.thread;

public class ThreadExemplo02 implements Runnable{
    public static void main(String[] args) {
        ThreadExemplo02 threadExemplo = new ThreadExemplo02();
        Thread thread = new Thread(threadExemplo);
        thread.start();

        while (thread.isAlive()){
            System.out.println("Waiting...");
        }

        System.out.println("Este código roda fora da thread");
    }

    @Override
    public void run() {
        System.out.println("Este código roda numa thread");
    }
}
