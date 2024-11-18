/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class database {
    
    Connection connect;
    PreparedStatement pst;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/maindatabase";
    String user = "root";
    String password  = "";
    
    public void Connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(url,user,password);
            System.out.print("Connected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
