/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.InsuranceInfo;
import View.InsuranceInfoUI;
import java.util.ArrayList;

/**
 *
 * @author jxw5640
 */
public class InsuranceInfoController {
    private InsuranceInfoUI theInsuranceInfoUI;
    private MenuController theMenuController;
    private ArrayList<InsuranceInfo> theListOfInsuranceInfo;
    private InsuranceInfo theInsuranceInfo;
        
    /**
     * This is the default constructor of the InsuranceInfoController that launches the InsuranceInfoUI.
     */
    public InsuranceInfoController(){
        theInsuranceInfoUI = new InsuranceInfoUI();
        theInsuranceInfoUI.setVisible(true);
    }
    
    /**
     * This sets the current UI to invisible and requests the MenuController for the MenuUI.
     */
    public void requestMenuControler(){
        theInsuranceInfoUI.setVisible(false);
        theMenuController = new MenuController();
    }
    
    /**
     * This searches a particular patient's insurance information with a given patient's name
     * @param name represents the patient's name used to search for according insurance information
     * @return this function returns the insurance information from the dataset.
     */
    public InsuranceInfo searchInsuranceInfo(String name){
        theListOfInsuranceInfo =  theInsuranceInfo.getInsuranceInfoList();
        InsuranceInfo tempInsuranceInfo = null;
    for (InsuranceInfo insuranceInfo : theListOfInsuranceInfo) {
        if (insuranceInfo.getName().equalsIgnoreCase(name)) {
            tempInsuranceInfo = insuranceInfo;
        }
    } 
    return tempInsuranceInfo;
}

    }

