 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.controllers;

import announsee.DAO.UsuarioDAO;
import announsee.Models.Usuario;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vinic
 */
@WebServlet(name = "Logar",urlPatterns ="/Logar")
public class Login extends HttpServlet{
    ResultSet result;
    String page;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        String senha=req.getParameter("senha");
        
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setSenha(senha);

            UsuarioDAO dao;
        try {
            dao = new UsuarioDAO();
             result = dao.verifica(usuario);
            if(!result.next()){
                page="cadastro.jsp";
            }else{
                HttpSession session=req.getSession(true);
                session.setAttribute("logado","true");
                session.setAttribute("id", result.getString("usu_id"));
                page="index.jsp";
            }
        resp.sendRedirect(page);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}
