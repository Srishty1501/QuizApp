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
public class UsersPojo {
    private String userId;
    private String password;
    private String usertype;

    public UsersPojo() {
    }

    public UsersPojo(String userId, String password, String usertype) {
        this.userId = userId;
        this.password = password;
        this.usertype = usertype;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    
    
}
