package br.com.edu.topicos.orientacao_objeto.desafios.hotel;

public class Main {

    public static void main(String[] args) {
        Reserva reserva = new Reserva();

        reserva.setCpf(null);
        reserva.setDataEntrada(2008, 9, 27);
        reserva.setNome("Jhonatan");
        reserva.setDataSaida(2025, 4, 6);
        reserva.verificarData(reserva.getDataEntrada(), reserva.getDataSaida());

    }

}
