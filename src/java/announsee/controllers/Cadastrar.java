/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.controllers;

import announsee.DAO.Conexao;
import announsee.DAO.UsuarioDAO;
import announsee.Models.Usuario;
import java.io.IOException;
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
@WebServlet(urlPatterns = "/Cadastrar")
public class Cadastrar extends HttpServlet {
    int result=0;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome=req.getParameter("nome");
        String sobrenome=req.getParameter("sobrenome");
        String email= req.getParameter("email");
        String senha= req.getParameter("senha");
        String tel = req.getParameter("tel");
        
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSobrenome(sobrenome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setTelefone(tel);
        
        try {
            UsuarioDAO usuDao = new UsuarioDAO();
           result = usuDao.adiciona(usuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(result>0){
            resp.sendRedirect("login.jsp");
        }
    }
    
    
}
