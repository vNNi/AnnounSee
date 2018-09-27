/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vinic
 */
public class TestaConexao {
        public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
            Connection conectar = new Conexao().Conectar();
            System.out.print("Conectado");
            String sql = "INSERT INTO usuario(usu_nome,usu_sobrenome,usu_email,usu_senha,usu_telefone) VALUES(?,?,?,?,?)";
           PreparedStatement stmt= conectar.prepareStatement(sql);
           
            stmt.setString(1, "Vinicius");
            stmt.setString(2, "Komninaki");
            stmt.setString(3, "Vinicius_k2013@hotmail.com");
            stmt.setString(4, "komninakis123");
            stmt.setString(5, "11991797261");
            stmt.executeUpdate();
    }
}
