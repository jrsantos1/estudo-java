package br.com.edu.topicos.swing.projetoCalculadora.view;

import br.com.edu.topicos.swing.projetoCalculadora.modelo.Memoria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teclado extends JPanel implements ActionListener {

    private final Color COR_CINZA_ESCURO = new Color(68,68,68);
    private final Color COR_CINZA_CLARO = new Color(99,99,99);
    private final Color COR_LARANJA = new Color(242, 163, 60);

    public Teclado(){
        //setBackground(Color.cyan);

        GridBagLayout layout = new GridBagLayout(); // define o tipo de distribuição dos elementos
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH; // ajusta largura dos elementos/botoes
        c.weightx = 1; // ajusta a largura dos elementos para o tamanho todal da tela
        c.weighty = 1; // ajusta a altura dos elementos para o tamanho todal da tela

        setLayout(layout);

        c.gridwidth = 3; // define a quantidade de colunas que serão utilizadas
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

    // metodo para adicionar botao junto com os parametros de constraint
    private void AdicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {

        Botao botao = new Botao(texto, cor);
        c.gridx = x;
        c.gridy = y;
        botao.addActionListener(this);
        add(botao, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton) {
            JButton botao = (JButton) e.getSource();
            //System.out.println(botao.getText());
            Memoria.getInstance().processarComando(botao.getText());
        }
    }
}
