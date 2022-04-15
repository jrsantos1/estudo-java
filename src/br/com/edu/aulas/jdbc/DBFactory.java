package br.com.edu.aulas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBFactory {

    public static Connection getConexao() {
        try {
            String stringDeConexao = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
            String user = "root";
            String password = "root123";
            return DriverManager.getConnection(stringDeConexao, user, password);
        
        }catch (SQLException e){
            //e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
