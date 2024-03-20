/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mdiform;

/**
 *
 * @author Usuario
 */
import java.sql.*;  

// *********************
// Connection para MYSQL
// *********************
public class conn{
    private String user = null;
    private String password = null;

    Connection con;
    Statement statemente;
    
    public conn(final String user, final String password, String DB){  
        try{  
            if (DB == "MYSQL"){
                Class.forName("com.mysql.jdbc.Driver");  
                con =DriverManager.getConnection("jdbc:mysql:///hms","root","mysql123"); 
            }
            if (DB == "ORACLE"){
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection(  
                            NewJFrame.dbURL,NewJFrame.username,NewJFrame.password);
            }
            
            statemente =con.createStatement();  

        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
    
    
}
