/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Vinic
 */
public class Conexao{
        public Connection Conectar() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                return DriverManager.getConnection("jdbc:mysql://localhost/announsee","root","");
        }
}
