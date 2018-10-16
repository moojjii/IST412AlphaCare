/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jxw5640
 */
public class MedicalRecords {
    private String name;
    private Date date;
    private String description;
    private String locationOfTreatment;
    private ArrayList<MedicalRecords> theListOfMedicalRecords;
    
    /**
     * This is the default constructor for the MedicalRecords class.
     */
    public MedicalRecords(){
        
    }
    /**
     * This returns the name for the patient.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * This returns the date when patient was treated.
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * This returns the description of patient's treatment.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This returns the location where the patient was treated.
     * @return the locationOfTreatment
     */
    public String getLocationOfTreatment() {
        return locationOfTreatment;
    }
    
    /**
    * This returns the list of medical records for this class. 
     * @return an ArrayList representing the list of medical records for this MedicalRecordsList. 
    */
    public ArrayList getMedicalRecordsList(){
        return theListOfMedicalRecords;
    }
    
    
}
