/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.MedicalRecordsController;
import Controller.InsuranceInfoController;
import Controller.LoginController;
import View.MenuUI;

/**
 *
 * @author jxw5640
 */
public class MenuController {
    private MenuUI theMenuUI;
    private InsuranceInfoController theInsuranceInfoConroller;
    private MedicalRecordsController theMedicalRecordsController;
    private LoginController theLoginController;
    
    /**
     * This is the default constructor for the MenuController that launches the MenuUI.
     */
    public MenuController(){
        theMenuUI = new MenuUI();
        theMenuUI.setVisible(true);
    }
    
    /**
     * This sets the current UI to invisible and requests the InsuranceInfoController for the InsuranceInfoUI.
     */
    public void requestInsuranceInfoController(){
        theMenuUI.setVisible(false);
        theInsuranceInfoConroller = new InsuranceInfoController();
    }
    
    /**
     * This sets the current UI to invisible and requests the MedicalRecordsController for the MedicalRecordsUI.
     */
    public void requestMedicalRecordsController(){
        theMenuUI.setVisible(false);
        theMedicalRecordsController = new MedicalRecordsController();
    }   
    
    /**
     * This sets the currentUI to invisible and requests the LoginController for the LoginUI.
     */
    public void requestLoginController(){
        theMenuUI.setVisible(false);
        theLoginController = new LoginController();
    }
}
