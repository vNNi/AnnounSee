/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinic
 */
public class TestaConexao {
    
        public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
            String sql="SELECT * from usuario where usu_email='"+"Vinicius_k2013@hotmail.com"+"'and usu_senha='"+"komninakis123"+"'";
            int result=0;
        try{
            Connection conn= new Conexao().Conectar();
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            System.out.print(rs.next());
        }catch(SQLException | ClassNotFoundException | InstantiationException ex){
            System.out.print(ex);
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
