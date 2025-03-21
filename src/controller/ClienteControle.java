package controller;

import config.ConexaoBancoDeDados;
import model.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteControle {
    public void cadastraCliente(Cliente cliente) {
        String sql = "INSERT INTO CLIENTE (NOME, CPF, DATA_NASCIMENTO, ENDERECO)" +
                "VALUES (?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = ConexaoBancoDeDados.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setDate(3, cliente.getData_nascimento());
            ps.setString(4, cliente.getEndereco());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}