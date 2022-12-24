package br.com.edu.topicos.orientacao_objeto.desafios.hotel;
import java.time.LocalDate;

public class Reserva {
    private String nome;
    private String cpf;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(int ano, int mes, int dia) {
        
        LocalDate dataEntrada = LocalDate.of(ano, mes, dia);
        this.dataEntrada = dataEntrada;
    }
    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(int ano, int mes, int dia) {
        
        LocalDate dataSaida = LocalDate.of(ano, mes, dia);
        this.dataSaida = dataSaida;

    }

    public void verificarData(LocalDate entrada, LocalDate saida){

        LocalDate data_agora = LocalDate.now();

        if (entrada.compareTo(data_agora) > 0){

            if (saida.compareTo(entrada) > 0){
                System.out.println("Reserva realizada com sucesso!");
            }else{
                System.out.println("Impossível realizar reserva! Verifique a data solicitada.");
            }
        }
        else{
            System.out.println("Impossível realizar reserva! Verifique a data solicitada.");
        }
    }
}

