/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg1_ldp_lv;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author brian
 */
public class Conexion {
    
    public Connection getconnection(){ 
        
        Connection con = null;
        String base = "bancobd";
        String url = "jdbc:mysql://localhost:3306/" + base;
        String user = "root";
        String password = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
        } catch(Exception e){
            System.err.print(e);
        }
        
        return con;
    }
    
}
