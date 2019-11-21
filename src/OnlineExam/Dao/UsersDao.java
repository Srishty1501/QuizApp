/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineExam.Dao;

import DBConnection.util.DBConnection;
import OnlineExam.pojo.UsersPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SRISHTY RANI
 */
public class UsersDao {
    public static boolean validateUser(UsersPojo user) throws SQLException
    {
    Connection conn=DBConnection.getConnection();
       
        PreparedStatement ps=conn.prepareStatement("select* from users where userId= ? and password= ? and usertype= ?");
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getUsertype());
        ResultSet rs= ps.executeQuery();
        return rs.next();
            
    }
    
}