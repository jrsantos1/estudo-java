package br.com.edu.topicos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        String stringDeConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String user = "root";
        String password = "root123";

        Connection conexao = DriverManager.getConnection(stringDeConexao,user,password);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        conexao.close();
    }
}
