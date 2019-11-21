/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineExam.Dao;

import DBConnection.util.DBConnection;
import OnlineExam.pojo.PerformancePojo;
import OnlineExam.pojo.StudentScore;
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
public class PerformanceDao {
 public static ArrayList<String> getAllstudentId() throws SQLException{
 
 String qry="select distinct userId from performance";
 ArrayList<String> studentList=new ArrayList<String>();
 Connection conn=DBConnection.getConnection();
 Statement st=conn.createStatement();
 ResultSet rs=st.executeQuery(qry);
 while(rs.next()){
 
 String id=rs.getString(1);
 studentList.add(id);
 
 }   
 return studentList;
}
public static ArrayList<String> getAllExamId(String studentId) throws SQLException {
ArrayList<String> examId=new ArrayList<>();
Connection conn=DBConnection.getConnection();
String qry="select examId from performance where examId=?";
PreparedStatement ps=conn.prepareStatement(qry);
ps.setString(1,studentId);
ResultSet rs=ps.executeQuery();
while(rs.next()){
String eid=rs.getString(1);
examId.add(eid);
}
return examId;
}
 public static StudentScore getScore(String studentId,String examId) throws SQLException{
 String qry="select language,per from performance where userId=? and examId=?";
 Connection conn=DBConnection.getConnection();
 PreparedStatement ps=conn.prepareStatement(qry);
 ps.setString(1,studentId);
 ps.setString(2,examId);
 ResultSet rs=ps.executeQuery();
 rs.next();
 StudentScore scoreObj=new StudentScore();
 scoreObj.setLanguauge(rs.getString(1));
 scoreObj.setPer(rs.getDouble(2));
 return scoreObj;
 }
 public static void addPerformance(PerformancePojo performance)throws SQLException{
 String qry="insert into performance values(?,?,?,?,?,?,?)";
 Connection conn=DBConnection.getConnection();
 PreparedStatement ps=conn.prepareStatement(qry);
  ps.setString(1,performance.getUserId());
   ps.setString(2,performance.getExamId());
      ps.setInt(3,performance.getRight());
      ps.setInt(4,performance.getWrong());
      ps.setInt(5,performance.getUnattempted());
      ps.setDouble(6,performance.getPer());
      ps.setString(7,performance.getLanguage());
      ps.executeUpdate();


 }
 
 
}
