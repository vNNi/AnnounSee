/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.DAO;

import announsee.Models.Imovel;
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
public class ImovelDAO {
    public int adicionar(Imovel imovel) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        int result=0;
        
            Connection conn = null;
        try {
            conn = new Conexao().Conectar();
        } catch (SQLException ex) {
            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            PreparedStatement st= conn.prepareStatement("INSERT INTO imovel(imo_usu_id,imo_categoria,imo_preco,imo_bairro,imo_rua,imo_descricao,imo_telContato,imo_nome,imo_faceContato,imo_foto,imo_path) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
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
            st.setString(11, imovel.getPath());
            result =st.executeUpdate();
        
         return result;
    }
    public ArrayList<Imovel> listarCasas(){
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
           System.out.print(ex.getMessage());
        }
       return listaCasas;
    }
     public ArrayList<Imovel> listApartaments(){
       ArrayList<Imovel> listingApartaments = new ArrayList<>();
       Connection conn=null;
       String sql = "select * from imovel where imo_categoria = 'apartamento'";
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
                listingApartaments.add(imovel);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
           System.out.print(ex.getMessage());
        }
       return listingApartaments;
    }
     public ArrayList<Imovel> listOthers(){
       ArrayList<Imovel> listingOthers = new ArrayList<>();
       Connection conn=null;
       String sql = "select * from imovel where imo_categoria = 'outros'";
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
                listingOthers.add(imovel);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
           System.out.print(ex.getMessage());
        }
       return listingOthers;
    }
}
