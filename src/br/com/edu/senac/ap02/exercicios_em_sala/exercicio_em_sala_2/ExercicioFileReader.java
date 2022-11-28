package br.com.edu.senac.ap02.exercicios_em_sala.exercicio_em_sala_2;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.FileWriter;

public class ExercicioFileReader {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        File arquivoCriado = criarArquivo("arquivo1.txt");
        System.out.println("Digite os nomes desejados: ");
        escreverNoArquivo(arquivoCriado);
        lerArquivo(arquivoCriado);
        TreeSet<String> listaDeNomes =  criaLista(arquivoCriado);
        for (String item : listaDeNomes) {
          System.out.println(item);
        }
        gerarArquivoPartirDeLista(listaDeNomes);
    }

    public static TreeSet<String> criaLista(File arquivo) throws Exception{
      
      TreeSet<String> novaLista = new TreeSet<String>();
      Scanner sc = new Scanner(arquivo);
        while(sc.hasNextLine()){
          String linha = sc.nextLine();
          novaLista.add(linha);
        }
        sc.close();
     return novaLista;    
    }

    public static void lerArquivo(File arquivo) throws Exception {
        Scanner sc = new Scanner(arquivo);
        while(sc.hasNextLine()){
          String linha = sc.nextLine();
          System.out.println(linha);
        }
        sc.close();
    }

    public static File gerarArquivoPartirDeLista(TreeSet<String> conjunto) throws Exception {
      File arquivo = criarArquivo("ordenado.txt");
      FileWriter escrever = new FileWriter(arquivo);
      for (String item : conjunto){
        System.out.println("novo item");
        System.out.println(item);
        escrever.write(item);
        escrever.write(System.lineSeparator());
      }
      escrever.close();
      return arquivo;
    }
  
    public static void escreverNoArquivo(File arquivo){
        try {
            FileWriter escritor = new FileWriter(arquivo);
            for (int i = 0; i <= 10; i ++ ){
                String nome = sc.next();
                escritor.write(nome);
                escritor.write(System.lineSeparator());
            }   
            escritor.close();
            System.out.println("Adicionado com sucesso");
          } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
          }
        }

    public static File criarArquivo(String nomeArquivo){
        File myObj = new File(nomeArquivo);
        try {
            if (myObj.createNewFile()) {
              System.out.println("Arquivo criado: " + myObj.getName());
            } else {
              System.out.println("Arquivo já existe");
            }
          } catch (IOException e) {
            System.out.println("Há um erro");
            e.printStackTrace();
          }   
          return myObj;
    }

}
