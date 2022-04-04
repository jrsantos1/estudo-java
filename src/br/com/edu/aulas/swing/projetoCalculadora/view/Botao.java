package br.com.edu.aulas.swing.projetoCalculadora.view;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {
    public Botao(String texto, Color cor){
        setText(texto); // define o texto do botao
        setOpaque(true); // define tonalidade -- necessário
        setBackground(cor); // define cor de fundo do botao
        setFont(new Font("courier", Font.PLAIN, 15)); // propiedades da fonte do botão
        setForeground(Color.WHITE); // define cor da fonte
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); // define tipo e cor da borda

    }
}
