package br.com.edu.topicos.orientacao_objeto.desafios.primo;

public class NumeroPrimo {
    public static void main(String[] args) {
        int numero = 13;
        boolean valida = true;

        for (int i = numero; i > 0; i--) {

            if (i != numero && i != 1){

                if (numero % i == 0){
                    valida = false;
                    break;
                }

            }else{
                continue;
            }
        }

        if (valida){
            System.out.println("É primo");
        }else{
            System.out.println("Não é primo");
        }

    }

}
