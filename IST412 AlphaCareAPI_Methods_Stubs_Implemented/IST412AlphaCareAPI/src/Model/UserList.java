/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.User;
import java.util.ArrayList;

/**
 *
 * @author jxw5640
 */


public class UserList {
    
    private ArrayList<User> theListOfUsers;
    private String currentUsername;
    
/**
 * This is the default constructor for the UserList class.
 */
    public UserList(){

    }

/**
 * This returns the list of users for this class. 
 * @return an ArrayList representing the list of users for this userList. 
 */
    public ArrayList getUserList(){
        return theListOfUsers;
    }
    
    /**
     * checks if the username and password exist in the user list.
     * @param username represents the username to check
     * @param password represents the password to check
     * @return this method returns a boolean value representing the result for the authentication.
     */
    public boolean authenticate(String username, char[] password){
        boolean authenticated = false;
        boolean nameMatch = false;
        boolean passwordMatch = false;
        for (int i = 0; i < theListOfUsers.size(); i++) {
            nameMatch = username.equals(theListOfUsers.get(i).getUsername());
            passwordMatch = String.valueOf(password).equals(String.valueOf(theListOfUsers.get(i).getPassword()));
            if (nameMatch && passwordMatch) {
                authenticated = true;
                currentUsername = username;
                break;
            }
        }
        return authenticated;
    }
    
    /**
     * This checks if a username exists in the user list.
     * @param theListOfUsers represents the list of users
     * @param username represents the username to check
     * @return a boolean value representing the result if a username exists in the list. 
     */
    public boolean ContainsUsername(ArrayList<User> theListOfUsers, String username){
        return false;
    }
    
    /**
     * This returns the username of the current user on the login.
     * @return a String representing the current user on the login.
     */
    public String returnCurrentUsername(){
        return currentUsername;
    }
    
    /**
     * This checks through the user list and returns the user with a specific username.
     * @param username representing the username used to check through the user list.
     * @return a User representing the user with the specific username.
     */
    public User getUserWithUsername(String username){
        User theUser = new User();
        return theUser;
    }
}
