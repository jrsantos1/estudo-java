package br.com.edu.aulas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaQuestao {
    public static void main(String[] args) throws SQLException {

        Connection conexao = DBFactory.getConexao();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a pergunta: ");
        String pergunta = sc.nextLine();
        System.out.print("Digite a primeira alternativa: ");
        String alternativa01 = sc.nextLine();
        System.out.print("Digite a segunda alternativa: ");
        String alternativa02 = sc.nextLine();
        System.out.print("Digite a terceira alternativa: ");
        String alternativa03 = sc.nextLine();
        System.out.print("Digite a quarta alternativa: ");
        String alternativa04 = sc.nextLine();
        System.out.print("Digite a alternativaCorreta: ");
        String alternativaCorreta = sc.nextLine();

        String comendoSQL = "INSERT INTO questoes (questao, alternativa01, alternativa02, alternativa03, alternativa04, alternativaCorreta ) values (?,?,?,?,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(comendoSQL);
        stmt.setString(1, pergunta);
        stmt.setString(2, alternativa01);
        stmt.setString(3, alternativa02);
        stmt.setString(4, alternativa03);
        stmt.setString(5, alternativa04);
        stmt.setString(6, alternativaCorreta);
        stmt.execute();

        System.out.println("Questão criada com sucesso");

        conexao.close();

    }
}
