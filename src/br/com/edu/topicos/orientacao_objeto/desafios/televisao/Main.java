package br.com.edu.topicos.orientacao_objeto.desafios.televisao;

public class Main {
    public static void main(String[] args) {

        Televisao televisao = new Televisao();
        ControleRemoto controleRemoto = new ControleRemoto(televisao);

        // volume e canais atuais

        controleRemoto.getCanalAtual();
        controleRemoto.getVolume();


        // aumento de volume e canal

        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();


        controleRemoto.proximoCanal();
        controleRemoto.proximoCanal();
        controleRemoto.proximoCanal();


        // diminui volume e canal

        controleRemoto.canalAnterior();
        controleRemoto.canalAnterior();


        controleRemoto.diminuiVolume();
        controleRemoto.diminuiVolume();



    }

}