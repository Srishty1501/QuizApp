/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineExam.gui;

import OnlineExam.Dao.QuestionDao;
import OnlineExam.pojo.AnswerPojo;
import OnlineExam.pojo.AnswerStorePojo;
import OnlineExam.pojo.ExamPojo;
import OnlineExam.pojo.QuestionPojo;
import OnlineExam.pojo.QuestionStore;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SRISHTY RANI
 */
public class TakeTestFrame extends javax.swing.JFrame {
    
    private ExamPojo exam;
    private QuestionStore qstore;
    private AnswerStorePojo astore;
    private int qno,pos=0;
    
    public TakeTestFrame() {
        initComponents();
        lblUserName.setText("");
        qstore=new QuestionStore();
        astore=new AnswerStorePojo();
        qno=1;
        lblQno.setText(lblQno.getText()+qno);
        
        
    }
    public TakeTestFrame(ExamPojo exam){
    this();
    this.exam=exam;
    lblTitle.setText(exam.getLanguage().toUpperCase()+"PAPER");
    loadQuestion();
    showQuestion();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jrOption1 = new javax.swing.JRadioButton();
        jrOption2 = new javax.swing.JRadioButton();
        jrOption3 = new javax.swing.JRadioButton();
        jrOption4 = new javax.swing.JRadioButton();
        lblQno = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        jcLogOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 102, 0));
        lblTitle.setText("EXAM PAPER");

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        jrOption1.setBackground(new java.awt.Color(0, 0, 0));
        jrOption1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrOption1.setForeground(new java.awt.Color(255, 153, 0));
        jrOption1.setText("jRadioButton1");

        jrOption2.setBackground(new java.awt.Color(0, 0, 0));
        jrOption2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrOption2.setForeground(new java.awt.Color(255, 153, 0));
        jrOption2.setText("jRadioButton2");

        jrOption3.setBackground(new java.awt.Color(0, 0, 0));
        jrOption3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrOption3.setForeground(new java.awt.Color(255, 153, 0));
        jrOption3.setText("jRadioButton3");

        jrOption4.setBackground(new java.awt.Color(0, 0, 0));
        jrOption4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrOption4.setForeground(new java.awt.Color(255, 153, 0));
        jrOption4.setText("jRadioButton4");

        lblQno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 102, 0));
        lblQno.setText("Question No.");

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(204, 102, 0));
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 102, 0));
        jButton2.setText("PREVIOUS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 102, 0));
        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 0));
        jButton4.setText("DONE");

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 153, 0));
        lblUserName.setText("jLabel3");

        jcLogOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcLogOut.setForeground(new java.awt.Color(255, 153, 0));
        jcLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jcLogOut.setText("LogOut");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblQno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(71, 71, 71)
                        .addComponent(jButton4)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jrOption3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrOption4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jrOption1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrOption2))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(lblTitle)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcLogOut)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(jcLogOut))
                .addGap(36, 36, 36)
                .addComponent(lblTitle)
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption1)
                    .addComponent(jrOption2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption3)
                    .addComponent(jrOption4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(btnNext))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
      String choosenAnswer=getUserAnswer();
      if(choosenAnswer!=null){
      QuestionPojo question=qstore.getQuestion(pos);
      String correctAnswer=question.getCorrect_answer();
      AnswerPojo newAnswer=new AnswerPojo(exam.getExamId(),exam.getLanguage(),qno,choosenAnswer,correctAnswer);
      System.out.println(newAnswer);
      AnswerPojo answer=astore.getAnswerByQno(qno);
      if(answer==null)
          astore.addAnswer(newAnswer);
      else{
      if(newAnswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
      int apos=astore.removeAnswer(answer);
      astore.setAnswerAt(apos, newAnswer);
      }
      pos--;
      if(pos<0){
      pos=qstore.getCount()-1;
      }
      qno--;
      if(qno<=0)
          qno=qstore.getCount();
      lblQno.setText("Question no:"+qno);
      showQuestion();
      }
      
      
      }
      
    }//GEN-LAST:event_btnNextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jcLogOut;
    private javax.swing.JRadioButton jrOption1;
    private javax.swing.JRadioButton jrOption2;
    private javax.swing.JRadioButton jrOption3;
    private javax.swing.JRadioButton jrOption4;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
 public void loadQuestion(){
 try{
 ArrayList<QuestionPojo> questionList=QuestionDao.getQuestionByExamId(exam.getExamId());
 for(QuestionPojo obj:questionList){
 qstore.addQuestion(obj);
 }
 
 }catch(SQLException ex){
 JOptionPane.showMessageDialog(null,"Error while connecting to DB","Exception!",JOptionPane.ERROR_MESSAGE);
 ex.printStackTrace();
 }
 
 }
 public void showQuestion(){
 QuestionPojo question=qstore.getQuestion(pos);
 buttonGroup1.clearSelection();
 txtQuestion.setText(question.getQuestions());
 jrOption1.setText(question.getAnswer1());
 jrOption2.setText(question.getAnswer2());
 jrOption3.setText(question.getAnswer3());
 jrOption4.setText(question.getAnswer4());
 AnswerStorePojo answerStore=new AnswerStorePojo();
 AnswerPojo answer=answerStore.getAnswer(pos);
 if(answer==null)
     return;
 String ChoosenAnswer=answer.getChosenAnswer();
 switch(ChoosenAnswer)
 {
     case "Answer1":
     jrOption1.setSelected(true);
     break;
     case "Answer2":
     jrOption2.setSelected(true);
     break;
     case "Answer3":
     jrOption3.setSelected(true);
     break;
     case "Answer4":
     jrOption4.setSelected(true);
     break;
 
 }
 } 
 public String getUserAnswer(){
 if(jrOption1.isSelected())
     return "Answer1";
 else if(jrOption2.isSelected())
     return "Answer2";
 else if(jrOption3.isSelected())
     return "Answer3";
 else if(jrOption4.isSelected())
     return "Answer4";
 else
     return null;
 

 

 

 
 
 
 }




}
