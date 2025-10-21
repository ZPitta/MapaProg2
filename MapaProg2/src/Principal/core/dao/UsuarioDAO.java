/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.core.dao;

import Principal.core.dao.conexao.ConexaoJDBC;
import Principal.core.entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author pitta
 */

public class UsuarioDAO {
    public void inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario(nome, login, senha, email) VALUES (?,?,?,?)";
        
        PreparedStatement ps = null;
        
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            
            ps.execute();
        }catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Houve um erro ao inserir os valores no Banco de Dados");
        }finally {
            ps.close();
        }
    }
    
    public Usuario buscaUser(String login, String senha) throws SQLException {
        String sql = "SELECT id, nome, login, senha , email FROM usuario WHERE login = ? AND senha = ?";
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            
            rs = ps.executeQuery();
            if(rs.next()) {
                JOptionPane.showMessageDialog(null,"Acesso Autorizado", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null,"Acesso Negado", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Houve um erro ao entrar.");
        }finally {
            ps.close();
            rs.close();
        }
        return null;
    }
}
