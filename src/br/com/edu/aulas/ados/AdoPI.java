package br.com.edu.aulas.ados;

import java.util.Scanner;

public class AdoPI {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //exercicio01();
        //exercicio02();
        //exercicio03();
        //exercicio04();
        //exercicio05();
        //exercicio06();
        //exercicio07();
        //exercicio08();
        //exercicio09();
        //exercicio10();

    }

    public static void exercicio01(){
        System.out.print("Digite um numero diferene de zero: ");

        while(true){
            int numeroDigitado = sc.nextInt();
            if (numeroDigitado != 0){
                if (numeroDigitado < 0){
                    System.out.println("O numero digitado é negativo");
                    break;
                }
                if (numeroDigitado > 0){
                    System.out.println("O numero digitado é positivo");
                    break;
                }
            }else{
                System.out.println("Valor incorreto, tente novamente");
            }

        }
    }
    public static void exercicio02(){
        System.out.print("Digite a distancia percorrida em km: ");
        Double distancia = sc.nextDouble();
        System.out.print("Digite o total de combustível gasto:  ");
        double combustivelGasto = sc.nextDouble();
        System.out.println("\n O consumo médio é de: " + distancia / combustivelGasto);
    }

    public static void exercicio03(){
        System.out.println("Entre com o primeiro número que tem peso 01: ");
        double num01 = sc.nextDouble() * 1;
        System.out.println("Entre com o primeiro número que tem peso 01: ");
        double num02 = sc.nextDouble() * 2;
        System.out.println("Entre com o primeiro número que tem peso 01: ");
        double num03 = sc.nextDouble() * 3;
        System.out.println("Entre com o primeiro número que tem peso 01: ");
        double num04 = sc.nextDouble() * 4;

        System.out.println("\n A média ponderada é: " + (num01+num02+num03+num04) / 10);

    }
    public static void exercicio04(){
        System.out.println("Digite um número para verificar se é divisível por 5");

        int verificaSeEDivisivel = sc.nextInt();

        if (verificaSeEDivisivel % 5 == 0){
            System.out.println("É divisível por 5");
        }else{
            System.out.println("Não é divisível por 5");
        }

    }
    public static void exercicio05(){
        System.out.println("Digite um número para verificar se é divisível por 5");

        int verificaSeEDivisivel = sc.nextInt();

        if (verificaSeEDivisivel % 5 == 0 ){
            System.out.println("É divisível por 5");
        }else if(verificaSeEDivisivel % 2 == 0){
            System.out.println("É divisível por 2");
        }else if(verificaSeEDivisivel % 10 == 0){
            System.out.println("É divisível por 10");
        }else {
            System.out.println("É divisível por nenhum");
        }
    }
    public static void exercicio06(){
        System.out.print("Digite a sigla do estado: ");
        String siglaEstado = sc.nextLine();

        switch (siglaEstado.toUpperCase()){
            case "RJ":
                System.out.println("carioca");
                break;
            case "SP":
                System.out.println("Pauslista");
                break;
            case "MG":
                System.out.println("Mineiro");
                break;
            default:
                System.out.println("Outros estados");
                break;
        }
    }
    public static void exercicio07(){
        System.out.println("Digite um número para verificar se é par");

        int verificaSeEDivisivel = sc.nextInt();

        if (verificaSeEDivisivel % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É ímpar");
        }
    }
    public static void exercicio08(){
        System.out.println("Entre com o lado A: ");
        double num01 = sc.nextDouble();
        System.out.println("Entre com o lado B: ");
        double num02 = sc.nextDouble();
        System.out.println("Entre com o lado C: ");
        double num03 = sc.nextDouble();

        if (num01 > (num02+num03) || num02 > (num03+num01) ||num03 > (num02+num01)){
            System.out.println("Os lados reprensetam um triângulo");
        }else{
            System.out.println("Os lados não representam um triangulo");
        }
    }
    public static void exercicio09(){

        System.out.println("Entre com o lado A: ");
        double num01 = sc.nextDouble();
        System.out.println("Entre com o lado B: ");
        double num02 = sc.nextDouble();
        System.out.println("Entre com o lado C: ");
        double num03 = sc.nextDouble();

        if (num01 > (num02+num03) || num02 > (num03+num01) ||num03 > (num02+num01)){
            System.out.println("Os lados reprensetam um triângulo");
            if (num01 == num02 && num02 == num03){
                System.out.println("Seu tipo é equilatero");
            }else if(num01 == num02 || num03 == num02 || num03 == num01){
                System.out.println("Triangulo do tipo isósceles");
            }else{
                System.out.println("Três lados diferentes");
            }
        }else{
            System.out.println("Os lados não representam um triangulo");
        }
    }
    public static void exercicio10(){
        double resultado = 0.0;
        System.out.println("Digite o primeiro numero da operação");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número da operação");
        double num2 = sc.nextDouble();

        System.out.println("Selecionae a operação desejada\n * para multiplicação" +
                "\n + para adição" +
                "\n - para subtração" +
                "\n / para divisão");
        String opcao = sc.nextLine();

        switch (opcao){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
        }

        System.out.println("O resultado é " + resultado);
    }
}
