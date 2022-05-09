package br.com.edu.AulasAP;

public class ForEnhanced {
    public static void main(String[] args) {
        String linhas[] = {"Jhonatan;22;Microsoft;Developer", "Jhonatan;22;Microsoft;Developer", "Jhonatan;22;Microsoft;Developer"
        };

        for (String linha : linhas ){
            String valores[] = linha.split(";");
            System.out.println("Nome: " + valores[0] + "--- " + "Idade: " + valores[1] + "--- " + "Empresa: " + valores[2] + "--- " + "Função: " + valores[3]);
        }
    }
}
