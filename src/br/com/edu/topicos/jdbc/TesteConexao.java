package br.com.edu.topicos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
        String stringDeConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String user = "root";
        String password = "root123";

        Connection conexao = DriverManager.getConnection(stringDeConexao,user,password);
        System.out.println("Conexao realizada com sucesso");
        conexao.close();
    }
}
