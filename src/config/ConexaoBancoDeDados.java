package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBancoDeDados {
    private static final String url = "jdbc:mysql://localhost:3306/projeto_agenda";
    private static final String usuario = "root";
    private static final String senha = "";

    private static Connection conexao;

    public static Connection getConexao() {
        try {
            if (conexao == null) {
                conexao = DriverManager.getConnection(url, usuario, senha);
                return conexao;
            } else {
                return conexao;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}