package br.com.edu.aulas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        Connection conexao = DBFactory.getConexao();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome");
        String nome = sc.next();

        String comendoSQL = "INSERT INTO pessoas (nome) values (?)";

        PreparedStatement stmt = conexao.prepareStatement(comendoSQL);
        stmt.setString(1, nome);
        stmt.execute();

        System.out.println("usuario criado com sucesso");

        conexao.close();



    }
}
