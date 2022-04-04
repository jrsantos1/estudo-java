package br.com.edu.aulas.swing.projetoCalculadora;

import javax.swing.*;
import java.awt.*;

public class Teclado extends JPanel {

    private final Color COR_CINZA_ESCURO = new Color(68,68,68);
    private final Color COR_CINZA_CLARO = new Color(99,99,99);
    private final Color COR_LARANJA = new Color(242, 163, 60);

    public Teclado(){
        //setBackground(Color.cyan);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;

        setLayout(layout);

        c.gridwidth = 3;
        AdicionarBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
        c.gridwidth = 1;
        AdicionarBotao("/", COR_LARANJA, c, 3, 0);

        AdicionarBotao("7", COR_CINZA_ESCURO, c, 0, 1);
        AdicionarBotao("8", COR_CINZA_ESCURO, c, 1, 1);
        AdicionarBotao("9", COR_CINZA_ESCURO, c, 2, 1);
        AdicionarBotao("*", COR_LARANJA, c, 3, 1);

        AdicionarBotao("4", COR_CINZA_ESCURO, c, 0, 2);
        AdicionarBotao("5", COR_CINZA_ESCURO, c, 1, 2);
        AdicionarBotao("6", COR_CINZA_ESCURO, c, 2, 2);
        AdicionarBotao("-", COR_LARANJA, c, 3, 2);

        AdicionarBotao("1", COR_CINZA_ESCURO, c, 0, 3);
        AdicionarBotao("2", COR_CINZA_ESCURO, c, 1, 3);
        AdicionarBotao("3", COR_CINZA_ESCURO, c, 2, 3);
        AdicionarBotao("+", COR_LARANJA, c, 3, 3);

        AdicionarBotao("0", COR_CINZA_ESCURO, c, 0, 4);
        AdicionarBotao("0", COR_CINZA_ESCURO, c, 1, 4);
        AdicionarBotao(",", COR_CINZA_ESCURO, c, 2, 4);
        AdicionarBotao("=", COR_LARANJA, c, 3, 4);



    }

    private void AdicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {

        Botao botao = new Botao(texto, cor);
        c.gridx = x;
        c.gridy = y;
        add(botao, c);


    }
}
