/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alodiga.cdr.capture;

/**
 *
 * @author jmatapro
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;






public class ConexionBD
{
  Connection conn = null;





  
  public static Connection ConnecBd(String conexion, String user, String password) throws SQLException, ClassNotFoundException {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      return DriverManager.getConnection(conexion, user, password);
    }
    catch (SQLException ex) {
      Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
      throw new SQLException();
    }
    catch (ClassNotFoundException ex) {
      Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
      throw new ClassNotFoundException();
    } 
  }
}
