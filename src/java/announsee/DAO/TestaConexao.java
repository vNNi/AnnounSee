/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.DAO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
    
        public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, FileNotFoundException {
            String sql="SELECT * from usuario where usu_email='"+"Vinicius_k2013@hotmail.com"+"'and usu_senha='"+"komninakis123"+"'";
            int result=0;
        try{
            Connection conn= new Conexao().Conectar();
            PreparedStatement st= conn.prepareStatement("INSERT INTO imovel(imo_usu_id,imo_categoria,imo_preco,imo_bairro,imo_rua,imo_descricao,imo_telContato,imo_nome,imo_faceContato,imo_foto) VALUES(?,?,?,?,?,?,?,?,?,?)");
            st.setInt(1,2);
            st.setString(2, "casa");
            st.setString(3,"Vl.Formosa");
            st.setString(4, "251651");
            st.setString(5,"RUA");
            st.setString(6, "desc");
            st.setString(7, "11991797261");
            st.setString(8, "asdasdasd");
            st.setString(9,"facedasd");
             InputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Vinic\\Documents\\NetBeansProjects\\AnnounSee\\web\\Assets\\apartamento1.jpg"));
            st.setBinaryStream(10, bis);
            result =st.executeUpdate();
        }catch(SQLException | ClassNotFoundException | InstantiationException ex){
            System.out.print(ex);
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
