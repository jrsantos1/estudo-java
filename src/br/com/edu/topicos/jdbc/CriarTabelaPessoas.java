package br.com.edu.topicos.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection conexao = DBFactory.getConexao();

        String sql0 = "CREATE TABLE pessoas (codigo INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(80) NOT NULL)";
        String sql = "CREATE TABLE questoes (codigo INT AUTO_INCREMENT PRIMARY KEY, questao VARCHAR(200) NOT NULL, alternativa01 VARCHAR(200) NOT NULL,alternativa02 VARCHAR(200) NOT NULL, alternativa03 VARCHAR(200) NOT NULL, alternativa04 VARCHAR(200) NOT NULL, AlternativaCorreta VARCHAR(200) NOT NULL)";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");

        conexao.close();

    }
}
