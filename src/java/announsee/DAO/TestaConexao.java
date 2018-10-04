/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.DAO;

import announsee.Models.Imovel;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinic
 */
public class TestaConexao {
    
        public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, FileNotFoundException {
            ArrayList<Imovel> listaCasas = new ArrayList<>();
       Connection conn=null;
       String sql = "select * from imovel where imo_categoria = 'casa'";
        try {
            conn = new Conexao().Conectar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
           System.out.print(ex.getMessage());
        }
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Imovel imovel = new Imovel();
                imovel.setId(rs.getInt("imo_id"));
                imovel.setCategoria(rs.getString("imo_categoria"));
                imovel.setPreco(rs.getString("imo_preco"));
                imovel.setBairro(rs.getString("imo_bairro"));
                imovel.setRua(rs.getString("imo_rua"));
                imovel.setDescricao(rs.getString("imo_descricao"));
                imovel.setTelContato(rs.getString("imo_telContato"));
                imovel.setNome(rs.getString("imo_nome"));
                imovel.setFaceContato(rs.getString("imo_faceContato"));
//                imovel.setBinaryInt(rs.getByte("imo_foto"));
                imovel.setPath(rs.getString("imo_path"));
                listaCasas.add(imovel);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
           System.out.print(ex);
        }
    }
}
