/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineExam.Dao;

import DBConnection.util.DBConnection;
import OnlineExam.pojo.QuestionPojo;
import OnlineExam.pojo.QuestionStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SRISHTY RANI
 */
public class QuestionDao {
    public static boolean addQuestions(QuestionStore questionStore)throws SQLException {
    String qry="insert into questions values =(?,?,?,?,?,?,?,?,?)";
    
    ArrayList<QuestionPojo> questions = questionStore.getAllQuestions();
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    int count=0;
    for(QuestionPojo q:questions){
    ps.setString(1,q.getExamId());
    ps.setInt(2,q.getQno());
    ps.setString(3,q.getQuestions());
    ps.setString(4,q.getAnswer1());
    ps.setString(5,q.getAnswer2());
    ps.setString(6,q.getAnswer3());
    ps.setString(7,q.getAnswer4());
    ps.setString(8,q.getCorrect_answer());
    ps.setString(9,q.getLanguage());
    int c=ps.executeUpdate();
    count=count+c;
    }
    return (count>1);
    }
    
  public static ArrayList<QuestionPojo> getQuestionByExamId(String examId)throws SQLException{
  String qry="select* from question where examId=?";
  ArrayList<QuestionPojo> questionList=new ArrayList<>();
  Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,examId);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
   
    int qno=rs.getInt(2);
    String question =rs.getString(3);
    String option1 =rs.getString(4);
    String option2 =rs.getString(5);
    String option3 =rs.getString(6);
    String option4 =rs.getString(7);
    String correctAnswer=rs.getString(8);
    String language=rs.getString(9);
    QuestionPojo quest=new QuestionPojo(examId,qno,question,option1,option2,option3,option4,correctAnswer,language);
    questionList.add(quest);
    }
   return questionList; 
  }  
}
