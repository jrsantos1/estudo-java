package br.com.edu.topicos.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarQuestoes {
    public List<Questoes> consulta() throws SQLException {
        Connection conexao = DBFactory.getConexao();

        String comendoSQL = "SELECT * FROM questoes";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(comendoSQL);

        List<Questoes> questoes = new ArrayList<Questoes>();

        while(resultado.next()){

           /* resultado.getInt("codigo");
            resultado.getString("questao");
            resultado.getString("alternativa01");
            resultado.getString("alternativa02");
            resultado.getString("alternativa03");
            resultado.getString("alternativa04");
            resultado.getString("AlternativaCorreta");
            */
            questoes.add(new Questoes(resultado.getInt("codigo"), resultado.getString("questao"), resultado.getString("alternativa01"), resultado.getString("alternativa02"), resultado.getString("alternativa03"), resultado.getString("alternativa04"), resultado.getString("AlternativaCorreta")));


        }

        stmt.close();
        conexao.close();

        return questoes;


    }
}
