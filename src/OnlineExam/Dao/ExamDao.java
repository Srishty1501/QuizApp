/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineExam.Dao;

import DBConnection.util.DBConnection;
import OnlineExam.pojo.ExamPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SRISHTY RANI
 */
public class ExamDao {
    public static String getExamId()throws SQLException
    { 
        String qry="Select count(*) as totalrows from exam";
        int rowCount=0;
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(qry);
        if(rs.next()){
        rowCount=rs.getInt(1);}
        String newId="EX-"+(rowCount+1);
        return newId;
        
    
     }
    public static boolean addExam(ExamPojo obj)throws SQLException{
    
    String qry="insert into exam values=(?,?,?)";
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,obj.getExamId());
    ps.setString(2,obj.getLanguage());
    ps.setInt(3,obj.getTotal_questions());
    int ans=ps.executeUpdate();
    return ans==1;
    }
    public static boolean isPpaperSet(String subject)throws SQLException{
    String qry="select examId from exam where language=?";
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,subject);
    ResultSet rs=ps.executeQuery();
    return rs.next();
    
    }
    public static ArrayList<String> getExamIdBySubject(String userId, String subject)throws SQLException{
    String qry="Select examId from exam where language=? minus select examIdfrom performance where userId=?";
    ArrayList<String> examIDlist=new ArrayList<>();
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,subject);
    ps.setString(2,userId);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
    examIDlist.add(rs.getString(1));
    }
    return examIDlist;
    }
    
   public static int getQuestCountByExam (String examId)throws SQLException{
   
   String qry="Select total_count from exam where examId=?";
   Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,examId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    return(rs.getInt(1));
   }
    
    
    
}
