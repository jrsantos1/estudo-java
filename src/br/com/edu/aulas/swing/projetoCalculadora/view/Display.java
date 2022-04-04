package br.com.edu.aulas.swing.projetoCalculadora.view;

import br.com.edu.aulas.swing.projetoCalculadora.modelo.Memoria;
import br.com.edu.aulas.swing.projetoCalculadora.modelo.MomeriaObervador;

import javax.swing.*;
import java.awt.*;

public class Display  extends JPanel implements MomeriaObervador {

    private final JLabel label;

    public Display(){

        Memoria.getInstance().adicionarObervador(this);

        setBackground(new Color(50,50,50)); // seleciona o cor no formato rgb
        label = new JLabel(Memoria.getInstance().getTextoAtual()); // cria um texto para ser exibido
        label.setForeground(Color.WHITE); // seleciona cor da fonte
        label.setFont(new Font("courier", Font.PLAIN, 30)); // propriedades da font
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); // alinhamento dos componentes do panel

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
