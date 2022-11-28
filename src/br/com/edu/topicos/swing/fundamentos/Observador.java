package br.com.edu.topicos.swing.fundamentos;

import javax.swing.*;
import java.awt.*;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Projeto Integrador - ADS TD"); // instancia uma nova janela
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // define o padrao para que quando a jenela for fechada, o programe seja finalizado
        janela.setSize(600, 600); // calcula em pixel o tamanho da janela de exibição, altura e largura
        janela.setLayout(new FlowLayout()); // organiza os elementos dentro do layout
        janela.setLocationRelativeTo(null); // posicionar a janela relativa ao elemento pai, o termo null centraliza a janela relativa ao computador

        JButton botao = new JButton("Clicar aqui"); // cria um componente do tipo botao

        // adiciona o botao criado a janela

        janela.add(botao);

        // adicionado evento ao botao

        botao.addActionListener(e -> {

            System.out.println("Evento ocorreu");
        });

        // torna a janela visivel

        janela.setVisible(true); // torna a janela visivel
    }
}
