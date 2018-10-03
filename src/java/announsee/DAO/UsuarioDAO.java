package announsee.DAO;

import announsee.Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    int result=0;
    public UsuarioDAO() throws ClassNotFoundException, SQLException{
    }
    public int adiciona(Usuario usuario) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
       String sql= "INSERT INTO usuario(usu_nome,usu_sobrenome,usu_email,usu_senha,usu_telefone) VALUES(?,?,?,?,?)";
        try {
            Connection conectar = new Conexao().Conectar();
            PreparedStatement stmt= conectar.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSobrenome());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4,usuario.getSenha());
            stmt.setString(5, usuario.getTelefone());
             result= stmt.executeUpdate();
             stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
        
    }
    public ResultSet verifica(Usuario usuario) throws IllegalAccessException, IllegalAccessException, IllegalAccessException{
        String sql="SELECT * from usuario where usu_email=+'"+usuario.getEmail()+"' and usu_senha='"+usuario.getSenha()+"'";
        ResultSet rs=null;
        try{
            Connection conn= new Conexao().Conectar();
            PreparedStatement stmt=conn.prepareStatement(sql);
             rs = stmt.executeQuery(sql);
        }catch(SQLException | ClassNotFoundException | InstantiationException ex){
            System.out.print(ex);
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
