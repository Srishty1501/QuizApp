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
public class UsersProfilePojo {
 private static String userId;
 private static String usertype;

   // public UsersProfilePojo() {
    //}

    public UsersProfilePojo() {
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        UsersProfilePojo.userId = userId;
    }

    public static String getUsertype() {
        return usertype;
    }

    public static void setUsertype(String usertype) {
        UsersProfilePojo.usertype = usertype;
    }
    
 
}
