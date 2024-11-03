package br.com.fintech.fintechfiap.dao;

import br.com.fintech.fintechfiap.model.Usuario;
import br.com.fintech.fintechfiap.factory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    private Connection conexao;

    public UsuarioDao() throws SQLException {
        conexao = ConnectionFactory.getInstance().getConnection();    }

    // Método para obter todos os usuários
    public List<Usuario> getAll() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM Usuario");
        ResultSet result = stm.executeQuery();
        List<Usuario> lista = new ArrayList<>();

        while (result.next()) {
            lista.add(parseUsuario(result));
        }

        return lista;
    }

    // Método para inserir um novo usuário
    public void insert(Usuario usuario) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "INSERT INTO Usuario (cd_Usuario, nome, senha, email, cpf, saldo) VALUES (seq_usuario.nextval, ?, ?, ?, ?, ?)"
        );
        stm.setString(1, usuario.getNome());
        stm.setString(2, usuario.getSenha());
        stm.setString(3, usuario.getEmail());
        stm.setString(4, usuario.getCpf());
        stm.setFloat(5, usuario.getSaldo());
        stm.executeUpdate();
    }

    // Método para atualizar um usuário existente
    public void update(Usuario usuario) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "UPDATE Usuario SET nome = ?, senha = ?, email = ?, cpf = ?, saldo = ? WHERE cd_Usuario = ?"
        );
        stm.setString(1, usuario.getNome());
        stm.setString(2, usuario.getSenha());
        stm.setString(3, usuario.getEmail());
        stm.setString(4, usuario.getCpf());
        stm.setFloat(5, usuario.getSaldo());
        stm.setInt(6, usuario.getCdUsuario());
        stm.executeUpdate();
    }

    // Método para deletar um usuário pelo ID
    public void delete(int cdUsuario) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("DELETE FROM Usuario WHERE cd_Usuario = ?");
        stm.setInt(1, cdUsuario);
        stm.executeUpdate();
    }

    // Método para obter um usuário pelo ID
    public Usuario getById(int cdUsuario) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM Usuario WHERE cd_Usuario = ?");
        stm.setInt(1, cdUsuario);
        ResultSet result = stm.executeQuery();

        if (result.next()) {
            return parseUsuario(result);
        }
        return null;
    }

    // Método auxiliar para parsear o ResultSet em uma instância de Usuario
    private Usuario parseUsuario(ResultSet result) throws SQLException {
        int cdUsuario = result.getInt("cd_Usuario");
        String nome = result.getString("nome");
        String senha = result.getString("senha");
        String email = result.getString("email");
        String cpf = result.getString("cpf");
        float saldo = result.getFloat("saldo");

        return new Usuario(cdUsuario, nome, senha, email, cpf, saldo);
    }

    public void fecharConexao() throws SQLException {
        conexao.close();
    }
}

