/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.LoginController;
import Model.User;
import View.SignUpUI;
import Model.UserList;
import javax.swing.JOptionPane;

/**
 *
 * @author jxw5640
 */
public class SignUpController {
    
    private SignUpUI theSignUpUI;
    private UserList theUserList;
    private LoginController theLoginController;
    
    /**
     * This is the default constructor of the SignUpController that launches the SignUpUI.
     */
    public SignUpController(){
        theSignUpUI = new SignUpUI();
        theSignUpUI.setVisible(true);
    }
    
    /**
     * This sets the current UI to invisible and requests the LoginController for the Login UI.
     */
    public void requestLoginCntl(){
        theSignUpUI.setVisible(false);
        theLoginController = new LoginController();
    }
    
    /**
     * This first checks if the username is already taken, and then lets the user to create a new account with the combination of username and password and then add this object to the user list. 
     * @param username represents the username to be used for the user
     * @param password represents the password to be used for the user
     */
    public void signUp(String username, char[] password){
        if (theUserList.ContainsUsername(theUserList.getUserList(), username)) {
            JOptionPane.showMessageDialog(null, "The Username is used");
        } else {
            long userID = (theUserList.getUserList().size());
            theUserList.getUserList().add(new User(username, password, userID));
            requestLoginCntl();
        }
    }
    
}
