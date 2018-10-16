/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MedicalRecords;
import View.MedicalRecordsUI;

/**
 *
 * @author jxw5640
 */
public class MedicalRecordsController {
    private MenuController theMenuController;
    private MedicalRecordsUI theMedicalRecordsUI;
    private MedicalRecords theMedicalRecords;
    
    /**
     * This is the default constructor for the MedicalRecordsController that launches the MedicalRecordsUI.
     */
    public MedicalRecordsController(){
        theMedicalRecordsUI = new MedicalRecordsUI();
        theMedicalRecordsUI.setVisible(true);
    }
    
    /**
     * This sets the current UI to invisible and requests the MenuController for the MenuUI.
     */
    public void requestMenuController(){
        theMedicalRecordsUI.setVisible(false);
        theMenuController = new MenuController();
    }
    
    /**
     * This searches through the medical records with the specific keyword.
     * @param keyword represents the specific keyword used to search through records.
     */
    public void searchMedicalRecord(String keyword){
        
    }
    
    /**
     * This adds a new medical record to the dataset.
     * @param newMedicalRecords represents the medical record to be added into the dataset.
     */
    public void newRecord(MedicalRecords newMedicalRecords){
        theMedicalRecords.getMedicalRecordsList().add(newMedicalRecords);
    }
    
    /**
     * This updates an existing medical record in the dataset.
     * @param row represents the position of the modified medical records in the dataset. 
     * @param updateMedicalRecords represents the medical record to be updated in the dataset.
     */
    public void updateRecord(int row, MedicalRecords updateMedicalRecords){
        theMedicalRecords.getMedicalRecordsList().set(row, updateMedicalRecords);
    }
    
    /**
     * This deletes an existing medical record from the dataset.
     * @param row represents the position of the medical records for deletion in the dataset.
     */
    public void deleteRecord(int row){
        theMedicalRecords.getMedicalRecordsList().remove(row);
    }
}   
    
