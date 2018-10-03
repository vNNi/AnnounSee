/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.DAO;

import announsee.Models.Imovel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinic
 */
public class ImovelDAO {
    public int adicionar(Imovel imovel) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        int result=0;
        
            Connection conn = null;
        try {
            conn = new Conexao().Conectar();
        } catch (SQLException ex) {
            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            PreparedStatement st= conn.prepareStatement("INSERT INTO imovel(imo_usu_id,imo_categoria,imo_preco,imo_bairro,imo_rua,imo_descricao,imo_telContato,imo_nome,imo_faceContato,imo_foto) VALUES(?,?,?,?,?,?,?,?,?,?)");
            st.setInt(1,imovel.getUsuId());
            st.setString(2, imovel.getCategoria());
            st.setString(3,imovel.getBairro());
            st.setString(4, imovel.getPreco());
            st.setString(5,imovel.getRua());
            st.setString(6, imovel.getDescricao());
            st.setString(7, imovel.getTelContato());
            st.setString(8, imovel.getNome());
            st.setString(9, imovel.getFaceContato());
            st.setBinaryStream(10, imovel.getFoto());
            result =st.executeUpdate();
        
         return result;
    }
}
