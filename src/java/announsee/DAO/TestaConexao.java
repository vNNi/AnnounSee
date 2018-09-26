/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.DAO;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Vinic
 */
public class TestaConexao {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Connection conectar = new Conexao().Conectar();
            System.out.print("Conectado");
    }
}
