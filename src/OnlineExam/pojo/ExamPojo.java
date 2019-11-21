/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineExam.pojo;

/**
 *
 * @author SRISHTY RANI
 */
public class ExamPojo {
    private String examId;
    private String language;
    private int total_questions;

    public ExamPojo() {
    }

    public ExamPojo(String examId, String language, int total_questions) {
        this.examId = examId;
        this.language = language;
        this.total_questions = total_questions;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotal_questions() {
        return total_questions;
    }

    public void setTotal_questions(int total_questions) {
        this.total_questions = total_questions;
    }
    
    
}
