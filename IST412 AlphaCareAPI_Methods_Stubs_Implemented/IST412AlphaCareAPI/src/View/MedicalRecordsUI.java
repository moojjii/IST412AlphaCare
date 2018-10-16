/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MedicalRecordsController;
import javax.swing.JFrame;

/**
 *
 * @author jxw5640
 */
public class MedicalRecordsUI extends JFrame{
    private MedicalRecordsController parentMedicalRecordsController = null;
    
    /**
     * This is the default constructor for the MedicalRecordsUI.
     */
    public MedicalRecordsUI(){
        
    }
    
    /**
     * This is the overloaded constructor for creating the MedicalRecordsUI with association to the MedicalRecordsController.
     * @param parentMedicalRecordsController represents the MedicalRecordsController.
     */
    public MedicalRecordsUI(MedicalRecordsController parentMedicalRecordsController){
        this.parentMedicalRecordsController = parentMedicalRecordsController;
    }
}
