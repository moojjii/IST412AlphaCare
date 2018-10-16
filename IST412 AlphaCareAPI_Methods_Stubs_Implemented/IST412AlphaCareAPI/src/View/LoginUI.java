/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;
import javax.swing.JFrame;

/**
 *
 * @author jxw5640
 */
public class LoginUI extends JFrame{
    
    private LoginController parentLoginController = null;
    
/**
 * This is the default constructor for the LoginUI.
 */
    public LoginUI(){
        
    }
    
 /**
 * This is the overloaded constructor for the LoginUI with association to the LoginController.
     * @param parentLoginController represents the LoginController.
 */
    public LoginUI(LoginController parentLoginController){
        this.parentLoginController = parentLoginController;
    }
    
}
