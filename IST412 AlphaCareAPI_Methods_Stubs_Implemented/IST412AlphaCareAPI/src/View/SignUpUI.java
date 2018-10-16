/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SignUpController;
import javax.swing.JFrame;

/**
 *
 * @author jxw5640
 */
public class SignUpUI extends JFrame{
    private SignUpController parentSignUpController = null;
    
/**
 * This is the default constructor for the SignUpUI.
 */
    public SignUpUI(){
        
    }
    
    /**
     * This is the overloaded constructor for creating the SignUpUI with association to the SignUpController.
     * @param parentSignUpController represents the SignUpController.
     */
    public SignUpUI(SignUpController parentSignUpController){
        this.parentSignUpController = parentSignUpController;
    }
    
}
