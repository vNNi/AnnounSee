/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.controllers;

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
       req.setCharacterEncoding("UTF-8");
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


          Imovel imovel = new Imovel();
          imovel.setUsuId(idUsu);
          imovel.setCategoria(categoria);
          imovel.setBairro(bairro);
          imovel.setPreco(preco);
          imovel.setRua(rua);
          imovel.setFaceContato(faceContato);
          imovel.setNome(nome);
          imovel.setTelContato(telContato);
          imovel.setDescricao(descricao);
          imovel.setFoto(bis);
          imovel.setPath(imagem);
          ImovelDAO dao = new ImovelDAO();
        
        try {
            result=dao.adicionar(imovel);
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            PrintWriter out = resp.getWriter();
            out.print(ex.getMessage());
        }
        if(result>0){
           resp.sendRedirect("index.jsp");
        }else{
             PrintWriter out = resp.getWriter();
            out.print(imovel.getUsuId()+imovel.getCategoria()+imovel.getBairro()+imovel.getPreco()+imovel.getRua()+imovel.getFaceContato()+imovel.getNome()+imovel.getTelContato()+imovel.getDescricao()+" "+bis+" "+imagem+" ashdgasuydgasuydg");
            out.println(tempDir+imagem);
        }
       
    }

 
    
}
