/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jxw5640
 */



public class User {
private long userID;
private String username;
private char[] password;

/**
 * This is the default constructor for the User class
 */
public User(){
    
}

/**
 * This is the constructor for the User class that builds user with String username, char[] password and long userID;
     * @param username represents the username for the user.
     * @param password represents the password for the user.
     * @param userID represents the userID for the user.
 */
public User(String username, char[] password, long userID){
    this.username = username;
    this.password = password;
    this.userID = userID;
}

/**
 * Returns the user ID for this user.
 * @return a long representing the user ID for this user.
 */
public long getUserID(){
    
    return userID;
}

/**
 * Returns the username for this user.
 * @return a String representing the username for this user.
 */
public String getUsername(){
    
    return username;
}

/**
 * Returns the password for this user.
 * @return a char[] representing the password for this user.
 */
public char[] getPassword(){
    
    return password;
}
        
}
