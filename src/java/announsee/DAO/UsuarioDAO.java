package announsee.DAO;

import announsee.Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    private Connection connection;
    String nome,sobrenome,email,senha;
    int telefone;
    
    
    public UsuarioDAO() throws ClassNotFoundException, SQLException{
        this.connection= new Conexao().Conectar();
    }
    public void adiciona(Usuario usuario){
       String sql= "Insert into usuario(usu_nome,usu_sobrenome,usu_email,usu_senha,usu_telefone) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt= connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSobrenome());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setInt(5, usuario.getTelefone());
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
