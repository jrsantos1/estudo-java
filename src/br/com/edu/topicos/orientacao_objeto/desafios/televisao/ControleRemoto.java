package br.com.edu.topicos.orientacao_objeto.desafios.televisao;

public class ControleRemoto {
    
    private int incremento = 1;
    private int decremento = -1;

    Televisao televisao; 

    public ControleRemoto(Televisao televisao){
        this.televisao = televisao;
    }

    public void aumentaVolume(){
        televisao.setVolume(incremento);
        int volumeAtual = televisao.getVolume();
        System.out.println("Volume: " + volumeAtual);
    }

    public void diminuiVolume(){
        televisao.setVolume(decremento);
        int volumeAtual = televisao.getVolume();
        System.out.println("Volume: " + volumeAtual);
    }

    public void proximoCanal(){
        televisao.setCanalAtual(incremento);
        int canalAtual = televisao.getCanalAtual();
        System.out.println("Canal: " + canalAtual);
    }

    public void canalAnterior(){
        televisao.setCanalAtual(decremento);
        int canalAtual = televisao.getCanalAtual();
        System.out.println("Canal: " + canalAtual);
    }

    public void getCanalAtual(){
        System.out.println(this.televisao.getVolume());
    }

    public void getVolume(){
        System.out.println(this.televisao.getVolume());
    }

}
