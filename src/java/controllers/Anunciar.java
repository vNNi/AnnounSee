/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import announsee.DAO.ImovelDAO;
import announsee.Models.Imovel;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
/**
 *
 * @author Vinic
 */
@WebServlet(name = "Anunciar",urlPatterns = "/Anunciar")
@MultipartConfig
public class Anunciar extends HttpServlet{
    int result=0,idUsu;
    String categoria,bairro,preco,rua,faceContato,nome,telContato,descricao;
    File repository;
    Map<String,String>array= new HashMap<String,String>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Imovel imovel = new Imovel();
        
        boolean isMultiPart = ServletFileUpload.isMultipartContent(req);
 
        if(isMultiPart){
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(150000);
            factory.setRepository(repository);
            ServletFileUpload upload = new ServletFileUpload(factory);
            try {
                List<FileItem> items = upload.parseRequest(req);
                Iterator<FileItem> itr=items.iterator();
                while(itr.hasNext()){
                    FileItem item = itr.next();
                    if(item.isFormField()){
                    idUsu =Integer.parseInt(req.getSession(false).getAttribute("id").toString());
                    array.put(item.getName(), item.getString());
//                     preco = item.getString();
//                     bairro = req.getParameter("bairro");
//                     rua = req.getParameter("rua");
//                     descricao = req.getParameter("descricao");
//                     telContato = req.getParameter("telContato");
//                     nome = req.getParameter("nome");
//                     faceContato = req.getParameter("facebook");

                    imovel.setUsuId(idUsu);
                    imovel.setCategoria(categoria);
                    imovel.setPreco(preco);
                    imovel.setBairro(bairro);
                    imovel.setRua(rua);
                    imovel.setDescricao(descricao);
                    imovel.setTelContato(telContato);
                    imovel.setNome(nome);
                    imovel.setFaceContato(faceContato);
                    }else{
                    
                    }
                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            }

//        ImovelDAO imovelDAO = new ImovelDAO();
//        
//        result = imovelDAO.adicionar(imovel);
        
        if(result>0){
            resp.sendRedirect("index.jsp");
        }else{
            PrintWriter print = resp.getWriter();
           
            print.print(array+" "+imovel.getBairro() +" " + imovel.getCategoria()+" " + imovel.getNome()+" " + imovel.getPreco()+" " + imovel.getDescricao()+" " + imovel.getFaceContato()+" " + imovel.getRua()+" " + imovel.getTelContato()+" "+imovel.getUsuId());
            print.print(nome+" "+categoria+" "+preco+" "+bairro+" "+rua+" "+ descricao+ " "+ telContato+" "+faceContato+ " " + idUsu);
            }
        }
    }
}