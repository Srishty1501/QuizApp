/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineExam.pojo;

import java.util.ArrayList;

/**
 *
 * @author SRISHTY RANI
 */
public class AnswerStorePojo {
    ArrayList<AnswerPojo> answerList;

    public AnswerStorePojo() {
        answerList=new ArrayList<>();//yhan constructor nhi bhi bnaye to chlega
    }
    public void addAnswer(AnswerPojo answer){
    answerList.add(answer);
    }
    public  AnswerPojo getAnswer(int pos){
    return answerList.get(pos);
    }
    public void removeAnswer(int pos){
     answerList.remove(pos);
}
    public void setAnswerAt(int pos, AnswerPojo answer){
    answerList.add(pos,answer);//isko call krne k phle removeAnswer ko call krenge coz aisa nhi kiya to previous answer shift ho jayega niche
    }
    public ArrayList<AnswerPojo> getAllAnswer(){
        return answerList;//done yhan loop lgayega ek ek onject uthayega aur compare rega right answer and us hisab se increment decrement krega
    }
    public int getCount(){
    return answerList.size();
    }
    public AnswerPojo getAnswerByQno(int qno){
    for(AnswerPojo answer:answerList){
    if(answer.getQno()==qno)
        return answer;
    
    }
    return null;
    }
    public int removeAnswer(AnswerPojo answer){
    int pos=answerList.indexOf(answer);
    answerList.remove(pos);
    return pos;
    }
}
