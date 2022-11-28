package br.com.edu.senac.ap01.outros;

public class Ado08 {

    public static void main(String[] args) {
        int cont = 0;
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int numero5 = 0;
        int numero6 = 0;
        while (cont < 1000) {
            double aleatorio = Math.random();
            int valorDoDado = (int) Math.round(aleatorio * 5) +1 ;
            switch (valorDoDado){
                case 1:
                    numero1++;
                    break;
                case 2:
                    numero2 += 1;
                    break;
                case 3:
                    numero3 += 1;
                    break;
                case 4:
                    numero4 += 1;
                    break;
                case 5:
                    numero5 += 1;
                    break;
                case 6:
                    numero6 += 1;
                    break;
            }
            cont++;


        }

        System.out.println(" O número 1 foi exibido " + numero1 + " vezes " + (Math.round(100 * (double) numero1 / 1000)) + "%") ;
        System.out.println(" O número 2 foi exibido " + numero2 + " vezes " + (Math.round(100 * (double) numero2 / 1000)) + "%");
        System.out.println(" O número 3 foi exibido " + numero3 + " vezes " + (Math.round(100 * (double) numero3 / 1000)) + "%");
        System.out.println(" O número 4 foi exibido " + numero4 + " vezes " + (Math.round(100 * (double) numero4 / 1000)) + "%");
        System.out.println(" O número 5 foi exibido " + numero5 + " vezes " + (Math.round(100 * (double) numero5 / 1000)) + "%");
        System.out.println(" O número 6 foi exibido " + numero6 + " vezes " + (Math.round(100 * (double) numero6 / 1000)) + "%");


    }
}
