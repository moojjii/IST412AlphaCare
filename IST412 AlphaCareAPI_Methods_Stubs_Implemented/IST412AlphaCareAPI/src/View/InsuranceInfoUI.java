/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.InsuranceInfoController;
import javax.swing.JFrame;

/**
 *
 * @author jxw5640
 */
public class InsuranceInfoUI extends JFrame{
    private InsuranceInfoController parentInsuranceInfoController = null;
    
    /**
     * This is the default constructor for the InsuranceInfoUI.
     */
    public InsuranceInfoUI(){
        
    }
    
    
    /**
     * This is the overloaded constructor to build the UI with association with the InsuranceInfoController.
     * @param parentInsuranceInfoController represents the InsuranceInfoController. 
     */
    public InsuranceInfoUI(InsuranceInfoController parentInsuranceInfoController){
        this.parentInsuranceInfoController = parentInsuranceInfoController;
    }
}
