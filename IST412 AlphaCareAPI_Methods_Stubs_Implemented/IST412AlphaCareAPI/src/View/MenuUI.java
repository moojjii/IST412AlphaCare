/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MenuController;
import javax.swing.JFrame;

/**
 *
 * @author jxw5640
 */
public class MenuUI extends JFrame{
    private MenuController parentMenuController = null;
    
    /**
     * This is the default constructor for the MenuUI.
     */
    public MenuUI(){
        
    }
    
    /**
     * This is the overloaded constructor for creating the MenuUI with association to the MenuController.
     * @param parentMenuController represents the MenuController.  
     */
    public MenuUI(MenuController parentMenuController){
        this.parentMenuController = parentMenuController;
    }
}
