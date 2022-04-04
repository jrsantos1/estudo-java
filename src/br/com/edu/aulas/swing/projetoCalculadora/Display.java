package br.com.edu.aulas.swing.projetoCalculadora;

import javax.swing.*;
import java.awt.*;

public class Display  extends JPanel {
    public Display(){
        setBackground(new Color(50,50,50)); // seleciona o cor no formato rgb
        JLabel label = new JLabel("1233,5"); // cria um texto para ser exibido
        label.setForeground(Color.WHITE); // seleciona cor da fonte
        label.setFont(new Font("courier", Font.PLAIN, 30)); // propriedades da font

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); // alinhamento dos componentes do panel

        add(label);
    }
}
