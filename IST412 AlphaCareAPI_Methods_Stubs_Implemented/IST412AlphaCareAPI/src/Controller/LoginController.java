package Controller;

import View.LoginUI;
import Model.UserList;

/**
 *
 * @author jxw5640
 */
public class LoginController {
    
    private UserList theUserList;
    private LoginUI theLoginUI;
    private SignUpController theSignUpController;
    private MenuController theMenuController;

    /**
     * This is the default constructor for the LoginController that launches the LoginUI.
     */
    public LoginController(){
        theLoginUI = new LoginUI();
        theLoginUI.setVisible(true);
    }
    
    /**
     * This sets the current UI invisible and requests the controller for sign up UI.
     */
    public void requestSignUpController(){
         theLoginUI.setVisible(false);
         theSignUpController = new SignUpController();
    }
    
    /**
     * This sets the current UI invisible and requests the controller for the menu UI. 
     */
    public void requestMenuController(){
        theLoginUI.setVisible(false);
        theMenuController = new MenuController();
    }
    
    /**
     * This requests the authenticate function that checks if the username and password exists in the user list.
     * @param usernameToCheck represents the username to check.
     * @param passwordToCheck represents the password to check.
     * @return a boolean representing the result of checking. 
     */
    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck){
        boolean authenticated = false;
        return authenticated;
    }
    
}
