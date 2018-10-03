/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import announsee.DAO.Conexao;
import announsee.DAO.ImovelDAO;
import announsee.DAO.UsuarioDAO;
import announsee.Models.Imovel;
import com.oreilly.servlet.MultipartRequest;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vinic
 */
@WebServlet(name = "Anunciar2", urlPatterns = "/Anunciar2")
public class Anunciar2 extends HttpServlet{
    int idUsu=0,result;
    String categoria,bairro,preco,rua,faceContato,nome,telContato,descricao;
    String imagem;
   String tempDir = "C:\\Users\\Vinic\\Documents\\NetBeansProjects\\AnnounSee\\web\\Assets\\";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       MultipartRequest mreq = new MultipartRequest(req,tempDir,1888888);
       idUsu =Integer.parseInt(req.getSession(false).getAttribute("id").toString());
        categoria = mreq.getParameter("categoria");
        bairro = mreq.getParameter("bairro");
        preco = mreq.getParameter("preco");
        rua = mreq.getParameter("rua");
        faceContato= mreq.getParameter("facebook");
        nome = mreq.getParameter("nome");
        telContato = mreq.getParameter("telContato");
        descricao = mreq.getParameter("descricao");
        imagem = mreq.getOriginalFileName("foto");
        
        InputStream bis = new BufferedInputStream(new FileInputStream(tempDir+imagem)); 
        String name = imagem;
         try{
            Connection conn= new Conexao().Conectar();
            PreparedStatement st= conn.prepareStatement("INSERT INTO imovel(imo_usu_id,imo_categoria,imo_preco,imo_bairro,imo_rua,imo_descricao,imo_telContato,imo_nome,imo_faceContato,imo_foto) VALUES(?,?,?,?,?,?,?,?,?,?)");
            st.setInt(1,idUsu);
            st.setString(2, categoria);
            st.setString(3,preco);
            st.setString(4, bairro);
            st.setString(5,rua);
            st.setString(6, descricao);
            st.setString(7, telContato);
            st.setString(8, nome);
            st.setString(9,faceContato);
            st.setBinaryStream(10, bis);
            result =st.executeUpdate();
        }catch(SQLException | ClassNotFoundException | InstantiationException ex){
            System.out.print(ex);
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Anunciar2.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         PrintWriter out = resp.getWriter();
         out.print(name);

//        Imovel imovel = new Imovel();
//        imovel.setUsuId(idUsu);
//        imovel.setCategoria(categoria);
//        imovel.setBairro(bairro);
//        imovel.setPreco(preco);
//        imovel.setRua(rua);
//        imovel.setFaceContato(faceContato);
//        imovel.setNome(nome);
//        imovel.setTelContato(telContato);
//        imovel.setDescricao(descricao);
//        imovel.setFoto(bis);
        
//        ImovelDAO dao = new ImovelDAO();
        
//        try {
//            result=dao.adicionar(imovel);
//        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
//            PrintWriter out = resp.getWriter();
//            out.print(ex.getMessage());
//        }
//        if(result>0){
//            PrintWriter out = resp.getWriter();
//            out.print(idUsu+categoria+bairro+preco+rua+faceContato+nome+telContato+descricao+" "+bis+" "+imagem);
//        }else{
//             PrintWriter out = resp.getWriter();
//            out.print(imovel.getUsuId()+imovel.getCategoria()+imovel.getBairro()+imovel.getPreco()+imovel.getRua()+imovel.getFaceContato()+imovel.getNome()+imovel.getTelContato()+imovel.getDescricao()+" "+bis+" "+imagem+" ashdgasuydgasuydg");
//            out.println(tempDir+imagem);
//        }
       
    }

 
    
}
