package br.com.edu.topicos.entrutura_de_dados.exercicios.hospital_queue;

import java.util.Random;

public class Senha {
    public static String gerarSenha(int tamanhoSenha, Boolean preferencial){
        Random random = new Random();
        String strBuildPass = "";

        for (int i = 0; i < tamanhoSenha; i++) {
            strBuildPass += String.valueOf(random.nextInt(10));
        }

        if (preferencial == true){
            strBuildPass += "P";
        }else{
            strBuildPass += "N";
        }

        return strBuildPass;
    }
}
