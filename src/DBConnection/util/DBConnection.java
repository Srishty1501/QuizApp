/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection.util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SRISHTY RANI
 */
public class DBConnection {
    
    private static Connection conn; //why static? agr kisi bhi chij ko bs ek bar call krna ho to static me use krte h
    static//why not constructor??kyunki is class ka kbhi koi object bnega hi nhi ,koi instance variable h nhi srf static variable h
    {
    try
     {
     Class.forName("oracle.jdbc.driver.OracleDriver"); 
     System.out.println("Driver Loaded") ;
     conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","onlineexam","student"); 
     System.out.println("Connection established");
     
     
      JOptionPane.showMessageDialog(null,"Connection established");
     }
     catch(Exception e){
     JOptionPane.showMessageDialog(null,"Connection not established");
     }
    }
    public static Connection getConnection(){
    return conn;
    }
    public static void closeConnection(){
    try
    {
    conn.close();
    JOptionPane.showMessageDialog(null,"Connection Closed");
    }
    catch(Exception e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Connection not closed");
    }
    }
    
}
