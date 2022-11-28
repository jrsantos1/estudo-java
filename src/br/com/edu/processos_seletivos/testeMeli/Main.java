package br.com.edu.processos_seletivos.testeMeli;

public class Main{
    public static void main(String[] args) {

        int maxDigit = 9999;

        for(int i = 1000; i <= maxDigit; i++){

            int somar = 0;

            String converter = Integer.toString(i);

            char[] chars = converter.toCharArray();
            for (char ch: chars) {
                //System.out.print(ch);
                somar += Character.getNumericValue(ch);
            }

            if (somar == 21){
                System.out.println(i);
            }
        }

    }
}