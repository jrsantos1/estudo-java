package br.com.edu.aulas.ap02.exercicios_em_sala.exercicio_em_sala_3;

import java.util.ArrayList;
import java.util.Scanner;

class Menu{
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            
            while(true){
    
            System.out.println("Início compra");
            
            CaixaMercado caixa = new CaixaMercado();
            while(true){
                
                System.out.println("Digie S para adicionar um novo produto ou X para encerrar a compra");
                String opcaoUsuario = sc.next();
                if(opcaoUsuario.equalsIgnoreCase("S")) {
                   
                    Produto produto = new Produto();
                    System.out.println("Nome do produto: ");
                    produto.setNome(sc.next());
                    System.out.println("Preço produto: ");
                    produto.setPreco(sc.nextDouble());
                    System.out.println("Quanidade: ");
                    produto.setQtd(sc.nextDouble());
    
                    caixa.addProduto(produto);

                    for (Produto produtos : caixa.listaProdutos) {
                        System.out.println("item " + produtos.getNome());
                    }

                    caixa.imprimirSubTotal(caixa.listaProdutos);
    
                }else if(opcaoUsuario.equalsIgnoreCase("X")){
                  break;
                }
                else{
                    System.out.println("Opção incorreta");
                }
            }
        }
        }
    }